import org.hamcrest.core.Is;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class WriteFileWithNumbersTest {

    @BeforeClass
    public static void init() {
        System.out.println("Init testCase");
    }

    @AfterClass
    public static void end() {
        System.out.println("Test is completed");
    }

    @Test
    public void castToStringTest() {
        WriteFileWithNumbers fileWithNumbers = new WriteFileWithNumbers();
        String result = fileWithNumbers.castToString(12);
        Assert.assertThat(result, Is.is("12"));
        System.out.println("Cast Integer to String is completed");
    }


}
