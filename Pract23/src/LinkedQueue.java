import java.util.Arrays;

public class LinkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;
    private static class Node<T> {
        T value;
        Node<T> next;
        Node(T value) {
            this.value = value;
        }
    }

    public LinkedQueue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public void enqueue(T value) {
        Node<T> node = new Node<>(value);

        if (isEmpty()) {
            this.head = this.tail = node;
        } else {
            this.tail.next = node;
            this.tail = node;
        }

        size++;
    }

    @Override
    public T dequeue() {
        if (isEmpty())
            throw new ArrayIndexOutOfBoundsException("Queue is empty");

        T value = head.value;
        head = head.next;
        size--;
        if (isEmpty())
            tail = null;

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

    public static void main(String[] args) {
        LinkedQueue<String> queue = new LinkedQueue<>();

        queue.enqueue("a");
        queue.enqueue("bb");
        queue.enqueue("ccc");
        queue.enqueue("dd");
        queue.enqueue("e");
        System.out.println("Size1: " + queue.size());

        queue.dequeue();
        System.out.println("Size2: " + queue.size());

        queue.dequeue();
        queue.dequeue();
        System.out.println("Size3: " + queue.size());

        System.out.println("isEmpty1: " + queue.isEmpty());

        queue.dequeue();
        queue.dequeue();
        System.out.println("isEmpty2: " + queue.isEmpty());
    }
}
