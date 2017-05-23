package Tencent;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/1/27 0027.
 */
public class p3 {
    public static void main(String[] args) {
        File file = new File("p3");
        System.out.println(file.getAbsolutePath());
        FileInputStream fis = null;
        try {
            fis =  new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
//        Scanner scanner = new Scanner(System.in);
        int num;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        while (scanner.hasNext()){
            num = Integer.parseInt(scanner.nextLine());
            for (int i = 0; i < num; i++) {
                arrayList.add(scanner.nextInt());
                System.out.println(i);
            }
            scanner.nextLine();
            Collections.sort(arrayList);
            for (Integer temp : arrayList) {
                System.out.println(temp);
            }

            int MaxNum = 0;
            int minNum = 0;
            if(arrayList.get(num-1) != arrayList.get(0)){
                int tail = arrayList.get(num-1);
                for(int i = num-1;i>-1;i--){
                    if(tail == arrayList.get(i)){
                        MaxNum++;
                    }
                }
                int sameNum = 0;
                int tmpSamNum = 0;
                int tempMin = arrayList.get(1)-arrayList.get(0);
                for (int i = 1; i < num; i++) {
                    int temp = arrayList.get(i)-arrayList.get(i-1);
                    if(temp == 0){

                    }
                    else if(tempMin == 0){
                        continue;
                    }
                    else {
                        if(temp<tempMin){
                            tempMin = temp;
                            minNum = 1;
                        }else if(temp == tempMin)minNum++;
                    }
                }
            } else {
                MaxNum = num*(num-1)/2;
                minNum = MaxNum;
            }
            System.out.println(minNum+" "+MaxNum);
        }
    }
}
