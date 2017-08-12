package WangYi;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class QuChong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] data = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }
        Map<Integer,Boolean> map = new HashMap<>();
        for (int i = num-1; i >-1 ; i--) {
            if(map.get(data[i])!=null)data[i]=-1;
            else map.put(data[i],true);
        }
        for (int i = 0; i < num-1; i++) {
            if(data[i]!=-1) System.out.print(data[i]+" ");
        }
        System.out.println(data[num-1]);
    }
}
