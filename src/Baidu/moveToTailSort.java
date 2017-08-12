package Baidu;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 23/7/17.
 * todo 理解错题意了，根本不是选择排序.排序，比较当已经合理有序的长度，剩下的都是需要放到后边的。
 */
public class moveToTailSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        int[] copy = new int[num];
        for(int i =0;i< num;i++){
            data[i]=sc.nextInt();
            copy[i]=data[i];
        }
        Arrays.sort(data);
        int index=0;
        for(int i =0;i<copy.length;i++){
            if(data[index]==copy[i]){
                index++;
            }
        }
        System.out.println(data.length-index);
    }
}
