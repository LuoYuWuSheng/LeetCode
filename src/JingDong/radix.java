package JingDong;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 7/7/17.
 */
public class radix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()){
            int data = sc.nextInt();
            if(data <=2 )System.out.print(1);
            else {
                int result =0;
                int num=0;
                for( int i = 2;i<data;i++){
                    result+=baseSum(i,data);
                    num++;
                }
                //todo  这里求公约数时少考虑了一个约数出现多次的情况
                for (int i = 2;i<=Math.min(result,num);i++){
                    if(result %i == 0 && num %i==0){
                        result/=i;
                        num/=i;
                        i--;
                    }
                }
                System.out.println(""+result+"/"+num);
            }
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
