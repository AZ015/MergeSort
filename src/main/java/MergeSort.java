import java.util.ArrayList;
import java.util.List;

abstract public class MergeSort<T extends Comparable<T>> {

    abstract protected boolean compare(T a, T b);

    public void sort(List<T> values, boolean asceding) {
        mergeSort(0, values.size() - 1, values, new ArrayList<T>(values), asceding);
    }

    private void mergeSort(int low, int high, List<T> values, List<T> aux, boolean asceding) {

        if(low < high){
            int mid = low + (high - low) / 2;
            mergeSort(low, mid, values, aux, asceding);
            mergeSort(mid+1, high, values, aux, asceding);
            merge(low, mid, high, values, aux, asceding);
        }
    }

    private void merge(int low, int mid, int high, List<T> values, List<T> aux, boolean asceding) {

        int left = low;
        int right = mid + 1;

        for(int i = low; i <= high; i++){
            aux.set(i, values.get(i));
        }

        while(left <= mid && right <= high){
            values.set(low++, asceding == !(compare(aux.get(left), aux.get(right)))  ? aux.get(left++) : aux.get(right++));
        }

        while(left <= mid){
            values.set(low++, aux.get(left++));
        }
    }
}
