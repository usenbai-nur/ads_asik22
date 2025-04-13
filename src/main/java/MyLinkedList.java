public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }

    @Override
    public void add(T item) {
        addLast(item); // теперь add просто вызывает addLast
    }

    public void addLast(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    public T removeFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        T value = head.data;
        head = head.next;
        length--;
        return value;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
        } else {
            MyNode<T> current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        length--;
    }

    public void clear() {
        head = null;
        length = 0;
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length) throw new IndexOutOfBoundsException();
        MyNode<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }
    public T getFirst() {
        if (head == null) throw new RuntimeException("List is empty");
        return head.data;
    }

}
