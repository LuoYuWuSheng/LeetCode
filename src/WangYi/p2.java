package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/2/1 0001.
 */
public class p2 {
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
        int r2 = scanner.nextInt();
        double r = Math.sqrt(r2);
        int num = 0;
        int temp;
        for(int i = 0;i<r+1;i++){
            int a2 = i*i;
            temp = (int) Math.sqrt(r2 - a2);
            if(temp*temp + a2 == r2){
                num++;
                System.out.println(i+" "+temp);
            }
        }
        num*=4;
        r = (int) r;
        if(r*r == r2)num -= 4;
        System.out.println(num);
    }
}
