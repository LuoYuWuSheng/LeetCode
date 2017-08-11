package WangYi;

import java.util.Scanner;
import java.util.Stack;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class SimpleExpress {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        int result =0;
        for (int i = 0; i < in.length(); i++) {
            char temp = in.charAt(i);
            if('0'<=temp&&temp<='9')result=temp-'0';
            else {
                i++;
                switch (temp){
                    case '+':result=result+in.charAt(i)-'0';break;
                    case '-':result=result-(in.charAt(i)-'0');break;
                    case '*':result=result*(in.charAt(i)-'0');break;
                }
            }
        }
        System.out.println(result);
    }
}
