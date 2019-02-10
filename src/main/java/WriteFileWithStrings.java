public class WriteFileWithStrings extends WriteFile<String> {
    @Override
    protected String castToString(String data) {
        return data;
    }
}
