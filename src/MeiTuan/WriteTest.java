package MeiTuan;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class WriteTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream wr = new FileOutputStream("input4");
        int dataNum = (int) (Math.pow(10,4));
//        int data = (int) Math.pow(2,couple);
        System.out.println(dataNum);
        wr.write((dataNum+"\n").getBytes());
//        wr.write(("I 1\n").getBytes());
        for (int i = 0; i < dataNum; i++) {
            wr.write("-1 ".getBytes());
        }
        wr.write("\n".getBytes());
        for (int i = 0; i < dataNum; i++) {
            wr.write("1 ".getBytes());
        }
        wr.write("\n".getBytes());
        wr.flush();
        wr.close();
    }
}
