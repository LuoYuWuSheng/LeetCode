package offer;

/**
 * Created by luoyu on 2017/2/9 0009.
 */
public class listNode {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode ReverseList(ListNode head) {
        ListNode l,m,r,result = head;
        l = head;
        if(l==null) return result;
        else {
            m = l.next;
            if(m == null ) return result;
            else {
                r = m.next;
                l.next=null;
                m.next = l;
            }
            while (r !=null){
                l = m;
                m = r;
                r=r.next;
                m.next = l;
            }
            result = m;
            return result;
        }
    }
}
