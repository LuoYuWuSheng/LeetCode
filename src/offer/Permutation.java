package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/16 0016.
 */
public class Permutation {
    char input[];
    ArrayList<String> result = new ArrayList();

    public ArrayList<String> Permutation(String str) {
        if (str != null && !str.equals("")) {
            char[] input;
            input = str.toCharArray();
            this.input = input;
            Arrays.sort(input);
        }
        sort(0, input.length-1);
        return result;
    }

    private void exchange(int start, int i) {
        char temp = input[start];
        input[start] = input[i];
        input[i] = temp;
    }

    private void sort(int start, int end) {
        if (start == end) result.add(new String(input));
        else {
//            先不做交换
            sort(start + 1, end);
//            与后面逐个交换
            for (int i = start + 1; i <= end; i++) {
                if (input[i] != input[start]) {
                    exchange(start, i);
                    sort(start + 1, end);
                    exchange(start,i);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Permutation test = new Permutation();
        ArrayList result = test.Permutation(input);
    }
}
