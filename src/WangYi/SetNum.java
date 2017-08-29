package WangYi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class SetNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        Set<Double> set = new HashSet<>();
        for (int p = w;p<=x;p++){
            for (int q = y; q <=z ; q++) {
                set.add(p/(double)q);
            }
        }
        System.out.println(set.size());
    }
}
