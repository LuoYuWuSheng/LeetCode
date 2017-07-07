package JingDong;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Computer user luoyu
 * Created by 张洋 on 7/7/17.
 */
public class Warn {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int num = sc.nextInt();
            int[] h=new int[num];
            for(int i = 0;i<num ;i++){
                h[i] = sc.nextInt();
            }
            int result = 0;
            for(int i = 0;i<num;i++){
                result+= calc(h,i);
            }
            System.out.println(result/2);
        }
    }
    public static int calc(int[] h,int in){
        Set<Integer> set = new HashSet();
        int index = in;
        int length = h.length;
        if(length < 2)return 1;
        int hNow = 0;
        for(int i = 0;i<length-2;i++){
            index = (index+1)%length;
            if(h[index]>h[in]){
                if(h[index]>=hNow){
                    set.add(index);
                    hNow = h[index];
                }
            }else {
                set.add(index);
                hNow = h[index];
            }
        }
        hNow = 0;
        //todo 粗心忘记恢复初值
        index = in;
        for(int i = 0;i<length-2;i++){
            //todo 循环竟然有问题，向后退直接用取余数的方法不行
            index = (index-1+length)%length;
            if(h[index]>h[in]){
                if(h[index]>hNow){
                    set.add(index);
                    hNow = h[index];
                }
            }else {
                set.add(index);
                hNow = h[index];
            }
        }
        System.out.println("from "+in);
        for (int one : set) {
            System.out.print(one+" ");
        }
        System.out.println("");
        return set.size();
    }
}
