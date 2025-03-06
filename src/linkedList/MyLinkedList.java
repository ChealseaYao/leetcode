package linkedList;

public class MyLinkedList {
    private ListNode dummyHead;
    private int size;

    public MyLinkedList() {
        dummyHead = new ListNode(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode current = dummyHead;
        for (int i = 0; i <= index; i++) {
            current = current.next;
        }
        return current.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummyHead.next;
        dummyHead.next = newNode;

        size++;
    }

    public void addAtTail(int val) {
        ListNode current = dummyHead;
        ListNode newNode = new ListNode(val);
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        size++;

    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        ListNode current = dummyHead;
        ListNode newNode = new ListNode(val);
        for (int i = 0; i < index; i++) { //这里i = 0时， current为真正的head， 需要注意。
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
        size++;


    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode current = dummyHead;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        current.next = current.next.next;
        size--;

    }
}
