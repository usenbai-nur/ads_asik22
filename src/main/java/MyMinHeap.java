import java.util.ArrayList;

public class MyMinHeap {
    private ArrayList<Integer> heap;

    public MyMinHeap() {
        heap = new ArrayList<>();
    }

    public void add(int val) {
        heap.add(val);
        siftUp(heap.size() - 1);
    }

    public int peek() {
        return heap.get(0);
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (heap.get(index) < heap.get(parent)) {
                int tmp = heap.get(index);
                heap.set(index, heap.get(parent));
                heap.set(parent, tmp);
                index = parent;
            } else {
                break;
            }
        }
    }
}
