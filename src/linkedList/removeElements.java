package linkedList;

public class removeElements {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);

        System.out.println(removeElements(head, 6).val);

    }

    public static ListNode removeElements(ListNode head, int val) {

        /* 解法一：虚拟头节点*/
//        ListNode dummyHead = new ListNode(); //要注意，每个new只是创建了一个新节点
//        dummyHead.next = head;
//
//        ListNode current = dummyHead;
//        while (current.next != null) {
//            if (current.next.val == val) {
//                current.next = current.next.next;
//            } else {
//                current = current.next;
//            }
//        }
//        return dummyHead.next;

        /* 解法二：操作原链表*/
        if (head != null && head.val == val) {
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode current = head;
        while (current.next != null && current.next.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }
}
