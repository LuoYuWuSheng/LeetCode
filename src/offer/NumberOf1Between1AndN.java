package offer;

/**
 * Created by luoyu on 2017/3/31 0031.
 */
public class NumberOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n==0)return 0;
        int target = 1;
        int numNow = 1;
        int temp = n;
        int base= 1;
        int total = 0;
        do{
            numNow = temp%10;
            total += 10*total;
            if(numNow >= target)total += base;
            base *=10;
        }while((temp/=10)!=0);
        return total;
    }
}
