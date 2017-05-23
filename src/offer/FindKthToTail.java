package offer;

/**
 * Created by luoyu on 2017/2/8 0008.
 */
public class FindKthToTail {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
//  错误 忘记考虑k不合法的情况
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p = head;
        ListNode result = head;
        int i;
//        忽略了p为null 的情况，
        for (i = 0; i < k && p !=null; i++) {
            p = p.next;
        }
//        处理p不合法的情况
        if( i != k ){
            result = null;
        }else {
            while (p!=null){
                result = result.next;
                p= p.next;
            }
        }
        return result;
    }
}