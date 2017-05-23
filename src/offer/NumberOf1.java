package offer;

/**
 * Created by luoyu on 2017/2/8 0008.
 */
public class NumberOf1 {
    public int NumberOf1(int n) {
        int result =0;
        for (int i = 0; i < 32; i++) {
            if((n & 0x00000001) !=0)result++;
            n >>>= 1;
        }
        return result;
    }
}
