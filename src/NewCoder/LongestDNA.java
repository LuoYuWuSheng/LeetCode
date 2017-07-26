package NewCoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 26/7/17.
 */
public class LongestDNA {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Map<Character,Boolean> map = new HashMap();
        map.put('A',true);
        map.put('T',true);
        map.put('C',true);
        map.put('G',true);
        int lon = 0;
        int temp = 0;
        String input = sc.nextLine();
        for(int i = 0;i<input.length();i++){
            if(map.get(input.charAt(i))!=null)temp++;
            else{
                //todo zhizai limian fuzhi
                if(temp>lon)lon = temp;
                temp = 0;
            }
        }
        if(temp>lon)lon=temp;
        System.out.println(lon);
    }
}
