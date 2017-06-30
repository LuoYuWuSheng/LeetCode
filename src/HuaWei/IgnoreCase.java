package HuaWei;

import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/18.
 */
public class IgnoreCase {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String temp = sc.nextLine();
        if(temp.length() < 1 || temp.length() >2){System.out.println("invalid input");return;}
        char target = Character.toUpperCase(temp.charAt(0));
        int result = 0;
        System.out.println(Math.ceil(1.5));
        System.out.println(Math.floor(1.5));
        for(int i =0;i<line.length();i++){
            if(target == Character.toUpperCase(line.charAt(i))){
                result++;
            }
        }
        System.out.println(result);
    }
}
