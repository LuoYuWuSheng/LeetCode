package SolveAli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/4/26 0026.
 */
public class Main1 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner sc = new Scanner(fis);
//        System.out.println(sc.nextLine());
        String str = sc.nextLine();
        String pattern = sc.nextLine();
        if(pattern.equals("")) System.out.println(1);
        boolean result =match(str.toCharArray(),pattern.toCharArray(),0,0);
        if(result) System.out.println(1);
        else System.out.println(0);
    }

    public static boolean match(char[] strArray,char[] patternArray,int strIndex,int patternIndex){
        if (strIndex == strArray.length){
            if (patternIndex == patternArray.length){  //如果都是空串，则认为匹配
                return true;
            }
            else{
                int i = 0;
                while (patternArray[i] == '*') i++;
                return i == patternArray.length;
            }
        }
        else if (patternIndex == patternArray.length){ //只有pattern是空串，则不匹配
                return false;
        }
        else{
            int i = 0;
            while (strIndex+i < strArray.length && patternIndex+i < patternArray.length){
                if (strArray[strIndex+i] != patternArray[patternIndex+i]){
                    if (patternArray[patternIndex+i] == '?'){  //单一通配符
                        ++i;
                        continue;
                    }
                    else if (patternArray[patternIndex+i] == '*'){ //多重通配符
                        patternIndex += i;
                        strIndex += i;
                        return match(strArray,patternArray,strIndex+1, patternIndex) || match(strArray,patternArray,strIndex, patternIndex+1);
                    }
                    else {
                        return false;
                    }
                }
                else{
                    ++i;
                }
            }
            return match(strArray,patternArray,strIndex + i, patternIndex + i);  //匹配剩下的部分(串尾)
        }
    }
}
