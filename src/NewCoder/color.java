package NewCoder;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 26/7/17.
 */
public class color {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int result = 0;
        //todo RGGBBBRYYB BGGB没有考虑清楚到底怎样换才是最小代价
        for (int i = 1; i < line.length();) {
            if(line.charAt(i)==line.charAt(i-1)){
                result++;
                i+=2;
            }else i+=1;
        }
        System.out.println(result);
    }
}
