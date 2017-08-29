package LianJia;

import java.io.*;
import java.util.*;
public class Main1{
    public static void main(String[] args) throws IOException {
        File out = new File("random.out");
        FileWriter fw = new FileWriter(out);
        Scanner sc = new Scanner(new FileInputStream("random.in"));
        Set<Integer> set = new HashSet();
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            set.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList(set);
        Collections.sort(list);
//        System.out.println(list.size());
        fw.write(list.size());
        for(int i =0;i<list.size();i++){
//            fw.write();
            /*
            System.out.print(list.get(i));
            if(i!=list.size()-1)System.out.print(" ");
            else System.out.println();
            */
            fw.write(list.get(i));
            if(i!=list.size()-1)fw.write(" ");
            else fw.write('\n');
        }
        fw.flush();
        fw.close();
    }
}