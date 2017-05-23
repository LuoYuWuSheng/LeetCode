package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/2 0002.
 */
public class p7 {
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
        int want = scanner.nextInt();
        int num8 = want /8;
        int result = 0;
        switch (want - num8 *8){
            case 0:result = num8;break;
            case 2:
                if(num8 >= 2)result = num8+1;
                else result = -1;
                break;
            case 4:
                if(num8 >= 1)result = num8+1;
                break;
            case 6:
                result = num8+1;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
                result = -1;
                break;
        }
        System.out.print(result);
    }
}
