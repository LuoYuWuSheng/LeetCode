package MoneyUnion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/13 0013.
 */
public class p1 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);
        System.out.println(sc.nextInt());
    }
}
