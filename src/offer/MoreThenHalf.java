package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luoyu on 2017/3/31 0031.
 */
public class MoreThenHalf {
    Map<Integer,Integer> map = new HashMap();
    public int MoreThanHalfNum_Solution(int [] array) {
        for(int i = 0;i< array.length;i++){
            Integer num = map.get(array[i]);
            if(num == null)map.put(array[i],1);
            else{
                num++;
                map.put(array[i],num);
            }
        }
        for(Map.Entry<Integer,Integer> one : map.entrySet()){
            if(one.getValue() > array.length/2)return one.getKey();
        }
        return 0;
    }
}
