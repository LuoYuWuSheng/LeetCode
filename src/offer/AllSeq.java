package offer;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/22.
 */
public class AllSeq {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data[] =  new int[num];
        for(int i = 0;i<num;i++){
            data[i] = sc.nextInt();
        }
        Arrays.sort(data);
        show(data,0);
    }
    public static void show(int[] data,int index){
        if(index == data.length)print(data);
        for(int i = index;i<data.length;i++) {
            int temp = data[index];
            data[index] = data[i];
            data[i] = temp;
            show(data,index+1);
            
        }
    }
    public static void print(int[] data){
        for(int i =0 ;i< data.length;i++)System.out.print(data[i]+" ");
        System.out.println();
    }

}
