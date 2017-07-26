package NewCoder;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 25/7/17.
 */
public class HandleString
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] data = input.toCharArray();
        //todo 粗心，导致少看了aaaa的情况
        for (int i = data.length-3; i >0 ; i-=2) {
            if(isRight(data,i)){
                System.out.println(i+1);
                break;
            }
        }
    }
    public static boolean isRight(char[] date,int index){
        boolean result = true;
        int head = index/2;
        while (head>-1){
            if(date[head--]!=date[index--]){
                result=false;
                break;
            }
        }
        return result;
    }
}
