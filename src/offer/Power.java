package offer;

/**
 * Created by luoyu on 2017/2/8 0008.
 */
public class Power {
//    todo 不是考的边界，而是指数可能为负数
    public double Power(double base, int exponent) {
        double result = 1;
        if(exponent > 0){
            for (int i = 0; i < exponent; i++) {
                result *= base;
            }
        }else {
            for (int i = 0; i > exponent ; i--) {
                result /= base;
            }
        }
        return result;
    }
}
