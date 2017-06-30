package HuaWei;

import java.util.*;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/30.
 */
public class StringHandle {
    private  static  class compare implements Comparator<Character> {

        @Override
        public int compare(Character o1, Character o2) {
            o1 = Character.toUpperCase(o1);
            o2 = Character.toUpperCase(o2);
            return o1-o2;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        char[] array= line.toCharArray();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            char temp = Character.toUpperCase(array[i]);
            if('A'<= temp && temp <= 'Z')list.add(array[i]);
        }
        Collections.sort(list,new compare());
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            char temp = Character.toUpperCase(array[i]);
            if('A' <= temp && temp <='Z')System.out.print(list.get(index++));
            else System.out.print(array[i]);
        }
        System.out.println();
    }
}
