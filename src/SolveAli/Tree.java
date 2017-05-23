package SolveAli;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Computer user xd
 * Created by 张洋 on 2017/3/14.
 */
public class Tree {

    int[][] data;
    myTree tree;

    public static void main(String[] args) {
        Tree test = new Tree();
        int[] temp = {113, 215, 221};
        test.data = new int[temp.length][3];
        for (int i = 0; i < temp.length; i++) {
            test.data[i][0] = temp[i] / 100;
            test.data[i][1] = (temp[i] % 100) / 10;
            test.data[i][2] = (temp[i] % 10);
        }
//        求出广度优先遍历的结果
        test.sort();
//        利用广度优先的结果重构树
        test.buildTree();
//        遍历输出结果
        test.travel(0, test.tree);
    }

    private void exchange(int i, int j) {
        int[] temp = new int[3];
        temp[0] = data[i][0];
        temp[1] = data[i][1];
        temp[2] = data[i][2];
        data[i][0] = data[j][0];
        data[i][1] = data[j][1];
        data[i][2] = data[j][2];
        data[j][0] = temp[0];
        data[j][1] = temp[1];
        data[j][2] = temp[2];
    }

    private void bucketSort(int index) {
        int[][] temp = new int[data.length][3];
//        System.arraycopy(data, 0, temp, 0, data.length);
        for (int i = 0; i < data.length; i++) {
            temp[i][0] = data[i][0];
            temp[i][1] = data[i][1];
            temp[i][2] = data[i][2];
        }
        int[] bucket = new int[10];
        for (int i = 0; i < data.length; i++) {
            bucket[data[i][index]]++;
        }
//      统计位置
        for (int i = 1; i < 10; i++) {
            bucket[i] = bucket[i] + bucket[i - 1];
        }
//      排序
        for (int i = data.length - 1; i > -1; i--) {
            int tempIndex = --bucket[data[i][index]];
            data[tempIndex][0] = temp[i][0];
            data[tempIndex][1] = temp[i][1];
            data[tempIndex][1] = temp[i][1];
        }
    }

    private void sort() {
        bucketSort(1);
        bucketSort(0);
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][2]);
        }
    }

    class myTree {
        //        时间不够没有写完。。。。
        myTree left;
        myTree right;
        int val;

        myTree(int val) {
            this.val = val;
        }
    }

    private myTree buildTree() {
        int tempIndex = 1;
        myTree root = new myTree(data[0][2]);
        Queue<myTree> queue = new LinkedList<>();
        queue.add(root);
        for (int i = 1; i > -1; i++) {
            for (int j = 1; j <= 2 * i;) {
                if((i == data[tempIndex][0] && j == data[tempIndex][1]) ||( i == data[tempIndex][0] && j+1 == data[tempIndex][1])){
                    myTree now = queue.poll();
                    if (i == data[tempIndex][0] && j == data[tempIndex][1]) {
                        myTree left = new myTree(data[tempIndex][2]);
                        now.left = left;
                        queue.add(left);
                        tempIndex++;
                        if(tempIndex >= data.length){
                            i=-5;
                            break;
                        }
                    }
                    j++;
                    if(i == data[tempIndex][0] && j == data[tempIndex][1]){
                        myTree right = new myTree(data[tempIndex][2]);
                        now.right = right;
                        queue.add(right);
                        tempIndex++;
                        if(tempIndex >= data.length){
                            i=-5;
                            break;
                        }
                    }
                    j++;
                }
                j++;
            }
        }
        this.tree = root;
        return root;
    }

    private void travel(int sum, myTree tree) {
//        深度优先遍历求和即可时间不够了。。。
//        临时记录，避免退到根重新统计
        int tempSum = sum;
        if (tree != null) {
            tempSum += tree.val;
            if (tree.left == null &&tree.right == null ) System.out.println(tempSum+tree.val);
            travel(tempSum, tree.left);
            travel(tempSum, tree.right);
        }
//        发现叶子输出
    }
}
