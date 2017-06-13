package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class LogFileOld {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input2"));
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            sc.nextLine();
            Map<Integer,Object> map = new HashMap<>();
            Object obj = new Object();

            int errorNum = -1;
            int badLogNum = 0;
            for (int i = 0; i < num; i++) {
                String line = sc.nextLine();
                char Mark = line.charAt(0);
                int id;
                if(Mark == 'I'){
                    id = getId(line);
                    if(map.get(id) == null){
                        map.put(getId(line),obj);
                    }else {
                        errorNum = i + 1;
                        break;
                    }
                }else if(Mark == 'O'){
                    id = getId(line);
                    if(map.get(id) !=null){
                        map.remove(id);
                    }else {
                        if(badLogNum>0)badLogNum--;
                        else {
                            errorNum = i+1;
                            break;
                        }
                    }
                }else if(Mark == '?'){
                    badLogNum++;
                }
            }
            System.out.println(errorNum);
            if(errorNum != -1){
                for (;errorNum<num;errorNum++){
                    sc.nextLine();
                }
            }
        }
    }
    public static int getId(String input){
        return Integer.parseInt(input.substring(2));
    }

}
