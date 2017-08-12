package sort;

/**
 * Computer user luoyu
 * Created by 张洋 on 21/7/17.
 */
public class RevPair {

    long result = 0;

    void mergeSort(int[] a, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(a, start, middle);
            mergeSort(a, middle + 1, end);
            merge(a, start, middle + 1, end);
        }

    }

    void merge(int[] a, int start, int middle, int end) {
        int[] temp = new int[a.length];
        //System.arraycopy(a,temp,0,0,temp.length);
        for (int i = start; i <= end; i++) {
            temp[i] = a[i];
        }
        int tempMiddle = middle;
        int i = start;
        for (; start < tempMiddle && middle <= end; i++) {
            //todo 少考虑了相等的情况，导致把相等的也算作逆序对
            if (temp[start] <= temp[middle]) {
                a[i] = temp[start++];
            } else {
                result += (tempMiddle - start);
                a[i] = temp[middle++];
            }
        }
        while (start < tempMiddle) a[i++] = temp[start++];
        while (middle < end) a[i++] = temp[middle++];
    }

    public long reversePairs(int[] A) {
        // Write your code here
        result = 0;
        mergeSort(A, 0, A.length - 1);
        return result;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 1, 55, 6, 4, 7, 3, 0};
        RevPair test = new RevPair();
        test.reversePairs(a);
    }
}
