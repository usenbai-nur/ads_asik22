public class MyStack<T> {
    private MyList<T> list;

    public MyStack(MyList<T> list) {
        this.list = list;
    }

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        T item = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return item;
    }

    public int size() {
        return list.size();
    }
}
