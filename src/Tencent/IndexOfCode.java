package Tencent;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 17/7/17.
 */
public class IndexOfCode {
    static int index = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String input = sc.nextLine();
            if(input.length()>4)return;
            index = 0;
            System.out.println(getIndex(input,"")-1);
        }
    }
    static int getIndex(String target,String now){
        if(now.equals(target))return index;
        //todo 没有限制递归长度，导致无限递归
        else if(now.length()<4) {
            for (int i = 0; i < 25; i++) {
                index++;
                char temp = (char) ('a'+i);
                int tresult = getIndex(target,now+temp);
                //todo 无条件都返回，导致结果出错
                if (tresult !=-1)return tresult;
            }
        }
        return -1;
    }
}
