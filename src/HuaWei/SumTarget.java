package HuaWei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/22.
 */
public class SumTarget {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data[] = new int[num];

        for(int i = 0;i<num ;i++){
            data[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        List<Integer> list = new ArrayList();
        int sum = 0;
        int sum5 = 0;
        for(int i = 0;i<num ;i++){
            if(data[i]%3 == 0 && data[i]%5 != 0)sum1+=data[i];
            else if(data[i]%5 == 0){
                sum2 += data[i];
                sum5+=data[i];
            }
            else list.add(data[i]);
            sum += data[i];
        }
        int half = sum /2;
        if(half * 2 != sum)System.out.println("false");
        else{
            int target = half-sum5;
            if(sumTraget(list,0,0,target)) System.out.println("true");
            else System.out.println("false");
        }
    }

    public static boolean sumTraget(List<Integer> list,int index,int sum,int target){
        if(sum==target)return true;
        if(index < list.size()){
            boolean result = false;
            result = sumTraget(list,index+1,sum+list.get(index),target);
            if(result)return result;
            return sumTraget(list,index+1,sum,target);
        }else return false;
    }
}
