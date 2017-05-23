package pat;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/10 0010.
 */
public class numDive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; i++) data[i] = sc.nextInt();
        int a1 = 0, a2 = 0, a3 = 0, a4c = 0, a5 = 0;
        double a4 = 0.0;
        boolean positive = true;
        for (int i = 0; i < n; i++) {
            switch (data[i] % 5) {
                case 0:
                    if (data[i] % 2 == 0) a1 += data[i];
                    break;
                case 1:
                    if (positive) a2 += data[i];
                    else a2 -= data[i];
                    positive = !positive;
                    break;
                case 2:
                    a3++;
                    break;
                case 3:
                    a4 += data[i];
                    a4c++;
                    break;
                case 4:
                    if (a5 < data[i]) a5 = data[i];
                    break;
            }
        }
        StringBuilder result = new StringBuilder();
        if (a1 == 0) result.append("N ");
        else result.append(a1 + " ");
        if (a2 == 0) result.append("N ");
        else result.append(a2 + " ");
        if (a3 == 0) result.append("N ");
        else result.append(a3 + " ");
        if (a4c == 0) result.append("N ");
        else {
            DecimalFormat df = new java.text.DecimalFormat("#.0");
            result.append(df.format(a4/a4c) + " ");
        }
        if (a5 == 0) result.append("N");
        else result.append(a5);
        System.out.println(result.toString());
    }
}
