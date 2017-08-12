package Tencent;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/7/17.
 */
public class MaxDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int num = sc.nextInt();
            int[] data = new int[num];
            for (int i = 0; i < num; i++) {
                data[i] = sc.nextInt();
            }
            Arrays.sort(data);
            if(data.length >2){
                int sNum = 0;
                for (int i = 0; i < data.length; i++) {
                    if(data[i]==data[0])sNum++;
                    else break;
                }
                int bNum = 0;
                for (int i = data.length-1; i >= 0; i--) {
                    if(data[i]==data[data.length])sNum++;
                    else break;
                }
                System.out.print(sNum*bNum);
                int min = Integer.MIN_VALUE;
                for (int i = 1; i < data.length; i++) {
                }
            }
        }
    }
}
