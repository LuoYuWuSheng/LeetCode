package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by luoyu on 2017/6/14 0014.
 */
public class City {
    public static int num;
    public static int[] a;
    public static int[] b;
    public static boolean[] exist;
    public static boolean[] tried;
    public static Stack<Character> path;
    public static int loopCity = -1;
    public static boolean pathExist = false;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input4"));
        num = sc.nextInt();
        a = new int[num];
        b = new int[num];
        exist = new boolean[num];
        tried = new boolean[num];
        path = new Stack<>();

        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
        }

        travel(0);

        if (loopCity != -1 && pathExist) System.out.println("Infinity!");
        else if (pathExist) {
            for (Character character : path) {
                System.out.print(character);
            }
        } else System.out.println("No solution!");
    }

    private static void travel(int now) {
        Stack<Integer> systemStack = new Stack<>();
        systemStack.push(now);
        do {
            now = systemStack.peek();
            if(0 <= now && now <= num-1 ){
                if(now == num-1){
                    pathExist = true;
//                    return;
                }else if(exist[now]){
                    //成环什么都不做，记录成环的位置
                    if(loopCity == -1)loopCity = now;
                }else {
                    exist[now] = true;
                    //试路径a
                    path.push('a');
                    systemStack.push(now + a[now]);
                    if(pathExist)return;
                    path.pop();
                    //试路径b
                    path.push('b');
                    travel(now + b[now]);
                    if(pathExist)return;
                    path.pop();
                    //路径ab都不行，则退出该点
                    if(now == loopCity)loopCity = -1;
                    exist[now] = false;
                }
            }
        }while (!systemStack.empty());
    }
}
