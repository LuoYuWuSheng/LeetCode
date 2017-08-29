package WangYi;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class NumRing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = sc.nextInt();
        }
        for (int i = 0; i < k; i++) {
            int head = data[0];
            for (int j = 0; j < n; j++) {
                int next = (j+1)%n;
                long temp;
                if(next==0)temp=(data[j]+head)%100;
                else temp= (data[j]+data[next])%100;
                data[j] = (int) temp;
            }
        }
        for (int i = 0; i < n-1; i++) {
            System.out.print(data[i]+" ");
        }
        System.out.println(data[n-1]);
    }
}
