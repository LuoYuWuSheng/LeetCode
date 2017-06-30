package HuaWei;

import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/20.
 */
public class getCubeRoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double data = sc.nextDouble();
        System.out.format("%.1f",getCubeRoot(data)).println();
    }
    public static double getCubeRoot(double input){
        double result=1;
        //double resTemp=0;
        Math.abs(Math.pow(result,3)-input);
        while(Math.abs(Math.pow(result,3)-input) > 0.01){
            result = (2*result + (input/result)/result)/3;
        }
        return result;
    }
}
