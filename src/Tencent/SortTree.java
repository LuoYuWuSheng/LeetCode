package Tencent;

/**
 * Computer user xd
 * Created by 张洋 on 2017/8/29.
 */
public class SortTree {
    public static void main(String[] args) {
        int n = 4;
        int[] data = {1, 3};
        int start = 1;
        int end = (int) (Math.pow(2,n)-1);
        int middle = 0;
        while (true){
            middle = (start+end)/2;
            if(middle<data[0]){
                start = middle+1;
            }else if(middle>data[1]){
                end = middle-1;
            }else break;
        }
        System.out.println(middle);
    }
}
