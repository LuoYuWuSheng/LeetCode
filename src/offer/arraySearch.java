package offer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;


/**
 * 从左下角开始找，没能找到规律
 * Created by luoyu on 2017/2/4 0004.
 */
public class arraySearch {

    public static void main(String[] args) {
        File file = new File("p3");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner scanner = new Scanner(fis);
        String input = scanner.nextLine();
        arraySearch instance = new arraySearch();
        int num = scanner.nextInt();
        ListNode head = new ListNode(scanner.nextInt());
        ListNode tmp = head;
        for(int i =1;i< num;i++){
            tmp.next = new ListNode(scanner.nextInt());
            tmp = tmp.next;
        }
        tmp.next = null;
        System.out.println(instance.printListFromTailToHead(head));
    }

    public boolean Find(int target, int[][] array) {
        int col = array[0].length;
//        todo array的length竟然是这样的
        int row = array.length;
        int i = row-1;
        int j = 0;
        while (i > -1 && j < col){
            if(array[i][j] < target)j++;
            else if(array[i][j] > target)i--;
            else return true;
        }
        return false;
    }

    public String replaceSpace(StringBuffer str) {
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if(' ' == str.charAt(i)){
                result.append("%20");
            }else result.append(str.charAt(i));
        }
        return result.toString();
    }

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();

        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.empty()){
            result.add(stack.pop());
        }
        return result;
    }
//旋转数组
    public int minNumberInRotateArray(int [] array) {
        int result= 0;
        if (array.length == 1)result = array[0];
        else if(array.length >1){
            for (int i = 0; i < array.length-1; i++) {
                if(array[i+1]<array[i]){
                    result = array[i+1];
                    break;
                }
            }
        }
        return result;
    }
}
