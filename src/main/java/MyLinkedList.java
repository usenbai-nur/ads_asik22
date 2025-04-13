public class MyLinkedList<T> implements MyList<T> {
    private MyNode<T> head;
    private int length;

    public MyLinkedList() {
        head = null;
        length = 0;
    }
    @Override
    public void add(T item) {
        MyNode<T> newNode = new MyNode<>(item);
        if(head == null){
            head = newNode;
        }
        else {
            MyNode<T> current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        length++;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public void remove(int index) {

    }

    @Override
    public void clear() {

    }

    @Override
    public T get(int index) {
        MyNode<T> current = head;
        for(int i = 0; i < index; i++){
            current = current.next;
        }
        return current.data;
    }
}