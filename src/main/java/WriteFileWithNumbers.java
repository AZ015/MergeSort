public class WriteFileWithNumbers extends WriteFile<Integer> {
    @Override
    protected String castToString(Integer data) {
        return data.toString();
    }
}
