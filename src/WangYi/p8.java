package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/2 0002.
 */
public class p8 {
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
        int z = scanner.nextInt();
        int w = scanner.nextInt();
        boolean exist = true;

        int a = (x+z)/2;
        int b = a-x;
        if(b != z-a)exist = false;
        int c = b-y;
        if(b+c != w)exist = false;
        if(exist)System.out.println(a+" "+b+" "+c);
        else System.out.println("No");

    }
}
