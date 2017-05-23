package Google;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/7 0007.
 */
public class CodeNumber {
    static int mode = 1000000007;

    public static void main(String[] args) throws IOException {
        File file = new File("A-small-attempt0.in");
        Scanner scan = new Scanner(file);
        FileWriter fileWriter = new FileWriter("out.txt");
        int testCase = scan.nextInt();
        for (int i = 0; i < testCase; i++) {
            int n = scan.nextInt();
            int[] data = new int[n];
//            distinct
            int reslNum = 0;
            for (int j = 0; j < n; j++) {
                int temp = scan.nextInt();
                if (j == 0) {
                    data[reslNum++] = temp;
                } else if (temp != data[reslNum - 1]) {
                    data[reslNum++] = temp;
                }
            }
            int[] tempData = new int[reslNum];
            System.arraycopy(data, 0, tempData, 0, reslNum);
            data = tempData;

            int code = 0;
            for (int j = 1; j <= data.length; j++) {
                sub(0, j, data, new ArrayList<Integer>());
            }
            code = result;
            result = 0;
            fileWriter.write("Case #" + (i + 1) + ": " + code + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    static int result = 0;

    private static void sub(int start, int num, int[] data, ArrayList<Integer> sequence) {
        if (num == 1) {
            sequence.add(data[start]);
            result += sequence.get(sequence.size() - 1) - sequence.get(0);
            result %= mode;
            sequence.remove(sequence.size() - 1);
        } else if(start < data.length){
            sequence.add(data[start]);
            for (int i = start+1; i < data.length-num+2; i++) {
                sub(i, num - 1, data, sequence);
            }
            sequence.remove(sequence.size()-1);
            sub(start + 1, num, data, sequence);
        }
    }
}
