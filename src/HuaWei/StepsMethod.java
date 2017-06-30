package HuaWei;

import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/23.
 */
public class StepsMethod {
    public static int total =0;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        calc(m,n);
        System.out.println(total);
    }
    public static void calc(int m ,int n){
        if(m == 0 || n == 0){
            total++;
            return;
        }else{
            calc(m-1,n);
            calc(m,n-1);
        }

    }
}
