package Didi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/22 0022.
 * 俄罗斯套娃，求最大能套多少层。w，h都小的时候才能套进去。
 * 先对w排序，如果w相等，h大的排前面。然后用找最长增长序列。
 */
public class Problem2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("input.txt");
        Scanner sc = new Scanner(input);
        int num = sc.nextInt();
        int[][] data = new int[num][2];
        for (int i = 0; i < num; i++) {
            data[i][0] = sc.nextInt();
            data[i][1] = sc.nextInt();
        }
        sort(data);
    }
    private void exchange(int i, int j,int[][] data) {
        int[] temp = new int[3];
        temp[0] = data[i][0];
        temp[1] = data[i][1];
        temp[2] = data[i][2];
        data[i][0] = data[j][0];
        data[i][1] = data[j][1];
        data[i][2] = data[j][2];
        data[j][0] = temp[0];
        data[j][1] = temp[1];
        data[j][2] = temp[2];
    }

    private static void bucketSort(int index,int[][] data) {
        int[][] temp = new int[data.length][3];
//        System.arraycopy(data, 0, temp, 0, data.length);
        for (int i = 0; i < data.length; i++) {
            temp[i][0] = data[i][0];
            temp[i][1] = data[i][1];
            temp[i][2] = data[i][2];
        }
        int[] bucket = new int[10];
        for (int i = 0; i < data.length; i++) {
            bucket[data[i][index]]++;
        }
//      统计位置
        for (int i = 1; i < 10; i++) {
            bucket[i] = bucket[i] + bucket[i - 1];
        }
//      排序
        for (int i = data.length - 1; i > -1; i--) {
            int tempIndex = --bucket[data[i][index]];
            data[tempIndex][0] = temp[i][0];
            data[tempIndex][1] = temp[i][1];
            data[tempIndex][1] = temp[i][1];
        }
    }

    private static int sort(int[][] data) {
        bucketSort(1,data);
        bucketSort(0,data);
        int result = 1;
        for (int i = 0; i < data.length; i++) {
            int h = data[i][1];
            while (data[i][0] == data[i+1][0])i++;
            if(data[i][1] < h){
                result++;
                i++;
                h = data[i][1];
            }
        }
        return result;
    }

}
