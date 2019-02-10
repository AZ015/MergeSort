import Interfaces.ISortStrngs;

public class MergeSortStrings extends MergeSort<String> implements ISortStrngs {
    @Override
    protected boolean compare(String a, String b) {
        return a.compareTo(b) > 0;
    }


}
