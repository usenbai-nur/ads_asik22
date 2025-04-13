public class Main {
    public static void main(String[] args) {
        System.out.println("IOI");

        MyStack<Integer> stack = new MyStack<>(new MyArrayList<>());
        stack.push(100);
        stack.push(200);
        System.out.println("stack pop: " + stack.pop());

        MyQueue<String> queue = new MyQueue<>(new MyLinkedList<>());
        queue.enqueue("yo");
        queue.enqueue("what");
        System.out.println("queue dequeue: " + queue.dequeue());

        MyMinHeap heap = new MyMinHeap();
        heap.add(5);
        heap.add(7);
        heap.add(9);
        System.out.println("min element: " + heap.peek());
    }
}
