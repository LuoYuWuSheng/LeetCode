package WangYi;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class DrawColor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] line = new String[n];
        for (int i = 0; i < n; i++) {
            line[i] = sc.nextLine();
        }
        int max =1;
        if(n==1) {
            System.out.println(1);
        } else {
            for (int i = 0; i < n; i++) {
                int colMax=1;
                int tempMax=1;
                for (int j = 1; j < n; j++) {
                    if(line[j].charAt(i)==line[j-1].charAt(i))tempMax++;
                    //todo 出现断点才更新最小，错误。导致最后一次一直连续时无法更新最大。
                    else {
                        if (tempMax>colMax)colMax=tempMax;
                        tempMax=1;
                    }
                    if (tempMax>colMax)colMax=tempMax;
                }
                if(colMax>max)max=colMax;
            }
        }
        System.out.println(max);
    }
}
