package Baidu;

import java.util.*;

/**
 * Computer user luoyu
 * Created by 张洋 on 22/7/17.
 */
public class sort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //int data[] = new int[num];
        Set<Integer> data = new HashSet<>();
        for(int i =0;i<num;i++){
            data.add(sc.nextInt());
        }
        if(data.size()>2){
            List<Integer> temp = new ArrayList<>(data);
            Collections.sort(temp);
            System.out.println(temp.get(2));
        }else{
            System.out.println(-1);
        }
    }
}
