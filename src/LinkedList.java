public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    /* This method is used for inserting elements in the list*/
    public static LinkedList insert(LinkedList list, int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        //It is used to check wheather the list contains any element or it's empty
        //if it's empty then it add the element as the head element
        if (list.head == null) {
            list.head = newNode;
        }
        /*if it's not empty then it traverse the list from head element till last element
        and add the data in the end*/
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;

    }

    public static LinkedList deleteByKey(LinkedList list, int key) {
        Node curNode = list.head, prev = null;
        //if head is the node to be deleted
        if (curNode != null && curNode.data == key) {
            list.head = curNode.next;
            System.out.println(key + "Element is found and deleted");
            return list;
        }
       /* CASE 2:
         If the key is somewhere other than at head
         Search for the key to be deleted,
         keep track of the previous node
         as it is needed to change currNode.next*/
        while (curNode != null && curNode.data != key) {
            // If currNode does not hold key
            // continue to next node
            prev = curNode;
            curNode = curNode.next;
        }
        // If the key was present, it should be at currNode
        // Therefore the currNode shall not be null
        if (curNode != null) {
            //unlink the currentnode
            //point the prev node next to currentNode next
            prev.next = curNode.next;
        }

        /* CASE 3: The key is not present
         If key was not present in linked list
         currNode should be null*/
        if (curNode == null) {
            System.out.println("key is not found");
        }
        return list;
    }

    public static LinkedList deleteAtPosition(LinkedList list, int index) {
        Node currentNode = list.head, prev = null;
        if (index == 0 && currentNode != null) {
            list.head = currentNode.next;
            System.out.println("Element is deleted at index 0");
            return list;
        }
        int counter = 0;
        while (currentNode != null) {
            if (counter == index) {
                prev.next = currentNode.next;
                System.out.println("Element is deleted at index " + index);
                break;

            } else {
                prev = currentNode;
                currentNode = currentNode.next;
                counter++;
            }

        }

        if (currentNode == null) {
            System.out.println("Index element not found " + index);
        }
        return list;
    }

    public static void display(LinkedList list) {
        Node currNode = list.head;
        while (currNode.next != null) {
            System.out.print(currNode.data + "--->");
            currNode = currNode.next;
        }
        System.out.println(currNode.data);

    }

    //Used for displaying the elements
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = insert(list, 1);
        list = insert(list, 2);
        list = insert(list, 3);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 6);
        list = insert(list, 7);
        list = insert(list, 8);

        display(list);
        deleteAtPosition(list, 7);
        display(list);


    }


}
