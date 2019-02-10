import Interfaces.ISortArguments;
import Interfaces.TypeSort;

public class SortArgs implements ISortArguments {
    private String fileOutputName;
    private String fileInputName;
    private TypeSort type;
    private boolean asc;


    public SortArgs(String fileOutputName, String fileInputName, TypeSort type, boolean asc) {
        this.fileOutputName = fileOutputName;
        this.fileInputName = fileInputName;
        this.type = type;
        this.asc = asc;
    }

    @Override
    public String getOutFile() {
        return fileOutputName;
    }

    @Override
    public String getInFiles() {
        return fileInputName;
    }

    @Override
    public boolean isAsc() {
        return asc;
    }

    @Override
    public TypeSort getType() {
        return type;
    }
}
