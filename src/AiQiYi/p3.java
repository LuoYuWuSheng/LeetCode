package AiQiYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/14 0014.
 */
public class p3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input2");
        Scanner scanner = new Scanner(new FileInputStream(file));
//        System.out.println(scanner.nextLine());

        int k = scanner.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        while (scanner.hasNextInt())data.add(scanner.nextInt());
        Collections.sort(data);

        int sum = 0 ;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i);
        }
        int length = sum / k;
        int temp = 0;
        for (int i = length; i > 0 ; i--) {
            temp = 0;
            for (int j = 0; j < data.size(); j++) {
                temp += data.get(j)/i;
            }
            if(temp >= k) {
                System.out.println(i);
                break;
            }
        }
        if(temp < k) System.out.println(0);
    }
}
