package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/11.

 */
public class Range {
    static int num;
    static int lower;
    static int xiaomei;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input.txt"));
        while (sc.hasNextInt()){
            read(sc);
            int result = calc();
            System.out.println(result);
        }
    }

    public static void read(Scanner sc) throws FileNotFoundException {
        num =0;
        xiaomei = 0;
        lower = 0;
        num = sc.nextInt();
        xiaomei = sc.nextInt();
        for (int i = 1; i < num; i++) {
            int temp = sc.nextInt();
            if(temp <= xiaomei)lower++;
        }
        //add herself
        lower++;
    }
    public static int calc(){
        int round = 0;
        //only herself
        if(num == 1)round =0;
        else {
            // she is the highest
            //if(num == lower)round = -1;
            //she is not highest
            while (lower > 0){
                lower >>= 1;
                round++;
            }
        }
        return round;
    }
}
