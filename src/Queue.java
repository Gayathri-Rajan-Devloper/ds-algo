public class Queue {
    int arr[] = new int[5];
    int front;
    int rear;
    int size;

    public void enQueue(int data)
    {
        arr[rear] = data;
        rear = (rear + 1)%5;
        size++;
    }

    public int deQueue()
    {
        int data = arr[front];
        front = (front + 1)%5;
        size--;
        return data;
    }

    public void show()
    {
        System.out.print("Elements of the queue are ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[(front+i)%5] +" ");
        }
    }
    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enQueue(5);
        queue.enQueue(10);
        queue.show();
    }
}
