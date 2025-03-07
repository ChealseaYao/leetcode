package linkedList;

public class swapPairs {
    public static void main(String[] args) {

    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;
        ListNode current = dummyHead;

        ListNode temp;
        ListNode firstNode;
        ListNode secondNode;

        while (current.next != null && current.next.next != null) {
            //current.next!=null和current.next.next != null是为了确保有两个数进行交换，如果不满足就不进行交换。这里是重点。
            temp = current.next.next.next; //第三个节点
            firstNode = current.next; //当前的第一个交换节点
            secondNode = current.next.next; //当前的第二个交换节点

            current.next = secondNode;
            current.next.next = firstNode;
            current.next.next.next = temp;

            current = current.next.next; //每次交换完成后，后移两位。
        }

        return dummyHead.next; //返回的一定是头节点，当这么交换完成后，头节点就是dummyHead后的节点。

    }
}
