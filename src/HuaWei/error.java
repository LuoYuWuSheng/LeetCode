package HuaWei;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/27.
 */
public class error {
    static class errLog{
        String[] file = new String[8];
        public int[] line = new int[8];
        //public String name;
        int index = 0;
        public void add(String name){
            for(int i = 0;i<8;i++){
                if(name.equals(file[i])){
                    line[i]++;
                    return;
                }
            }
            file[index] = name;
            line[index] = 1;
            index = (index+1)%8;
        }
        public void print(){
            for(int i = 0;i<8;i++){
                if(file[index] != null){
                    String[] nameArray = file[index].split(" ");
                    int length = nameArray[0].length();
                    if(length>16){
                        System.out.print(nameArray[0].substring(length-16));
                    }else {
                        System.out.print(nameArray[0]);
                    }
                    System.out.print(" "+nameArray[1]);
                    System.out.println(" "+line[index]);
                }
                index = (index+1)%8;
            }
        }
    }
    public static void main(String args[]) throws FileNotFoundException {
        Scanner sc= new Scanner(new FileInputStream("input.txt"));
        errLog log = new errLog();
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            String[] array = line.split(" ");
            String[] path = array[0].split("\\\\");
            String name = path[path.length-1];
            log.add(name+" "+array[1]);
        }
        log.print();
    }
}
