import Exceptions.IncorrectArgumentException;
import Exceptions.InsufficientlyFilesException;
import Interfaces.TypeSort;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ParserArgs {
    private TypeSort type;
    private boolean asc = true;
    private List<File> files = new ArrayList<File>();

    public SortArgs parse(String[] args) throws IncorrectArgumentException, InsufficientlyFilesException {

        if (args.length < 2) {
            throw new IncorrectArgumentException();
        }

        for (String param : args) {
            if (param.equals("-d")) {
                asc = false;
            } else if (param.equals("-i")) {
                type = TypeSort.Integers;
            } else if (param.equals("-s")) {
                type = TypeSort.Strings;
            } else if (param.endsWith(".txt")) {
                files.add(new File(param));
            }
        }

        if (files.size() < 2) {
            throw new InsufficientlyFilesException();
        }

        return new SortArgs(files.get(0).toString(), files.get(1).toString(), getType(), asc);
    }

    public TypeSort getType() {
        return type;
    }

    public boolean isAsc() {
        return asc;
    }

    public List<File> getFiles() {
        return files;
    }

}