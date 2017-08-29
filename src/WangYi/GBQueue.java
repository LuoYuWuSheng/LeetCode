package WangYi;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class GBQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        char[] data = in.toCharArray();
//        char[] temp = new char[data.length+1];
//        System.arraycopy(data,0,temp,1,data.length);
//        data=temp;
        int num1 = calc(data,'B');
        int num2 = calc(data,'G');
        System.out.println(Math.min(num1,num2));
    }
    public static int calc(char[] data,char target){
        char[] temp = new char[data.length];
        char[] temp2 = data;
        System.arraycopy(data,0,temp,0,data.length);
//        System.arraycopy(data,0,temp2,0,data.length);
        Arrays.sort(temp);
        int result = 0;
        if(target=='G'){
            for (int i = 0; i < temp.length/2; i++) {
                char t = temp[i];
                temp[i]=temp[temp.length-i-1];
                temp[temp.length-i-1]=t;
            }
        }
        int j =0;
        for (int i = 0; i < temp.length && temp[i]==target; j++) {
            if(temp2[j]==temp[i]){
                result+=j-i;
                i++;
            }
        }
        return result;
    }
}
