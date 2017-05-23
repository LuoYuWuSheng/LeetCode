package WangYi;

import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/13.
 */
public class StringCompress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
//        String data = "AAAABCCDAA";
        System.out.println(compress(data));
    }

    public static String compress(String data){
        StringBuffer stringBuffer = new StringBuffer("");
        int count=0;
        char tempChar = data.charAt(0);
        char[] charArray = data.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if(tempChar == charArray[i])count++;
            else {
                stringBuffer.append(count);
                stringBuffer.append(tempChar);
                count=1;
                tempChar = charArray[i];
            }
        }
        stringBuffer.append(count);
        stringBuffer.append(tempChar);
        return stringBuffer.toString();
    }
}
