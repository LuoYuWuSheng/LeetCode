package Tencent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/1/28 0028.
 */
public class p1 {
    public static void main(String[] args) {
        File file = new File("./p3");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
        String temp;
        while (scanner.hasNextLine()){
            temp = scanner.nextLine();
            char[] array =  temp.toCharArray();
            int length = array.length;
            int[][] matrix = new int[length+1][length+1];
            for (int i = 1;i < length+1;i++){
                for (int j =1;j< length +1;j++){
                    if(array[i-1] == array[length-j]){
                        matrix[i][j] = matrix[i-1][j-1]+1;
                    }else {
                        matrix[i][j] = max(matrix[i-1][j],matrix[i][j-1]);
                    }
                }
            }
            System.out.println(length - matrix[length][length]);
        }
    }
    private static int max(int a, int b){
        if(a > b)return a;
        else return b;
    }
}
