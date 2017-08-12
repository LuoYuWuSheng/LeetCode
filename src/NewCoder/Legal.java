package NewCoder;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 25/7/17.
 */
public class Legal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int n = sc.nextInt();
            int[] mark = new int[n];
            //todo 没有考虑受到两个数影响的情况，比如10即使2的倍数又是5的倍数
            for (int i = 1; i < n; i++) {
                if(mark[i]!=-1){
                    mark[i]=1;
                    for (int j = 2; (i+1)*j-1 < n; j++) {
                        mark[i]++;
                        mark[(i+1)*j-1]=-1;
                    }
                }
            }
            long result =1;
            for (int i = 1; i < n; i++) {
                if(mark[i]==0) System.out.println(i);
                if(mark[i]!=-1){
                    result*=(mark[i]+1);
                    result=result%1000000007;
                }
            }
            System.out.println(result%1000000007);
        }
    }
}
