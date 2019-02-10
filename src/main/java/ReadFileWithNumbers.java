import Exceptions.CastException;

public class ReadFileWithNumbers extends ReadFile<Integer> {
    @Override
    protected Integer cast(String data) throws CastException {
        try {
            return Integer.parseInt(data);
        } catch (NumberFormatException e) {
            throw new CastException();
        }
    }
}
