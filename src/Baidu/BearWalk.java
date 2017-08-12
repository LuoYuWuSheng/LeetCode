package Baidu;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 23/7/17.
 */
public class BearWalk {
    static int small = Integer.MAX_VALUE;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        for(int i =0;i<num;i++){
            data[i]=sc.nextInt();
        }
        if(num >2){
            for(int i=1;i<num-1;i++){
                calc(data,i);
            }
            System.out.println(small);
        }else if(num ==2){
            System.out.println(Math.abs(data[num-1]-data[0]));
        }
    }
    public static void calc(int[] data ,int ig){
        int tempSmall = 0;
        for(int i =1;i<data.length;i++){
            if(ig==i){
                i++;
                tempSmall += Math.abs(data[i]-data[i-2]);
            }else{
                tempSmall += Math.abs(data[i]-data[i-1]);
            }
        }
        if(tempSmall<small)small = tempSmall;
    }
}
