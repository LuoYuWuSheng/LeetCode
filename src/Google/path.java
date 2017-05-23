package Google;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by luoyu on 2017/5/7 0007.
 */
public class path {
    public static void main(String[] args) throws IOException {
        File file = new File("A-large-practice.in");
        Scanner scan = new Scanner(file);
        FileWriter fileWriter = new FileWriter("out.txt");
        int testNum = scan.nextInt();
        for (int i = 0; i < testNum; i++) {
            Dir dir = new Dir();
            int result = 0;
            int m, n;
            n = scan.nextInt();
            m = scan.nextInt();
            scan.nextLine();
            for (int j = 0; j < n; j++) {
                String temp = scan.nextLine();
                String path[] = temp.split("/");
                Dir dirNow = dir;
                for (int k = 1; k < path.length; k++) {
                    Dir subDir = dirNow.map.get(path[k]);
                    if (subDir == null) {
                        subDir = new Dir();
                        dirNow.map.put(path[k], subDir);
                    }
                    dirNow = subDir;
                }
            }
            for (int j = 0; j < m; j++) {
                String temp = scan.nextLine();
                String[] path = temp.split("/");
                Dir dirNow = dir;
                for (int k = 1; k < path.length; k++) {
                    Dir subDir = dirNow.map.get(path[k]);
                    if (subDir == null) {
                        subDir = new Dir();
                        dirNow.map.put(path[k], subDir);
                        result++;
                    }
                    dirNow = subDir;
                }
            }
            fileWriter.write("Case #" + (i + 1) + ": " + result + "\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }

    static class Dir {
        public Map<String, Dir> map = new HashMap<>();
    }
}
