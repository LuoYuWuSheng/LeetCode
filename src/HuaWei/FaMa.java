package HuaWei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/23.
 */
public class FaMa {
    static int num;
    static int[] wei;
    static int[] cou;
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            num = sc.nextInt();
            wei = new int[num];
            cou = new int[num];
            for(int i = 0;i< num;i++){
                wei[i] = sc.nextInt();
            }
            for(int i = 0;i< num;i++){
                cou[i] = sc.nextInt();
            }
            if(num == 0)System.out.println("1");
            else{
                Map<Integer,Integer> map = new HashMap();
                count(num,0,map);
                System.out.println(map.size());
            }

        }
    }
    public static void count(int num,int now,Map<Integer,Integer> map){
        for(int i = 0;i<=cou[0];i++){
            map.put(i*wei[0],0);
        }
        for(int i = 1;i<num;i++){
            ArrayList<Map.Entry> list = new ArrayList(map.entrySet());
            for(int j = 1;j<= cou[i];j++){
                for(Map.Entry<Integer,Integer> entry : list){
                    map.put(entry.getKey()+j*wei[i],0);
                }
            }
        }
    }
}
