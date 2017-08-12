package Tencent;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/7/17.
 */
public class MoveUpperChar {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String line = sc.nextLine();
            char[] array = line.toCharArray();
            int end = array.length;
            for(int i = end-1;i>=0;i--){
                if('A'<=array[i] && array[i]<='Z'){
                    int j = i+1;
                    while(j<array.length && 'a'<= array[j] && array[j] <= 'z'){
                        char temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                        j++;
                    }
                }
            }
            System.out.println(new String(array));
        }
    }
}
