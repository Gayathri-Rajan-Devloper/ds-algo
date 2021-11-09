import java.util.NoSuchElementException;

public class DoublyLinkedList {
    ListNode head;
    ListNode tail;
    int length;

    private class ListNode {
        private int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void displayForward() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void displayBackward() {
        ListNode temp = tail;
        while (tail != null) {
            System.out.print(tail.data + "--->");
            tail = tail.previous;
        }
        System.out.println("null");

    }

    public void insertFirst(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            tail = newNode;
        } else {
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
        length++;
    }

    public void insertLast(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        newNode.previous = tail;
        tail = newNode;
    }

    public ListNode delteFirst()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail)
        {
            tail = null;
        }
        else
        {
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
    }

    public ListNode deleteLast()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        ListNode temp = tail;
        if(head == tail)
        {
            head = null;
        }
        else
        {
            tail.previous.next = null;
        }
        tail = tail.previous;
        temp.previous = null;
        return temp;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(1);
        dll.insertFirst(10);
        dll.insertLast(30);
        dll.insertLast(40);
        dll.displayForward();
        dll.delteFirst();
        dll.deleteLast();
        dll.displayForward();
    }
}
