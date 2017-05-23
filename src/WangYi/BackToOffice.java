package WangYi;

import java.util.Scanner;

/**
 * Created by luoyu on 2017/3/25 0025.
 */
public class BackToOffice {
    int num;
    int[][] taxiPosition;
    int[][] target = new int[1][2];
    int walkPay,taxiPay;
    public static void main(String[] args) {
        BackToOffice back = new BackToOffice();
        back.solve();
    }
    public void solve(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            num = scanner.nextInt();
            taxiPosition = new int[num][2];
            for (int i = 0; i < num; i++) {
//                x
                taxiPosition[i][0] = scanner.nextInt();
            }
            for (int i = 0; i < num; i++) {
//                y
                taxiPosition[i][1] = scanner.nextInt();
            }
            target[0][0] = scanner.nextInt();
            target[0][1] = scanner.nextInt();
            walkPay = scanner.nextInt();
            taxiPay = scanner.nextInt();
            System.out.println(calc());
        }
    }
    public int calc(){
        int smallest = (Math.abs(target[0][0])+Math.abs(target[0][1]))*walkPay;
        for (int i = 0; i < num; i++) {
            int smallWalk = (Math.abs(taxiPosition[i][0])+Math.abs(taxiPosition[i][1]))*walkPay;
            int smallTaxi = (Math.abs(taxiPosition[i][0]-target[0][0])+Math.abs(taxiPosition[i][1]-target[0][1]))*taxiPay;
            if(smallest > (smallTaxi+smallWalk))smallest = smallTaxi+smallWalk;
        }
        return smallest;
    }
}
