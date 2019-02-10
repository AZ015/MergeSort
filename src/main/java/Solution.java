import Exceptions.IncorrectArgumentException;
import Exceptions.InsufficientlyFilesException;
import Interfaces.ISortArguments;

public class Solution {

    public static void main(String[] args) throws InsufficientlyFilesException, IncorrectArgumentException {
        ParserArgs parserArgs = new ParserArgs();
        ISortArguments sortArguments = parserArgs.parse(args);
        SortFactory factory = new SortFactory();
        factory.sort(sortArguments);

    }


}
