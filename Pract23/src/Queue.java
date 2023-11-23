public interface Queue<T> {
    void enqueue(T value);
    T dequeue();
    int size();
    boolean isEmpty();
}
