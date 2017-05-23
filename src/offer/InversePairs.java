package offer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/3 0003.
 */
public class InversePairs {
    long mode = 1000000007;
    long count = 0;
    Integer[] array;

    public static void testInsert(Integer[] test) {
        InversePairs inversePairs = new InversePairs();
        int result = inversePairs.InversePairs(test);
        System.out.println(result);
    }

    public static void testMerge(Integer[] test) {
        another a = new another();
        int result = a.InversePairs(test);
        System.out.println(result);
        System.out.println(Arrays.toString(a.array));
    }

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(new FileInputStream("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<Integer> array = new ArrayList<>();
        assert sc != null;
        while (sc.hasNextInt()) {
            array.add(sc.nextInt());
        }
        Integer[] test = new Integer[0];
        test = array.toArray(test);
        testMerge(test);
    }

    public int InversePairs(Integer[] array) {
        this.array = array;
        insertSort(0, array.length);
        long result = count % mode;
        return (int) result;
    }

    public void insertSort(int start, int end) {
        for (int i = start + 1; i < end; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) exchange(j, j - 1);
            }
        }
    }

    private void exchange(int a, int b) {
        if (a != b) {
            int temp = array[a];
            array[a] = array[b];
            array[b] = temp;
            count++;
        }
    }
}

class another {
    long mode = 1000000007;
    long count = 0;
    Integer[] array;
    Integer[] temp;

    public int InversePairs(Integer[] array) {
        this.array = array;
        this.temp = new Integer[array.length];
        mergeSort(0, array.length - 1);
        long result = count % mode;
        return (int) result;
    }

    public void mergeSort(int start, int end) {
        if (start < end) {
            int middle = (end + start) / 2;
            mergeSort(start, middle);
            mergeSort(middle + 1, end);
            merge(start, middle, end);
        }
    }

    public void merge(int start, int middle, int end) {
        //todo array store exceptino
        //System.arraycopy(array, start, temp, start, end - start + 1);
        for (int i = start; i <= end; i++) {
            temp[i] = array[i];
        }
        int ts = middle, tm = end, index = end;
        while (ts >= start && tm >= middle+1){
            if(temp[ts] > temp[tm]){
                array[index--] = temp[ts--];
                count += (tm-middle);
            }else {
                array[index--] = temp[tm--];
            }
        }
        while (ts >=start) array[index--] = temp[ts--];
        while (tm >= middle+1) array[index--] = temp[tm--];
    }
}
