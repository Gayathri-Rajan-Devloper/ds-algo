import java.util.NoSuchElementException;

public class CircularSinglyLinkedList {
    private ListNode last;
    private int length;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }

    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public int getLength() {
        return length;
    }

    public void create() {
        ListNode first = new ListNode(5);
        ListNode second = new ListNode(10);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(20);
        ListNode fifth = new ListNode(25);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = first;
        last = fifth;
    }

    public void display() {
        if (last == null) {
            return;
        }
        ListNode first = last.next;
        while (first != last) {
            System.out.print(first.data + "---->");
            first = first.next;
        }
        System.out.print(first.data + "---->");
    }

    public void insertFirst(int value) {
        ListNode temp = new ListNode(value);
        if (last == null) {
            last = temp;
        } else {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public void insertLast(int value) {
        ListNode temp = new ListNode(value);
        if (last == null) {
            last = temp;
            last.next = last;
        } else {
            temp.next = last.next;
            last.next = temp;
            last = temp;

        }
        length++;
    }

    public ListNode removeFirstNode() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        ListNode temp = last.next;
        if (last.next == last) {
            last = null;
        } else {
            last.next = temp.next;
        }
        temp.next = null;
        length--;
        return temp;

    }

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertFirst(60);
        csll.insertFirst(70);
        csll.insertFirst(80);
        csll.insertFirst(90);

        csll.insertLast(100);
        csll.insertLast(110);
        csll.insertLast(120);
        csll.insertLast(130);

        csll.removeFirstNode();

        // csll.create();
        csll.display();
    }

}
