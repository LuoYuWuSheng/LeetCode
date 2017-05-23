package sort;

import java.util.Arrays;

/**
 * Created by luoyu on 2017/4/3 0003.
 */
public class MergeSort {
    int[] data;
    int[] temp;
    public void sort(int data[]){
        this.data = data;
        this.temp = new int[data.length];
        mergeSort(0,data.length-1);
    }

    private void mergeSort(int start,int end){
        if(start < end){
            int middle = (start+end)/2;
            mergeSort(start,middle);
            mergeSort(middle+1,end);
            merge(start,middle,end);
        }
    }

    private void merge(int start,int middle,int end){
        System.arraycopy(data, start, temp, start, end - start+1);
        //System.arraycopy(data, middle, temp, middle, end - middle);
        int j = middle+1;
        int i = start;
        int index = start;
        while (i <= middle && j <= end){
            if(temp[i] < temp[j])data[index++] = temp[i++];
            else data[index++] = temp[j++];
        }
        while (i <= middle)data[index++] = temp[i++];
        while (j <= end)data[index++] = temp[j++];
    }

    public static void main(String[] args) {
        int[] data = {7,6,5,4,3,2,1};
        MergeSort sort = new MergeSort();
        sort.sort(data);
        System.out.println(Arrays.toString(sort.data));
    }
}
