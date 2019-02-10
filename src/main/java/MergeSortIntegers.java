import Interfaces.ISortIntegers;

public class MergeSortIntegers extends MergeSort<Integer> implements ISortIntegers {
    @Override
    protected boolean compare(Integer a, Integer b) {
        return a > b;
    }

}
