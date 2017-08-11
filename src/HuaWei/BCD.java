package HuaWei;

import java.util.Scanner;

/**
 * Computer user luoyu
 * Created by 张洋 on 9/8/17.
 */
public class BCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            String[] data = line.split(",{1,}");
            StringBuilder sb = new StringBuilder();
            sb.append("");
            boolean head = true;
            for (int i = 0; i < data.length; i++) {
                if(data[i].charAt(0)!='0')break;
                char h = data[i].charAt(3);
                char l = data[i].charAt(2);
                if(h!='F'){
                    if(h=='0'&&head);
                    else {
                        sb.append(h);
                        head = false;
                    }
                }
                if(l!='F'){
                    if(l!='0')head=false;
                    sb.append(l);
                }
            }
            String result = sb.toString();
            if(result.equals(""))result="0";
            System.out.println(result);
        }
    }
}
