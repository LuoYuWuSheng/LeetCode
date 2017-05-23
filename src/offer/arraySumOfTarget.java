package offer;

import java.util.ArrayList;

/**
 * Created by luoyu on 2017/4/12 0012.
 * 没有充分考虑到sum为1的情况
 * 逻辑也存在错误，while（length > 1）使得length =1的情况也被加入到result
 */
public class arraySumOfTarget {
    public ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> result = new ArrayList();
        if(sum < 0)return result;
        int length = 0;
        int head = 1;
        int tail = 0;
        int tempSum = 0;
        while(tempSum < sum){
            tail++;
            tempSum += tail;
            length++;
            if(tempSum == sum)result.add(addRes(head,tail));
        }
        while(--length > 1){
            tempSum-=head;
            head++;
            while(tempSum < sum){
                tail++;
                tempSum+=tail;
                tempSum-=head;
                head++;
            }
            if(tempSum == sum )result.add(addRes(head,tail));
        }
        return result;
    }
    ArrayList<Integer> addRes(int head,int tail){
        ArrayList<Integer> result = new ArrayList();
        for(int i = head;i<= tail;i++){
            result.add(i);
        }
        return result;
    }
}
