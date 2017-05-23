package SolveAli;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by luoyu on 2017/4/26 0026.
 */
public class Main2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("input.txt");
        Scanner sc = new Scanner(fis);
        String in = sc.nextLine();
        System.out.println(resolve(in));
    }
    // write your code here
    public static int resolve(String expr) {
        Stack<Integer> stack = new Stack<>();
        String[] input = expr.split(" ");
        for (int i = 0; i < input.length; i++) {
            switch (input[i]){
                case "^":
                    if(stack.empty())return -1;
                    else {
                        int temp = stack.pop();
                        temp++;
                        if(stack.size() < 16){
                            stack.push(temp);
                        }else return -2;
                    }
                    break;
                case "+":
                    if(stack.size() < 2)return -1;
                    else {
                        int temp1 = stack.pop();
                        int temp2 = stack.pop();
                        temp1+=temp2;
                        if(stack.size() < 16){
                            stack.push(temp1);
                        }else return -2;
                    }
                    break;
                case "*":
                    if(stack.size() < 2)return -1;
                    else {
                        int temp1 = stack.pop();
                        int temp2 = stack.pop();
                        temp1*=temp2;
                        if(stack.size() < 16){
                            stack.push(temp1);
                        }else return -2;
                    }
                    break;
                default:
                    if(stack.size() < 16){
                        stack.push(Integer.parseInt(input[i]));
                    }else return -2;
                    break;
            }
        }
        if(stack.empty())return -1;
        else return stack.pop();
    }
}
