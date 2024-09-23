package queue;

class ArraryQueue {
    int maxSize;
    int front;
    int rear;
    int[] arr;
    public ArraryQueue(int arrmaxSize) {
        this.maxSize = arrmaxSize;
        this.arr = new int[maxSize];

    }
    public void enqueue(int value) {
        if ((rear +1)%maxSize == front ) {
            System.out.println("Queue is full");
        }
        else{
            arr[rear] = value;
            rear = (rear+1)%maxSize;

        }
    }
    public int dequeue() {
        if (rear == front) {
            System.out.println("Queue is empty");
            return -1;
        }
        else{
            int value = arr[front];
            front++;
            return value;
        }
    }
    public int peek() {
        return arr[front];

    }
    public int enableSize() {
        return (rear+(maxSize+1)-front)%(maxSize+1);
    }
}

public class Queue {
    public static void main(String[] args) {
        ArraryQueue queue = new ArraryQueue(11);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
//        for (int i = 0; i < 10; i++) {
//            System.out.println(queue.dequeue());
//        }
        System.out.println(queue.enableSize());
//        System.out.println(queue.dequeue());
    }
}

