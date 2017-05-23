package HighPerform;

/**
 * Created by luoyu on 2017/3/30 0030.
 */
public class HPPow {
    public static double pow(double base,int pow){
        if(pow == 0)return 1;
        if(pow == 1)return base;
        double result = pow(base,pow >> 1);
        result *= result;
        if((pow & 0x01) == 1)result *= base;
        return  result;
    }

    public static void main(String[] args) {
        System.out.printf(String.valueOf(pow(2,10)));
    }
}
