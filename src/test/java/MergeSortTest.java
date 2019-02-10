import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortTest {


    @Test
    public void testSortIntegersAsc() {
        List<Integer> iList = Arrays.asList(34, 5, 1, 25, 78);
        boolean asc = true;
        MergeSort mergeSort = new MergeSortIntegers();
        mergeSort.sort(iList, asc);
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(5));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains(1,5,25,34,78));
    }

    @Test
    public void testSortIntegersDesc() {
        List<Integer> iList = Arrays.asList(34, 5, 1, 25, 78);
        boolean asc = false;
        MergeSort mergeSort = new MergeSortIntegers();
        mergeSort.sort(iList, asc);
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(5));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains(78, 34,25,5,1));
    }

    @Test
    public void testSortStringsAsc() {
        List<String> iList = Arrays.asList("a", "bb", "aa", "cc", "aaa");
        boolean asc = true;
        MergeSort mergeSort = new MergeSortStrings();
        mergeSort.sort(iList, asc);
        Assert.assertThat(iList, IsNull.notNullValue());
        Assert.assertThat(iList.size(), Is.is(5));
        Assert.assertThat(iList, IsIterableContainingInOrder.contains("a", "aa", "aaa", "bb", "cc"));
    }


}
