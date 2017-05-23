package offer;

import offer.base.ListNode;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by luoyu on 2017/4/5 0005.
 * 从后向前找——利用两个栈
 * 使得两个链表一样长，然后从前向后找. 长短链表，应该写个函数。
 * 将产生的结果映射为一个长一个短的指针。这样就能后面统一处理了。对长的移动多出来的步数。
 *
 * 我用的hashMap
 */
public class FindFirstCommonNode {
    public ListNode byMap(ListNode pHead1, ListNode pHead2) {
        Map<ListNode,ListNode> map = new HashMap();
        while(pHead1 != null){
            map.put(pHead1,pHead1);
            pHead1 = pHead1.next;
        }
        while(pHead2 != null){
            ListNode temp = map.get(pHead2);
            if(temp != null)return pHead2;
            pHead2 = pHead2.next;
        }
        return null;
    }
    public ListNode byLength(ListNode pHead1,ListNode pHead2){
        int l1 = 0,l2 = 0;
        ListNode temp1 = pHead1,temp2 = pHead2;
        while (temp1 != null){
            l1++;
            temp1 = temp1.next;
        }
        while (temp2 != null){
            l2++;
            temp2 = temp2.next;
        }
        ListNode listLong = pHead1,listShort = pHead2;
        if(l1 < l2){
            listLong = pHead2;
            listShort = pHead1;
        }
        for (int i = 0; i < l1 - l2; i++) {
            listLong = listLong.next;
        }
        while (listLong != null){
            if(listLong == listShort)return listLong;
            listLong = listLong.next;
            listShort = listShort.next;
        }
        return null;
    }
}
