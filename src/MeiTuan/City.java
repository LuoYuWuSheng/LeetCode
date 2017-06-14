package MeiTuan;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by luoyu on 2017/6/14 0014.
 */
public class City {
    class path{
        int num;
        public path(int num) {
            this.num = num;
        }
    }
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("input4"));
        int num = sc.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        for (int i = 0; i < num; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = sc.nextInt();
        }

        boolean[] exist = new boolean[num];
        Stack<Integer> path = new Stack<>();
        Stack<Character> pathSeq = new Stack<>();

        path.push(0);
        int loopCity = -1;
        boolean pathExist = false;
        while (!path.empty()){
            int now = path.peek();
            if(now == num-1){
                break;
            }
        }
        if(loopCity != -1 && pathExist) System.out.println("Infinity!");
        else if(pathExist) {
            for (Character character : pathSeq) {
                System.out.println(character);
            }
        }else System.out.println("No solution!");
    }

    private void travel(int now,int dest){
        if(now == dest){

        }
    }
}
