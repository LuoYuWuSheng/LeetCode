package Shouhu;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/8/29.
 */
public class Kolakoski {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> seq = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            seq.add(sc.nextInt());
        }
        int index =0;
        ArrayList<Integer> res = new ArrayList<Integer>();
        int format = 0;
        while (res.size()<=m){
            for (int i = 0; i < seq.get(format); i++) {
                res.add(seq.get(index));
            }
            index++;
        }
        for (int i = res.size(); i < n; i++) {
            for (int j = 0; j < res.get(index); j++) {
                res.add(seq.get(format));
            }
            format = (format+1)%m;
            index++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(res.get(i));
            if(i!=res.size()-1) System.out.print(" ");
        }
        System.out.println();
    }
}
