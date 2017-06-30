package HuaWei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/27.
 */
public class Walk {
    public static int x = 0;
    public static int y = 0;
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("input1.txt"));
        String line = sc.nextLine();
        String[] array = line.split(";");
        for(int i = 0;i< array.length;i++){
            if(array[i]!=null && !("".equals(array[i]))){
                walk(array[i]);
            }
        }
        System.out.println(x+","+y);
    }
    public static void walk(String data){
        if(data != null && !data.equals("")){
            if(data.length()>3 || data.length()<=1)return;
            else {
                switch(data.charAt(0)){
                    case 'A':
                        x-=Integer.parseInt(data.substring(1));
                        break;
                    case 'D':
                        x+=Integer.parseInt(data.substring(1));
                        break;
                    case 'S':
                        y-=Integer.parseInt(data.substring(1));
                        break;
                    case 'W':
                        y+=Integer.parseInt(data.substring(1));
                        break;
                    default: return;
                }
            }
        }
    }
}
