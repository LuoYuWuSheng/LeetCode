package HuaWei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/23.
 */
public class FaMa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] wei = new int[n];
        int[] num = new int[n];
        for(int i = 0;i< n;i++){
            wei[i] = sc.nextInt();
        }
        int total = 0;
        for(int i = 0;i< n;i++){
            num[i] = sc.nextInt();
            total += num[i];
        }
        Map<Integer,Integer> result = new HashMap();
        calc(wei,num,result,0,0);
        System.out.println(result.size());
    }
    public static void calc(int[] wei, int[] num, Map<Integer,Integer> map, int index, int now){
        for(int i = 0;i< num[index];i++){
            calc(wei,num,map,index+1,now+i*wei[index]);
        }
    }

}
