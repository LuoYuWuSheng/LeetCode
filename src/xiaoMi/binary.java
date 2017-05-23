package xiaoMi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/4 0004.
 */
public class binary {
    public static void main(String[] args) {
        File file = new File("p3");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
//        Scanner scanner = new Scanner(System.in)
        Integer a = scanner.nextInt();
        Integer b = scanner.nextInt();
        int and = 1;
        int same = 0;
        for (int i = 0; i < 32; i++) {
            if (((b ^ a) & and) > 0) {
                same++;
            }
            a >>>= 1;
            b >>>= 1;
        }
        System.out.println(same);
    }
}
