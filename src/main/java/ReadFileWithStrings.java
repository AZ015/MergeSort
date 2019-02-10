import Exceptions.CastException;

public class ReadFileWithStrings extends ReadFile<String> {
    @Override
    protected String cast(String data) throws CastException {
        return data;
    }


}
