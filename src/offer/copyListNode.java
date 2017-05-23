package offer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luoyu on 2017/3/24 0024.
 * 只实现了On空间复杂度On的算法，可以有原地的On算法
 * 每个节点后面加个新节点。这样就能将旧的立刻映射到新的。
 */
public class copyListNode {

    public static class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            this.label = label;
        }
    }
    Map<RandomListNode,RandomListNode> map = new HashMap();
    public RandomListNode Clone(RandomListNode pHead){
            RandomListNode originalHead = pHead;
            while(pHead != null){
                RandomListNode myNew = map.get(pHead);
                if(myNew == null){
                    myNew = new RandomListNode(pHead.label);
                    map.put(pHead,myNew);
                }
                RandomListNode mynext = map.get(pHead.next);
                if(mynext == null && pHead.next != null){
                    mynext = new RandomListNode(pHead.next.label);
                    map.put(pHead.next,mynext);
                }
                myNew.next = mynext;
                RandomListNode myRandom = map.get(pHead.random);
                if(myRandom == null && pHead.random != null){
                    myRandom = new RandomListNode(pHead.random.label);
                    map.put(pHead.random,myRandom);
                }
                myNew.random = myRandom;
                pHead = pHead.next;
            }
        return map.get(originalHead);
    }

    public static void main(String[] args) {
        RandomListNode head = new RandomListNode(1);
        RandomListNode original = head;
        RandomListNode now = new RandomListNode(2);
        head.next = now;
        for (int i = 3; i < 10; i++) {
            now.random = head;
            now.next = new RandomListNode(i);
            now = now.next;
            head = head.next;
        }
        copyListNode test = new copyListNode();
        RandomListNode result = test.Clone(original);
        while (result != null){
            System.out.println(result.label);
            result = result.next;
        }
    }
}
