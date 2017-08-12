package offer;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 23/7/17.
 */
public class NewPluse {
    public static void main(String[] args) {
        // write your code here, try to do it without arithmetic operators.
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int carry=0;
        int sum=0;
        do{
            sum=a^b;
            carry = (a&b )<<1;
            //carry = carry<<1;
            a=sum;
            b=carry;
        }while(b !=0);
        System.out.println(sum);
    }
}
