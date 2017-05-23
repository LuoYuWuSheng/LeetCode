package offer;

/**
 * Created by luoyu on 2017/4/30 0030.
 */
public class isContinuous {
    public static boolean isContinuous(int[] numbers) {
        //if(numbers==null ||numbers.length == 0)return false;
        int[] data = new int[14];
        for (int i = 0; i < numbers.length; i++) {
            data[numbers[i]]++;
        }
        int temp = 1;
        while (temp < 14 && data[temp] == 0) temp++;
        for (; temp < 14; temp++) {
            if (data[temp] == 0 && data[0] > 0) {
                data[temp] = 1;
                data[0]--;
            } else if (data[temp] != 1) break;
        }
        if (temp < 14) {
            if (data[temp] > 1) return false;
            else {
                for (; temp < 14; temp++) {
                    if (data[temp] != 0) return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] data = new int[0];
        isContinuous(data);
    }
}
