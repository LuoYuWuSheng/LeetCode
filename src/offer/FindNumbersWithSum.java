package offer;

import java.util.ArrayList;

/**
 * Created by luoyu on 2017/4/24 0024.
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
        int tempSum;
        int multi = 0;
        int res1=0,res2=0;
        int first = 0;
        int second = array.length-1;
        ArrayList<Integer> result = new ArrayList();
        while(first < second){
            tempSum = array[first]+array[second];
            if(tempSum == sum){
                if(multi == 0){
                    multi = array[first]*array[second];
                    res1 = first;
                    res2 = second;
                }else if((array[first] * array[second]) < multi){
                    multi = array[first]*array[second];
                    res1 = first;
                    res2 = second;
                }
                first++;
            }else if(tempSum > sum){
                second--;
            }else first++;
        }
        if(multi != 0){
            result.add(array[res1]);
            result.add(array[res2]);
        }
        return result;
    }
}
