package offer;

import java.util.ArrayList;

/**
 * Created by luoyu on 2017/4/22 0022.
 */
public class UglyNumber {
    public int GetUglyNumber_Solution(int index) {
        if (index == 0) return 0;
        ArrayList<Integer> old = new ArrayList<>();
        old.add(1);
        int tempMax = 1;
        int m2 = 0, m3 = 0, m5 = 0;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < index; i++) {
            while (index2 < old.size()){
                if(m2 > tempMax)break;
                m2 = old.get(index2++)*2;
            }
            while (index3 < old.size()){
                if(m3 > tempMax)break;
                m3 = old.get(index3++)*3;
            }
            while (index5 < old.size()){
                if(m5 > tempMax)break;
                m5 = old.get(index5)*5;
            }
            int min = min(m2, m3, m5);
            tempMax = min;
            old.add(min);
        }
        return old.get(index - 1);
    }

    private int min(int m2, int m3, int m5) {
        int temp = m2;
        if (m3 < temp) temp = m3;
        if (m5 < temp) temp = m5;
        return temp;
    }

    public static void main(String[] args) {
        UglyNumber ug = new UglyNumber();
        System.out.println(ug.GetUglyNumber_Solution(3));
    }
}
