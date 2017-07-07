package JingDong;

import java.util.*;

/**
 * Computer user luoyu
 * Created by 张洋 on 7/7/17.
 */
public class SumAB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            Set<Integer> result = new HashSet<>();
            for (int i = 0; i < m; i++) {
                result.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                result.add(sc.nextInt());
            }
            List<Integer> sortArray = new ArrayList<>(result);
            Collections.sort(sortArray);
            for (int i = 0; i < sortArray.size(); i++) {
                System.out.print(sortArray.get(i));
                if(i!=sortArray.size()-1)System.out.print(" ");
            }
        }
    }
}
