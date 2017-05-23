package AiQiYi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileInputStream("input2"));
        int n;
        n = scanner.nextInt();
        ArrayList<Integer> data = new ArrayList<>();
        data.add(1);
        for (int i = 0; i < n; i++) {
            data.add(scanner.nextInt());
        }
        data.add(1);
        int max = 0;
        while (data.size() > 2) {
            int tempMax = 0;
            int temp = 0;
            int index = 1;
            for (int i = 1; i < data.size() - 1; i++) {
                temp = data.get(i - 1) * data.get(i) * data.get(i + 1);
                if (temp > tempMax) {
                    tempMax = temp;
                    index = i;
                }
                data.remove(index);
                max += tempMax;
            }

        }
        System.out.println(max);
    }
}
