import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class WriteFileWithStringsTest {

    @Test
    public void writeTest() throws IOException {
        WriteFile writeFile = new WriteFileWithStrings();
        List<String> sList = Arrays.asList("a", "zz", "A", "aa", "ss");
        File file = new File("WriteTest.txt");
        writeFile.write(sList, file);
        Assert.assertThat(file, IsNull.notNullValue());
    }
}
