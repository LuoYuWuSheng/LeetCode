package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/1 0001.
 */
public class p4 {
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
        int length = scanner.nextInt();
        int result = 0;
        int all = 9;
        if(length > 2){
            for(int i=2;i< length;i++){
                result = result*3+6;
                all*=3;
            }
        }
        System.out.println(all-result);
    }
}
