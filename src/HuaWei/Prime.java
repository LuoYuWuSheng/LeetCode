package HuaWei;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/20.
 */
public class Prime {
    public static void main(String args[]){
        System.out.println((int)(0.8 * 10));
        Scanner sc = new Scanner(System.in);
        long input = 0;
        BigInteger big;
        while(sc.hasNextBigInteger()){
            big= sc.nextBigInteger();
            input = big.longValue();
            calc(input);
        }
    }
    public static void calc(long data){
        while (data > 1){
            for(int i = 2;i<=data;i++){
                if(data%i == 0){
                    if((isPrime(i)))System.out.print(i+" ");
                    data/=i;
                    break;
                }
            }
        }
        System.out.println();
    }
    public static boolean isPrime(int num){
        int half =(int) Math.sqrt(num);
        if(num == 2)return true;
        for(int i = 2;i <= half;i++){
            if(num %i == 0)return false;
        }
        return true;
    }
}
