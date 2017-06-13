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
        public ArrayList<Integer> log = new ArrayList<>();
        public void put(int data){
            log.add(data);
            num++;
        }
        public boolean exist(int smallest){
            boolean result = false;
            Iterator<Integer> it = log.iterator();
            int index = 0;
            while (it.hasNext()){
                if(it.next() > smallest){
                    result = true;
                    remove(index);
                }
                index++;
            }
            return result;
        }

        private void remove(int index){
            num--;
            log.set(index,-2);
        }

        public int size(){
            return num;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input2"));
        while (sc.hasNextInt()){
            int errorLine = -1;
            int num = 0;
            Map<String,Integer> buyMap = new HashMap<>();
            Map<String,Integer> useMap = new HashMap<>();
            BadLog unLog = new BadLog();
            num = sc.nextInt();
            sc.nextLine();
            for (int i = 0; i < num; i++) {
                String line = sc.nextLine();
                if(line.charAt(0) == '?'){
                    unLog.put(i);
                }else {
                    String substring = line.substring(2);
                    if(line.charAt(0) == 'I'){
                        Integer inputLine = buyMap.get(substring);
                        if( inputLine!= null){
                            boolean exist = false;
                            if(unLog.size() >0){
    //                            存在unlog的情况
                                if(unLog.exist(inputLine)){
                                    buyMap.put(substring,i);
                                    exist = true;
                                    break;
                                }
                            }
                            if(!exist){
                                errorLine = i+1;
                                break;
                            }
                        }else {
                            buyMap.put(substring,i);
                        }
                    }else if(line.charAt(0) == 'O'){
                        if(buyMap.get(substring) != null){
                            buyMap.remove(substring);
                            useMap.put(substring,i);
    //                        判断未知log
                        }else {
                            boolean exist = false;
                            Integer lastUse = useMap.get(substring);
                            if(lastUse != null){
                                if(unLog.exist(lastUse)){
                                    exist = true;
                                    break;
                                }
                            }else if (unLog.size() > 0){
                                exist = true;
                                unLog.remove(0);
                            }

                            if(!exist){
                                errorLine = i+1;
                                break;
                            }
                        }
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
