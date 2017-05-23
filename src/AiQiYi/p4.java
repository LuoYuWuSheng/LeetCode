package AiQiYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/14 0014.
 */
public class p4 {
    public static int result=0;
    public static int m = 0,n=0;
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
//        System.out.println(scanner.nextLine());
        while (scanner.hasNextInt()){
            n = scanner.nextInt();
            m = scanner.nextInt();
            scanner.nextLine();
            if(n !=0 && m !=0){
                char[][] data = new char[n][m];
                for (int i = 0; i < n; i++) {
                    String temp = scanner.nextLine();
                    temp = temp.replace(" ","");
                    char[] tempArray = temp.toCharArray();
                    for (int j = 0; j < m; j++) {
                        data[i][j] = tempArray[j];
                    }
                }
                result = 0;
                calc(data,n-1,0);
                System.out.println(result);
            }
        }
//        #柱子 .工位 m代表传过得工位
    }

    public static void calc(char[][] data,int row,int col){
        if(row == n-1 && col == m-1){
            data[row][col] = 'm';
            boolean all = true;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if(data[i][j]=='.'){
                        all = false;
                        break;
                    }
                }
            }
            if(all) result++;
        }
        else {
//            去掉非法
            if(row >=0 && row < n && col >=0 &&
                    col<m && data[row][col] != 'm'&& data[row][col] != '#'){
                data[row][col] = 'm';
                //left
                calc(data,row,col-1);
                //right
                calc(data,row,col+1);
                //up
                calc(data,row-1,col);
                //down
                calc(data,row+1,col);
                data[row][col] = '.';
            }
        }
    }
}
