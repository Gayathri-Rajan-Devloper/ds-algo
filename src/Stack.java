public class Stack {
    private int arr[];
    private int top;
    private int capacity;

    public Stack(int size) {
        arr = new int[size];
        top = -1;
        capacity = size;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == capacity - 1) {
            return true;
        } else {
            return false;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        } else {
            System.out.println("Stack is empty no element present inside stack");
        }
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Stack is full no additional element can be added");
        }
        arr[++top] = x;

    }

    public void display()
    {
        for(int i = 0; i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack is empty no element can be added");
        }
        System.out.println("Removing element " +arr[top]);
        return arr[--top];
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack(3);
        stack.push(5);
        stack.push(6);
        stack.push(10);
        System.out.println("Elements inserted inside stack are ");
        stack.display();
        stack.pop();
        stack.pop();
        System.out.println("The element on top of stack is "+ stack.peek());
    }
}
