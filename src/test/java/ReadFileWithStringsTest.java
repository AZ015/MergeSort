import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class ReadFileWithStringsTest {

    @Test
    public void readTest() {
        ReadFile file = new ReadFileWithStrings();
        List<String> iList = file.read(new File("InString.txt"));
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(4));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains("Hello", "Hell", "Hel", "He"));
    }

    @Test
    public void readTestWithError() {
        ReadFile file = new ReadFileWithStrings();
        List<String> iList = file.read(new File("InStringError.txt"));
        Assert.assertThat(iList, IsNull.notNullValue());
    }
}
