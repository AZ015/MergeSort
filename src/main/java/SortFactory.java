import Interfaces.ISortArguments;
import Interfaces.ISortIntegers;
import Interfaces.ISortStrngs;
import Interfaces.TypeSort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SortFactory {
    private ISortStrngs sortStrngs;
    private ISortIntegers sortIntegers;
    private ParserArgs parserArgs;

    public SortFactory() {
        sortIntegers = new MergeSortIntegers();
        sortStrngs = new MergeSortStrings();
    }

    public void sort(ISortArguments arguments) {
        TypeSort typeSort = arguments.getType();
        if (typeSort == TypeSort.Integers) {
            sortIntegers(arguments);
        } else if (typeSort == TypeSort.Strings) {
            sortStrngs(arguments);
        }
    }

    private void sortIntegers(ISortArguments arguments) {
        ReadFile readFile = new ReadFileWithNumbers();
        WriteFile writeFile = new WriteFileWithNumbers();
        List<Integer> iList = new ArrayList<>();
        iList = readFile.read(new File(arguments.getInFiles()));
        sortIntegers.sort(iList, arguments.isAsc());
        writeFile.write(iList, new File(arguments.getOutFile()));
    }

    private void sortStrngs(ISortArguments arguments) {
        ReadFile readFile = new ReadFileWithStrings();
        WriteFile writeFile = new WriteFileWithStrings();
        List<String> sList = new ArrayList<>();
        sList = readFile.read(new File(arguments.getInFiles()));
        sortStrngs.sort(sList, arguments.isAsc());
        writeFile.write(sList, new File(arguments.getOutFile()));
    }
}


