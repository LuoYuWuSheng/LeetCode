package Tencent;

import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/5 0005.
 */
public class Print {
    static long prefix = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] input;
        String sin = sc.nextLine();
        input = sin.toCharArray();
        for (int i = 0; i < input.length; i++) {
            System.out.format("%x",(int)input[i]);
            prefix+=16;
            System.out.format("  %08x  ",prefix);
            System.out.println();
        }
    }
}
