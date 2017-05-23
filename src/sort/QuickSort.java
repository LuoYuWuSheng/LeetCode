package sort;

/**
 * Created by luoyu on 2017/3/14 0014.
 */
public class QuickSort {

    int[] data;

    public void quickSort(int start, int end) {
        if (start < end) {
            int middle = myPartition(start, end);
            quickSort(start, middle - 1);
            quickSort(middle + 1, end);
        }
    }

    private int Partition(int start, int end) {
        int small = start - 1;
        for (int index = start; index < end; index++) {
            if (data[index] <= data[end]) {
                small++;
                if (small != index) exchange(small, index);
            }
        }
        small++;
        exchange(small, end);
        return small;
    }

    private int myPartition(int start, int end) {
        while (start < end) {
            data[0] = start;
            while (data[start] < data[0]) start++;
            while (data[end] > data[0]) end--;
            exchange(start, end);
        }
        data[start] = data[0];
        return start;
    }

    private void exchange(int i, int j) {
        int temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }

    public void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]);
        }
    }

    public static void main(String[] args) {
        int[] temp = {0, 1, 7, 5, 6, 4, 2, 3};
        QuickSort sort = new QuickSort();
        sort.data = temp;
        sort.quickSort(0, temp.length - 1);
        sort.print();
    }
}
