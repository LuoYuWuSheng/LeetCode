import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/22.
 */
public class SubSeq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        char[] source = line1.toCharArray();
        char[] target = line2.toCharArray();
        char[][] way = new char[source.length][target.length];
        int[][] num = new int[source.length][target.length];
        for (int i = 0; i < source.length; i++) {
            if(target[0]==source[i])num[i][0] = 1;
        }
        for (int i = 0; i < target.length; i++) {
            if(target[i]== source[0])num[0][i]= 1;
        }
        for (int i = 1; i < source.length; i++) {
            for (int j = 1; j < target.length; j++) {
                if(source[i] == target[j]){
                    num[i][j]= num[i-1][j-1]+1;
                    way[i][j] = 'e';
                }else {
                    if(num[i-1][j] > num[i][j-1] ){
                        num[i][j] = num[i-1][j];
                        way[i][j] = 'u';
                    }else {
                        num[i][j] = num[i][j-1];
                        way[i][j] = 'l';
                    }
                }
            }
        }
        System.out.println(num[source.length-1][target.length-1]);
    }
}
