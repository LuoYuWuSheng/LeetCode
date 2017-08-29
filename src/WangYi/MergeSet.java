package WangYi;

import java.util.ArrayList;

/**
 * Computer user luoyu
 * Created by 张洋 on 12/8/17.
 */
public class MergeSet {
    public static void main(String[] args) {
        int[][] set1 = {{4,8},{9,13}};
        int[][] set2 = {{6,12}};
        ArrayList<int[]> res = new ArrayList<>();
        for (int i = 0; i < set1.length; i++) {
            for (int j = 0; j < set2.length; j++) {
                if(set1[i][0]>set2[j][1]||set1[i][1]<set2[j][0])continue;
                else {
                    int[] now = new int[2];
                    now[0]=Math.max(set1[i][0],set2[j][0]);
                    now[1]=Math.min(set1[i][1],set2[j][1]);
                    res.add(now);
                }
            }
        }
        for (int i = 0; i < res.size(); i++) {
            System.out.println("["+res.get(i)[0]+","+res.get(i)[1]+"]");
        }
    }
}
