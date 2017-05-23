package offer;

import java.util.ArrayList;

/**
 * Created by luoyu on 2017/4/23 0023.
 */
public class FindNumsAppearOnce {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int result = 0;
        for(int i =0 ;i< array.length;i++){
            result ^= array[i];
        }
        int markNum = mark(result);
        ArrayList<Integer> t1 = new ArrayList();
        ArrayList<Integer> t2 = new ArrayList();
        for(int i =0 ;i< array.length;i++){
            if((array[i] & markNum) == 0)t1.add(array[i]);
            else t2.add(array[i]);
        }
        int rs = 0;
        for(int one : t1){
            rs ^= one;
        }
        num1[0] = rs;
        rs =0;
        for(int one : t2){
            rs ^= one;
        }
        num2[0] = rs;
    }

    private int mark(int input){
        int temp = 0x1;
        while((input & temp) == 0){
            temp <<= 1;
        }
        return temp;
    }
}
