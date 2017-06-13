package MeiTuan;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class WriteTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream wr = new FileOutputStream("input.txt");
        int couple = 4;
        int data = (int) Math.pow(2,couple);
        System.out.println(data);
        wr.write((data+"\n").getBytes());
        for (int i = 0; i < data; i++) {
            if(i < (data>>1)) wr.write("-1000000 ".getBytes());
            else wr.write("1000000 ".getBytes());
        }
        wr.flush();
        wr.close();
    }
}
