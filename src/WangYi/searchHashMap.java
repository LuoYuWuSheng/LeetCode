package WangYi;

import java.util.*;

/**
 * Created by luoyu on 2017/3/25 0025.
 */
public class searchHashMap {
    public static LinkedHashMap<Integer,Integer> map = new LinkedHashMap();
    Integer[] num;
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Integer[] num = new Integer[0];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextInt());
            map.put(list.get(i),list.get(i));
        }
        list.toArray(num);
        searchHashMap test = new searchHashMap();
        test.num = num;
        for (Map.Entry<Integer, Integer> result:map.entrySet()) {
            System.out.println(result.getValue());
        }
    }
}
