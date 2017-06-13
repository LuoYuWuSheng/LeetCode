package MeiTuan;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Computer user xd
 * Created by 张洋 on 2017/6/12.
 */
public class WriteTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream wr = new FileOutputStream("input2");
        int dataNum = (int) (5*Math.pow(10,5));
//        int data = (int) Math.pow(2,couple);
        System.out.println(dataNum);
        wr.write((dataNum+"\n").getBytes());
        wr.write(("I 1\n").getBytes());
        for (int i = 1; i < dataNum-2; i++) {
            wr.write("?\n".getBytes());
        }
        wr.write("I 1\n".getBytes());
        wr.write("I 1\n".getBytes());
        wr.flush();
        wr.close();
    }
}
