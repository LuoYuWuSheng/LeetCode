package offer;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Computer user luoyu
 * Created by 张洋 on 20/8/17.
 */
public class MinSort {
    public class comp implements Comparator<String>{
        @Override
        public int compare(String o1, String o2) {
            String temp1 = o1+o2;
            String temp2 = o2+o1;
            for (int i = 0; i < temp1.length(); i++) {
                if(temp1.charAt(i)==temp2.charAt(i))continue;
                if(temp1.charAt(i)<temp2.charAt(i))return -1;
                else return 1;
            }
            return 0;
        }
    }
    public String PrintMinNumber(int [] numbers) {
        String[] Snum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            Snum[i]=numbers[i]+"";
        }
        Arrays.sort(Snum,new comp());
        String result = "";
        for (int i = 0; i < Snum.length; i++) {
            result+=Snum[i];
        }
        return result;
    }
}
