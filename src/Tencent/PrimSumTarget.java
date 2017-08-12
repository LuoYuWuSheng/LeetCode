package Tencent;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 17/7/17.
 */
public class PrimSumTarget {
    public static void main(String[] args) {
        boolean[] prime = new boolean[1001];
        for (int i = 0; i < 1001; i++) {
            prime[i] = true;
        }
        prime[1] = false;
        prime[0] = false;
        for (int i = 2; i < 1000; i++) {
            for (int j = 2; i*j < 1001 ; j++) {
                prime[i*j]=false;
            }
        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        for (int i = 0; i <= n/2 ; i++) {
            if(prime[i] && prime[n-i])result++;
        }
        System.out.println(result);
    }
}
