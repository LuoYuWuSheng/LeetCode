package offer;

/**
 * Created by luoyu on 2017/2/9 0009.
 */
public class ListNodeMerge {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge(ListNode list1,ListNode list2) {
//      哨兵，最后将result前移一个就行
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                temp.next = list1;
                temp = temp.next;
                list1 = list1.next;
            }else {
                temp.next = list2;
                temp=temp.next;
                list2 = list2.next;
            }
        }
        while (list1 != null){
            temp.next = list1;
            temp = temp.next;
            list1 = list1.next;
        }
        while (list2 != null){
            temp.next = list2;
            temp = temp.next;
            list2 = list2.next;
        }
        result = result.next;
        return result;
    }
}
