package WangYi;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 11/8/17.
 */
public class Job {
    private static long result;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            sc.nextLine();
            result =0;
            String[] data = new String[num];
            for (int i = 0; i < num; i++) {
                data[i]=sc.nextLine();
            }
            boolean[] done = new boolean[6];
            calc(done,data,0);
            System.out.println(result);
        }
    }
    public static void calc(boolean[] done,String[] data,int index){
        if(index==data.length){result++;return;}
        boolean doneNothing = true;
        for (int i = 0; i < data[index].length(); i++) {
            if(!done[data[index].charAt(i)-'0']){
                done[data[index].charAt(i)-'0']=true;
                calc(done,data,index+1);
                done[data[index].charAt(i)-'0']=false;
                doneNothing=false;
            }
        }
        //todo 题目没有说明白不可以有工程师什么都不做的情况
        if(doneNothing)return;
    }
}
