package Tencent;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        char temp;
        while (scanner.hasNext()){
            String input = scanner.nextLine();
            char[] charArray = input.toCharArray();
//            System.out.println(charArray.length);
            int nowUpper = 0;
            for(int i = 0;i<charArray.length;i++){
                if(Character.isLowerCase(charArray[i])){
                    temp= charArray[i];
                    for(int j = i;j>i-nowUpper;j--){
                        charArray[j]=charArray[j-1];
                    }
                    charArray[i-nowUpper] = temp;
                }else nowUpper++;
            }
            System.out.println(charArray);
        }
    }
}
