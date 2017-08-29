package LianJia;

import java.util.Scanner;

/**
 * Created by luoyu on 2017/8/19 0019.
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] data = new int[n][2];
        int index = 1;
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            data[i][0] = index;
            index+=(num-1);
            data[i][1]=index;
            index++;
        }
        int m = sc.nextInt();
//        int[] test = new int[m];
        for (int i = 0; i < m; i++) {
            int in = sc.nextInt();
            int result = search(data,in,0,n-1);
            System.out.println(result+1);
        }
    }
    //根据提示的数据量，需要用二分查找
    public static int search(int[][] data,int target,int start,int end){
        int result = 0;
        if(start>end)return -1;
        int middle = (start+end)/2;
        if(data[middle][0]<=target &&data[middle][1]>=target)return middle;
        else if(data[middle][1]<target){
            result=search(data,target,middle+1,end);
        }else {
            result=search(data,target,start,middle-1);
        }
        return result;
    }
}
