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
public class LogFile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input2"));
        while (sc.hasNextInt()){
            int errorLine = -1;
            int num = 0;
            int badLogNum =0;
            Object obj = new Object();
            Map<String,Object> map = new HashMap<>();
            num = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < num; i++) {
                String line = sc.nextLine();
                if(line.charAt(0) == '?'){
                    badLogNum++;
                }else if(line.charAt(0) == 'I'){
                    if(map.get(line.substring(2)) != null){
                        errorLine = i+1;
                        break;
                    }else {
                        map.put(line.substring(2),obj);
                    }
                }else if(line.charAt(0) == 'O'){
                    if(map.get(line.substring(2)) != null){
                        map.remove(line.substring(2));
                    }else if(badLogNum >0){
                        badLogNum--;
                    }else {
                        errorLine = i+1;
                        break;
                    }
                }
            }
            System.out.println(errorLine);
            if(errorLine !=- 1){
                for (; errorLine < num; errorLine++) {
                    sc.nextLine();
                }
            }
        }
    }
}
