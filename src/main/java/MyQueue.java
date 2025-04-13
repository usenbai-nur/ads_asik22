public class MyQueue<T> {
    private MyLinkedList<T> list;

    public MyQueue(MyLinkedList<T> list) {
        this.list = list;
    }

    public void enqueue(T item) {
        list.addLast(item);
    }

    public T dequeue() {
        T item = list.getFirst();
        list.removeFirst();
        return item;
    }

    public int size() {
        return list.size();
    }
}
