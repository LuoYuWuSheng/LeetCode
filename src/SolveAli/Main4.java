package SolveAli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/26 0026.
 */
public class Main4 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner sc = new Scanner(fis);
        System.out.println(sc.nextLine());
    }
}
