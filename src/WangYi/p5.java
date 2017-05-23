package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/1 0001.
 */
public class p5 {
    public static void main(String[] args) {
        File file = new File("p3");
        FileInputStream fis = null;
        try {
            fis =  new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
//        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        x = rer(x);
        y = rer(y);
        System.out.println(rer(x+y));
    }

    private static int rer(int x){
        ArrayList<Integer> poxi = new ArrayList<Integer>();
        int temp;
        while (x > 0){
            temp = x%10;
            poxi.add(temp);
            x /=10;
        }
        int result = 0;
        int pow = 1;
        for (int i = poxi.size() -1;i >=0;i--){
            result += poxi.get(i)*pow;
            pow *= 10;
        }
        return result;
    }
}
