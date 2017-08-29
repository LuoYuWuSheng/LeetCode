/**
 * Computer user luoyu
 * Created by 张洋 on 25/8/17.
 */
public class Temp {
    public static void main(String[] args) {
        System.out.println(get(-123));
    }
    public static long get(long in){
        int[] num = new int[10];
        boolean neg = false;
        if(in<0){
            neg=true;
            in=-in;
        }
        while (in!=0){
            int wei = (int) (in%10);
            num[wei]++;
            in/=10;
        }
        long result = 0;
        if(neg){
            for (int i = 9; i >-1; i--) {
                if(num[i]>0){
                    result+=i;
                    num[i]--;
                    break;
                }
            }
            for (int i = 9; i >-1 ; i--) {
                while (num[i]>0){
                    result*=10;
                    result+=i;
                    num[i]--;
                }
            }
            result=-result;
        }else {
            for (int i = 1; i < 10; i++) {
                if (num[i]>0){
                    result+=i;
                    num[i]--;
                    break;
                }
            }
            for (int i = 0; i < 10; i++) {
                while (num[i]>0){
                    result*=10;
                    result+=i;
                    num[i]--;
                }
            }
        }
        return result;

    }
}
