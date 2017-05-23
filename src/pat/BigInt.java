package pat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/3/22 0022.
 */
public class BigInt {
    public static void main(String[] args) {
        BigInteger a;
        BigInteger b;
        BigInteger c;
        BigInteger d;
        int n;
        File file = new File("input.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        n = scanner.nextInt();
        for(int i =0; i < n;i++){
            a = scanner.nextBigInteger();
            b = scanner.nextBigInteger();
            c = scanner.nextBigInteger();
            d = a.add(b);
            boolean result = false;
            if(d.compareTo(c) > 0) result = true;
//            scanner.nextLine();
            System.out.println("Case #"+(i+1)+": "+result);
        }
    }
    public static void test(String[] args){
        int a,b,c;
        int n;
        File file = new File("input.txt");
        Scanner scanner = null;
        try {
            scanner = new Scanner(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        n = scanner.nextInt();
        for(int i =0; i < n;i++){
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
//            scanner.nextLine();
            System.out.println("Case #"+i+":"+juge(a,b,c));
        }
    }
    public static boolean juge(int a,int b,int c){
        int temp = a+b;
        if(a > 0){
            if(b > 0){
                if(temp < 0)return true;
                else return temp > c;
            }else{
                return temp > c;
            }
        }else{
            if(b > 0){
                return temp > c;
            }else{
                if(temp >= 0)return false;
                else return temp > c;
            }
        }
    }
}
