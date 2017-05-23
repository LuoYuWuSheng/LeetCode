package AiQiYi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/14 0014.
 */
public class p1 {
    public static class data{
        public data(int p, int v) {
            this.p = p;
            this.v = v;
            vdivp = (double) v/p;
        }

        int p;
        int v;
        double vdivp;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input1.txt");
        Scanner scanner = new Scanner(new FileInputStream(file));
        int b = scanner.nextInt();
        ArrayList<data> in = new ArrayList<>();
        while (scanner.hasNextInt()){
            data temp = new data(scanner.nextInt(),scanner.nextInt());
            in.add(temp);
        }
        if(in.size()>0){
            //对单价收视率排序
            Collections.sort(in, new Comparator<data>() {
                @Override
                public int compare(data o1, data o2) {
                    if(o1.vdivp < o2.vdivp)return 1;
                    if(o1.vdivp == o2.vdivp)return 0;
                    else return -1;
                }
            });
            int result =0;
            int index=0;
            while (b >= 0 && index < in.size()){
                data temp = in.get(index);
                if(b - temp.p >= 0){
                    result+=temp.v;
                    b-=temp.p;
                }
                index++;
            }
            System.out.println(result);
        }else System.out.println(0);
    }
}
