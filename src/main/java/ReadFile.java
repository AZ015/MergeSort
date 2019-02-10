import Exceptions.CastException;
import Exceptions.FileEmptyExceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

abstract public class ReadFile<T> {


    abstract protected T cast(String data) throws CastException;

    public List<T> read(File file) {
        List<T> data = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            if (file.length() == 0) {
                throw new FileEmptyExceptions();
            }
            String inData = "";
            while ((inData = reader.readLine()) != null) {
                data.add(cast(inData));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileEmptyExceptions fileEmptyExceptions) {
            fileEmptyExceptions.printStackTrace();
        } catch (CastException e) {
            e.printStackTrace();
        }

        return data;
    }


}
