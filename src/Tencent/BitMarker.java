package Tencent;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 17/7/17.
 */
public class BitMarker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f = sc.nextInt();
        int s = sc.nextInt();
        if(1>f || 1024<f || 1>s || 1024<s){
            System.out.println(-1);
            return;
        }
        f=f-1;
        s=s-1;
        int[] mark = new int[32];
        int arrIndex = f>>5;
        int bitIndex = f%32;
        mark[arrIndex] |= (0b1 << bitIndex);
        arrIndex = s>>5;
        bitIndex = s%32;
        //todo 这里忽略了int首位1表示负数，而且与后也不止01，所以直接输出是不行的
        if((mark[arrIndex]&(0b1 << bitIndex))!=0)System.out.println(1);
        else System.out.println(0);
    }
}
