import org.hamcrest.collection.IsIterableContainingInOrder;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.util.List;

public class ReadFileWithNumbersTest {

    @Test
    public void readTest() {
        ReadFile file = new ReadFileWithNumbers();
        List<Integer> iList = file.read(new File("InNumb.txt"));
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(5));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains(10, 234, 1, 3, 2));
    }

    @Test
    public void readTestWithError() {
        ReadFile file = new ReadFileWithNumbers();
        List<Integer> iList = file.read(new File("InNumbError.txt"));
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(2));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains(10, 234));
    }
}
