package offer;

/**
 * Created by luoyu on 2017/2/7 0007.
 */
public class fibonacci {
    public static void main(String[] args) {
        System.out.println(Fibonacci(3));
    }
    public static int Fibonacci(int n) {
        int result =1;
        int pre1 = 1;
        int pre2 = 1;
        if(n == 0)return 0;
        if(n <=2 )return result;
        else {
            for (int i = 0; i < n - 2; i++) {
                result = pre1+ pre2;
                pre1 = pre2;
                pre2 = result;
            }
            return result;
        }
    }
}
