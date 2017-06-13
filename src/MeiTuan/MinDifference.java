package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class MinDifference {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        int n = sc.nextInt();
        int[] seqN = new int[n];
        for (int i = 0; i < n; i++) {
            seqN[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] seqM = new int[m];
        for (int i = 0; i < m; i++) {
            seqM[i] = sc.nextInt();
        }
        long min = Long.MAX_VALUE;
        long temp = 0;
        for (int i = 0; i <= m-n; i++) {
            temp = 0;
            for (int j = 0; j < n; j++) {
                temp += Math.pow(seqM[i+j]-seqN[j],2);
            }
            if(temp < min)min = temp;
        }
        System.out.println(min);
    }
}
