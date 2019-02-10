import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class WriteFile<T>{

    abstract protected String castToString(T data);

    public void write(List<T> data, File outFileName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outFileName))) {
            for (T s : data) {
                writer.write(castToString(s));
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
