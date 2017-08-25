import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 12/8/17.
 * 背包问题
 */
public class BagsProblem {
}

//01背包问题
class OneZeroBag{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        int[] w = new int[n];
        int cap = sc.nextInt();
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            w[i] = sc.nextInt();
        }
        System.out.println(Recersive(c,w,n-1,cap));
    }

    public static int Recersive(int[] c,int[] w,int index,int cap){
        if(index== -1)return 0;
        if(cap-w[index]>=0){
            int put = Recersive(c,w,index-1,cap-w[index])+c[index];
            int noput = Recersive(c,w,index-1,cap);
            return Math.max(put,noput);
        }else return Recersive(c,w,index-1,cap);
    }

}
