package LianJia;

import java.util.Scanner;

/**
 * Created by luoyu on 2017/8/19 0019.
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] data = new int[10];
        for (int i = 0; i < 10; i++) {
            data[i]=sc.nextInt();
        }
        int h = sc.nextInt();
        h+=30;
        int result = 0;
        for (int i = 0; i < 10; i++) {
            if(data[i]<=h)result++;
        }
        System.out.println(result);
    }
}
