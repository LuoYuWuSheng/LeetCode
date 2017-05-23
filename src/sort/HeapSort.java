package sort;

import java.util.Arrays;

/**
 * Created by luoyu on 2017/3/14 0014.
 */
public class HeapSort {
    int[] data;
    int length;

    private int right(int i) {
        return 2*(i+1);
        //if (i == 0) return 2;
        //else return 2 * i + 1;
    }

    private int left(int i) {
        return 2*(i+1)-1;
        //if (i == 0) return 1;
        //else return 2 * i;
    }

    private void exchange(int i, int j) {
        if (i != j) {
            int temp;
            temp = data[i];
            data[i] = data[j];
            data[j] = temp;
        }
    }

    private void build() {
        for (int i = data.length / 2; i > -1; i--) {
            maxHeapify(i);
        }
    }

    private void maxHeapify(int parent) {
        int l, r;
        l = left(parent);
        r = right(parent);
        int maxIndex = parent;
        if (r < length && data[maxIndex] < data[r]) maxIndex = r;
        if (l < length && data[maxIndex] < data[l]) maxIndex = l;
        if(parent != maxIndex) {
            exchange(parent, maxIndex);
            maxHeapify(maxIndex);
        }
    }

    public void sort() {
        int head = 0;
        build();
        for (int i = head; i < data.length; i++) {
            int temp = data[head];
            data[head] = data[data.length - i-1];
            data[data.length - i-1] = temp;
            length--;
            maxHeapify(head);
        }
        print();
    }

    public void print() {
        System.out.println(Arrays.toString(data));
    }

    public static void main(String[] args) {
        HeapSort sort = new HeapSort();
        int[] temp = {0, 7, 6, 5, 4, 3, 2, 1};
        sort.data = temp;
        sort.length = sort.data.length;
        sort.sort();
    }
}
