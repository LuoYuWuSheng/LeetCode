package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/2 0002.
 */
public class p6 {
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
        long input = scanner.nextInt();
        long result = 0;
        for(long i =input;i >0;i/=2){
            result += ((i+1)/2)*((i+1)/2);
        }
        System.out.println(result);
    }
}
