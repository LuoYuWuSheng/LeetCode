package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class LogFile {
    public static class BadLog{
        public int num = 0;
        public int dataNum = 0;
        public boolean[] log;
        public BadLog(int dataNum){
            this.dataNum = dataNum;
            log = new boolean[dataNum];
        }
        public void put(int data){
            log[data] = true;
            num++;
        }
        public boolean exist(int smallest){
            boolean result = false;
            for (int i = smallest; i < dataNum; i++) {
                if(log[i]){
                    result = true;
                    remove(i);
                    break;
                }
            }
            return result;
        }

        private void remove(int index){
            log[index] = false;
            num--;
        }

        public int size(){
            return num;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input2"));
        while (sc.hasNextInt()){
            int errorLine = -1;
            int num;
            Map<String,Integer> buyMap = new HashMap<>();
            Map<String,Integer> useMap = new HashMap<>();
            num = sc.nextInt();
            BadLog badLog = new BadLog(num);
            sc.nextLine();
            for (int i = 0; i < num; i++) {
                String line = sc.nextLine();
                if(line.charAt(0) == '?'){
                    badLog.put(i);
                }else {
                    String substring = line.substring(2);
                    if(line.charAt(0) == 'I'){
                        Integer inputLine = buyMap.get(substring);
                        if( inputLine!= null){
                            boolean exist = badLog.exist(inputLine);
                            //存在unlog的情况
                            if(exist){
                                buyMap.put(substring,i);
                            }else {
                                errorLine = i+1;
                                break;
                            }
                        }else {
                            buyMap.put(substring,i);
                        }
                    }else if(line.charAt(0) == 'O'){
                        if(buyMap.get(substring) != null){
                            buyMap.remove(substring);
    //                        判断未知log
                        }else {
                            boolean exist =false;
                            Integer lastUse = useMap.get(substring);
                            if(lastUse != null){
                                exist = badLog.exist(lastUse);
                            }else if (badLog.size() > 0){
                                exist = true;
                                badLog.remove(0);
                            }

                            if(!exist){
                                errorLine = i+1;
                                break;
                            }
                        }
                        useMap.put(substring,i);

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
