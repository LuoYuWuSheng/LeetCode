package WangYi;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class Graph {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, walkTime, taxiTime, gx, gy;
        n = sc.nextInt();
        int[][] txy = new int[n][2];
        for (int i = 0; i < n; i++) txy[i][0] = sc.nextInt();
        for (int i = 0; i < n; i++) txy[i][1] = sc.nextInt();
        gx=sc.nextInt();
        gy = sc.nextInt();
        walkTime = sc.nextInt();
        taxiTime = sc.nextInt();
        int result =(Math.abs(gx)+Math.abs(gy))*walkTime;
        int temp=0;
        for (int i = 0; i < n; i++) {
            temp=0;
            temp+=(Math.abs(gx-txy[i][0])+Math.abs(gy-txy[i][1]))*taxiTime;
            temp+=(Math.abs(txy[i][0])+Math.abs(txy[i][1]))*walkTime;
            if(temp<result)result=temp;
        }
        System.out.println(result);
    }
}
