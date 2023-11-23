import java.util.Arrays;

public class ArrayQueueModule<T> implements Queue<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueueModule(int initialCapacity) {
        array = new Object[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
        capacity = initialCapacity;
    }

    @Override
    public void enqueue(T value) {
        if (isFull())
            throw new ArrayIndexOutOfBoundsException("Queue is full");

        rear = (rear + 1) % capacity;
        array[rear] = value;
        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Queue is empty");

        T value = (T) array[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void clear() {
        while(!isEmpty())
            dequeue();
    }

    public static void main(String[] args) {
        ArrayQueueModule<String> queue = new ArrayQueueModule<>(5);
        queue.enqueue("a");
        queue.enqueue("bb");
        queue.enqueue("ccc");
        queue.enqueue("dd");
        queue.enqueue("e");

        System.out.println(Arrays.toString(queue.array));
        System.out.println("Size1: " + queue.size());
        System.out.println("isFull: " + queue.isFull());

        queue.dequeue();
        System.out.println("Size2: " + queue.size());

        System.out.println("isEmpty1: " + queue.isEmpty());

        queue.clear();
        System.out.println("isEmpty2: " + queue.isEmpty());
    }
}
