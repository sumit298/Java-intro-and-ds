import java.util.ArrayList;

public class PriorityQueue {
    private ArrayList<Integer> heap;

    public PriorityQueue(){
        heap = new ArrayList<>();
    }

    boolean isEmpty(){
        return heap.size() == 0;
    }

    int size(){
        return heap.size();
    }

    int getMin(){
        if(isEmpty()){
            try {
                throw new PriorityQueueException();
            } catch (PriorityQueueException e) {
                // Auto-generated catch block
                e.printStackTrace();
            }
        }
        return heap.get(0);
    }

    void insert(int element){
        heap.add(element);
        
    }



}
