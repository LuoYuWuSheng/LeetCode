package NewCoder;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 25/7/17.
 */
public class Card {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        int[] sum = new int[26];
        for (int i = 0; i < data.length(); i++) {
            sum[data.charAt(i)-'a']++;
        }
        boolean exist = false;
        int total = 0;
        for (int i = 0; i < 26; i++) {
            if(sum[i]>1){
                exist=true;
                sum[i]=sum[i]%2;
            }
        }
        for (int i = 0; i < 26; i++) {
            if(sum[i]==1)total++;
        }
        if(total == 0)total++;
        System.out.println(total);
    }
}
