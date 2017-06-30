package HuaWei;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/30.
 */
public class SingQueue {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] array = new int[num];
        for(int i =0;i<num;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        //至少三人才能成队形
        int result = 0;
        int left = 0;
        int right = 0;
        List<Integer> leftQ = new LinkedList<>();
        List<Integer> rightQ = new LinkedList<>();
        //boolean putL = true;
        for(int i = 0;i<array.length;i++){
            if(left <array[i]){
                left = array[i];
                //putL = false;
                leftQ.add(left);
            }else if(right < array[i]){
                right = array[i];
                //putL = true;
                rightQ.add(right);
            }else result++;
        }
        System.out.println(result);
        for (int one : leftQ) {
            System.out.print(one + " ");
        }
        System.out.println();
        for (int one : rightQ) {
            System.out.print(one + " ");
        }
    }
}
