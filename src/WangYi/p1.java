package WangYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class p1 {

    public static void main(String[] args){
        File file = new File("p3");
        FileInputStream fis = null;
        try {
            fis =  new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
//        Scanner scanner = new Scanner(System.in)
        int length = scanner.nextInt();
        scanner.nextLine();
        ArrayList<Integer> data = new ArrayList();
        for (int i = 0; i < length; i++) {
            data.add(scanner.nextInt());
        }
        Integer[] dataArray = new Integer[data.size()];
        data.toArray(dataArray);
        int conbineNum =0;
        int i = 0;
        int j = length-1;
        while (i<j){
            if(dataArray[i].equals(dataArray[j])){
                i++;
                j--;
            }else if(dataArray[i] < dataArray[j]){
                dataArray[++i] = dataArray[i-1] + dataArray[i];
                conbineNum++;
            }else {
                dataArray[--j] = dataArray[j+1] + dataArray[j];
                conbineNum++;
            }
        }
        System.out.println(conbineNum);
    }
}
