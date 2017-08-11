package WangYi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class Cpu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i]=sc.nextInt();
        }
        Arrays.sort(data);
        while (num>2){
            int temp = data[0]+data[1];
            int i=2;
            for (; i < num && data[i]<temp; i++)data[i-2]=data[i];
            data[i-2]=temp;
            for (;i<num;i++)data[i-1]=data[i];
            num--;
        }
        System.out.println(data[1]);
    }
}
