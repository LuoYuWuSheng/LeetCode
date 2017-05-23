package offer;

/**
 * Created by luoyu on 2017/4/5 0005.
 * 少考虑了middl-1=-1的情况
 */
public class GetNumberOfK {
    int from = -1;
    int to = -1;
    int[] array;
    int k;
    public int GetNumberOfK(int [] array , int k){
        this.array = array;
        this.k = k;
        binarySearch(0,array.length-1);
        if(from != -1)return to - from +1;
        else return 0;
    }
    public void  binarySearch(int start,int end){
        if(start <= end) {
            int middle = (start + end) / 2;
            if (middle == k) {
                if(middle -1 == -1)this.from = middle;
                if(middle +1 == array.length)this.to = middle;
                if (middle - 1 > -1 && array[middle - 1] != k) this.from = middle;
                if (middle + 1 < array.length && array[middle + 1] != k) this.to = middle;
            }
            binarySearch(start,middle-1);
            binarySearch(middle+1,end);
        }
    }
}
