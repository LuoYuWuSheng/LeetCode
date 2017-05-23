package offer;

/**
 * Created by luoyu on 2017/2/8 0008.
 */
public class reOrderArray {

    public void reOrderArray(int [] array) {
        int temp;
        int num = 0;
        int j;
        for (int i = 0; i < array.length; i++) {
            if(array[i]%2 ==1){
                temp = array[i];
                for (j = i ; j > i-num; j--) {
                    array[j] = array[j-1];
                }
                array[j]=temp;
            }else {
                num++;
            }
        }
    }
}
