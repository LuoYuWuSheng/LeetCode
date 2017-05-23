package sort;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by luoyu on 2017/4/15 0015.
 */
public class InsertSort {
    int[] data;
    public InsertSort(int[] data){
        this.data = data;
    }
    public void sort(){
        for (int i = 1;i< data.length;i++){
            int key = data[i];
            int j = i;
            while (--j > -1 && data[j] > key){
                data[j+1]= data[j];
            }
            data[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array = {7,6,5,4,3,2,1};
        InsertSort is = new InsertSort(array);
        is.sort();
        System.out.println(Arrays.toString(is.data));
    }
}
