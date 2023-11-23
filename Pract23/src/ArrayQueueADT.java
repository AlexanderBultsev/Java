import java.util.Arrays;

public class ArrayQueueADT<T> {
    private Object[] array;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayQueueADT(int initialCapacity) {
        array = new Object[initialCapacity];
        front = 0;
        rear = -1;
        size = 0;
        capacity = initialCapacity;
    }

    public static <E> void enqueue(ArrayQueueADT<E> queueADT, E value) {
        if (isFull(queueADT))
            throw new ArrayIndexOutOfBoundsException("Queue is full");

        queueADT.rear = (queueADT.rear + 1) % queueADT.capacity;
        queueADT.array[queueADT.rear] = value;
        queueADT.size++;
    }

    public static <E> E dequeue(ArrayQueueADT<E> queueADT) {
        if (isEmpty(queueADT))
            throw new ArrayIndexOutOfBoundsException("Queue is empty");

        E value = (E) queueADT.array[queueADT.front];
        queueADT.front = (queueADT.front + 1) % queueADT.capacity;
        queueADT.size--;
        return value;
    }

    public static int size(ArrayQueueADT<?> queueADT) {
        return queueADT.size;
    }

    public static boolean isEmpty(ArrayQueueADT<?> queueADT) {
        return queueADT.size == 0;
    }

    public static boolean isFull(ArrayQueueADT<?> queueADT) {
        return queueADT.size == queueADT.capacity;
    }

    public static void clear(ArrayQueueADT<?> queueADT) {
        while(!isEmpty(queueADT))
            dequeue(queueADT);
    }

    public static void main(String[] args) {
        ArrayQueueADT<String> queue = new ArrayQueueADT<>(5);
        enqueue(queue, "a");
        enqueue(queue, "bb");
        enqueue(queue, "ccc");
        enqueue(queue, "dd");
        enqueue(queue, "e");

        System.out.println(Arrays.toString(queue.array));
        System.out.println("Size1: " + size(queue));
        System.out.println("isFull: " + isFull(queue));

        dequeue(queue);
        System.out.println("Size2: " + size(queue));

        System.out.println("isEmpty1: " + isEmpty(queue));

        clear(queue);
        System.out.println("isEmpty2: " + isEmpty(queue));
    }
}
