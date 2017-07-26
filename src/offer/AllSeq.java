package offer;

import java.util.*;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/22.
 * todo 这个全排序一直是错的，竟然没有纠正
 */
public class AllSeq {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int data[] = new int[num];
        for (int i = 0; i < num; i++) {
            data[i] = sc.nextInt();
        }
        Arrays.sort(data);
        show(data, 0);
    }

    public static void show(int[] data, int index) {
        if (index == data.length) System.out.println(Arrays.toString(data));
        //todo 交换却不能使得交换后的在第一的位置，导致后面的排序不是字典序
        for (int i = index; i < data.length; i++) {
            swap(data,index,i);
            show(data, index + 1);
            swap(data,index,i);

        }
    }

    public static void swap(int[] in,int a,int b){
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }
}

class indexOfAllSeq {
    //todo 输入数组，判断该数组是这个数组构成全排序中的第几个
    public static void main(String[] args) {
        int in[] = {4,2,1};
        int temp[] = new int[in.length];
        System.arraycopy(in,0,temp,0,in.length);
        Arrays.sort(in);
        result = 0;
        calc(in,temp,0);
        System.out.println(result);
    }

    public static int getIndex(int[] data) {
        List<Integer> temp = new ArrayList();
        for (int i = 0; i < data.length; i++) temp.add(data[i]);
        Collections.sort(temp);
        int num = temp.size();
        int index = 0;
        //todo Some element index didn't change
        for (int i = num - 1; i > -1; i--) {
            index += temp.indexOf(data[i]) * calcAllSeq(i);
            temp.remove(temp.indexOf(data[i]));
        }
        return index;
    }

    public static int calcAllSeq(int in) {
        int result = 1;
        for (int i = 2; i <= in; i++) {
            in *= i;
        }
        return result;
    }

    public static int result =0;
    public static boolean get = false;
    public static void calc(int[] in,int[] target, int index){
        if(index==in.length-1 ){
            boolean tempGet = true;
            for( int i =0;i<target.length;i++){
                if(target[i]!=in[i]){
                        tempGet=false;
                        break;
                }
            }
            get=tempGet;
            System.out.println(Arrays.toString(in));
        }
        for(int i = index;i<in.length;i++){
            if(get)return;
            if(index !=i)result++;
            swap(in,index,i);
            calc(in,target,index+1);
            swap(in,index,i);
        }
    }
    public static void swap(int[] in,int a,int b){
        int temp = in[a];
        in[a] = in[b];
        in[b] = temp;
    }
}
