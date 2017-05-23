package offer;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/21 0021.
 */
public class Match {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream("input.txt"));
        String input = sc.nextLine();
        String pattern = sc.nextLine();
        Match  test = new Match();
        boolean result = test.match(input.toCharArray(),pattern.toCharArray());
        System.out.println(result);
    }
    private static char[] str;
    private static char[] pattern;

    public boolean match(char[] str, char[] pattern)
    {
        //由题意得不能有第一个字符是*的情况。
        Match.str = str;
        Match.pattern = pattern;
        return calc(0,0);
    }

    private boolean calc(int sIndex,int pIndex){
        if(sIndex == str.length && pIndex == pattern.length)return true;
        else{
            if(sIndex <= str.length && pIndex < pattern.length){
                //预读下一个
                Character next = null;
                if(pIndex +1 < pattern.length)next = pattern[pIndex+1];
                if(next != null && next == '*'){
                    if(pattern[pIndex] == '.') return calc(sIndex,pIndex+2) ||calc(sIndex+1,pIndex);
                        //匹配上一个字符
                    else if(pattern[pIndex] == str[sIndex]) return calc(sIndex+1,pIndex);
                        //跳过
                    else return calc(sIndex,pIndex+2);
                }else{
                    if(pattern[pIndex] == '.') return calc(sIndex+1,pIndex+1);
                        //匹配上一个字符
                    else if(pattern[pIndex] == str[sIndex]) return calc(sIndex+1,pIndex+1);
                        //匹配失败
                    else return false;
                }
            }else return false;
        }
    }
}
