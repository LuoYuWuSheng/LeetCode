package Didi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/22 0022.
 */
public class Problem1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream input = new FileInputStream("input.txt");
        Scanner sc = new Scanner(input);
        String data = sc.nextLine();
        String[] invert = data.split(" ");
        for (int i = 0; i < invert.length ; i++) {
            System.out.print(myword(invert[i])+" ");
        }
    }
    public static String myword(String data){
        char[] temp = data.toCharArray();
        int length = temp.length;
        for (int i = 0; i < length / 2; i++) {
            char cTemp = temp[i];
            temp[i] = temp[length-i-1];
            temp[length-i-1] = cTemp;
        }
        return new String(temp);
    }
}
