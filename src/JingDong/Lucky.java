package JingDong;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 7/7/17.
 */
public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            //0 is ?
            int result = 0;
            for (int i = 0; i <= n; i++) {
                if(baseSum(2,i)==baseSum(10,i))result++;
            }
            System.out.println(result);
        }
    }
    public static int baseSum(int radix,int in){
        int result= 0;
        while(in !=0){
            result += in%radix;
            in /= radix;
        }
        return result;
    }
}
