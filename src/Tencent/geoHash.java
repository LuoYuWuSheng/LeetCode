package Tencent;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 17/7/17.
 */
public class geoHash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min = -90;
        int max = 90;
        if(min <= num && num <= max){
            String result = "";
            for (int i = 0; i < 6; i++) {
                int middle = (min+max)/2;
                if(num < middle){
                    result+="0";
                    max = middle;
                }else {
                    result+="1";
                    min = middle;
                }
            }
            System.out.println(result);
        }
    }
}
