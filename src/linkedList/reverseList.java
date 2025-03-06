package linkedList;

public class reverseList {
    public static void main(String[] args) {


    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode pre = null;
        while (current != null) {
            ListNode temp = current.next;
            current.next = pre;
            pre = current;
            current = temp;
        }
        return pre; //这里一定要返回新链表的head，现在是pre节点。
    }
}
