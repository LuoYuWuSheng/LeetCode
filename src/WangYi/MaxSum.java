package WangYi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/13.
 */
public class MaxSum {
    public static int N,D;
    public static int[][] DATA;
    public static void main(String[] args) {
        int n;
        int d;
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        n = scanner.nextInt();
        d = scanner.nextInt();
        int[][] data = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                data[i][j] = scanner.nextInt();
            }
            scanner.nextLine();
        }
        N = n;D = d;DATA = data;
        int result = 0;
        int tempResult = 0;
        tempResult = calcRow();
        if(tempResult>result)result = tempResult;
        tempResult = calcColu();
        if(tempResult>result)result = tempResult;
        tempResult = calcLR();
        if(tempResult>result)result = tempResult;
        tempResult = calcRL();
        if(tempResult>result)result = tempResult;
        System.out.println(result);
    }

    public static int initRow(int row){
        int sum = 0;
        for (int i = row; i < D; i++) {
            sum+=DATA[row][i];
        }
        return sum;
    }
    public static int calcRow(){
        int max = 0;
        int temmMax = max;
        for (int i = 0; i < N; i++) {
            temmMax = initRow(i);
            int end = D;
            while (end < N){
                if(temmMax > max)max = temmMax;
                temmMax+=DATA[i][end];
                temmMax-=DATA[i][end-D];
                end++;
            }
            if(temmMax > max)max = temmMax;
        }
        return max;
    }
    public static int initColu(int Colu){
        int sum = 0;
        for (int i = Colu; i < D; i++) {
            sum+=DATA[i][0];
        }
        return sum;
    }
    public static int calcColu(){
        int max = 0;
        int temmMax = max;
        for (int i = 0; i < N; i++) {
            temmMax = initColu(i);
            int end = D;
            while (end < N){
                if(temmMax > max)max = temmMax;
                temmMax+=DATA[end][i];
                temmMax-=DATA[end-D][i];
                end++;
            }
            if(temmMax > max)max = temmMax;
        }
        return max;
    }
    public static int initRL(int row,int colu){
        int result = 0;
//        int row = 0;int colu = start;
        for (int i = 0; i < D; i++) {
            if (0>colu | 0>row | colu >=N || row>=N){
                result = -1;
                break;
            }else {
                result+=DATA[row][colu];
                row++;
                colu--;
            }
        }
        return result;
    }
    public static int calcRL(){
        int max = 0;
        int temmMax = max;
        int iniRow = N-1;int initColu = N-1;
        for (int i = 0; i < 2*N-1; i++) {
            temmMax = initRL(iniRow,initColu);
            int colu = initColu-D;
            int row = iniRow+D;
            while (colu>-1 && row<N){
                if(temmMax > max)max = temmMax;
                temmMax+=DATA[row][colu];
                temmMax-=DATA[row-D][colu+D];
                row++;colu--;
            }
            if(temmMax > max)max = temmMax;
            if(i<N-1)iniRow--;
            else initColu--;
        }
        return max;
    }
    public static int initLR(int row,int colu){
        int result = 0;
//        int row = 0;int colu = row;
        for (int i = 0; i < D; i++) {
            if (0>colu | 0>row | colu >=N || row>=N){
                result = -1;
                break;
            }else {
                result+=DATA[row][colu];
                row++;
                colu++;
            }
        }
        return result;
    }
    public static int calcLR(){
        int max = 0;
        int temmMax = max;
        int iniRow = N-1;int initColu = 0;
        for (int i = 0; i < 2*N-1; i++) {
            temmMax = initLR(iniRow,initColu);
            int colu = initColu+D;
            int row = iniRow + D;
            while (colu<N && row<N){
                if(temmMax > max)max = temmMax;
                temmMax+=DATA[row][colu];
                temmMax-=DATA[row-D][colu-D];
                row++;colu++;
            }
            if(temmMax > max)max = temmMax;
            if(i<N-1)iniRow--;
            else initColu++;
        }
        return max;
    }
}
