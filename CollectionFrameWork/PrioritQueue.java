package CollectionFrameWork;
import java.util.Comparator;

import java.util.PriorityQueue;
public class PrioritQueue {

    static void PriorityQueueExamples(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        // a min type pq is formed
        pq.add(10);
        pq.add(2);
        pq.add(9);
        System.out.println(pq.peek());  // top par sabse chota element rehta hai

        System.out.println(pq);   //guarentee that the 
    // first element will be preocessed first
       System.out.println();
       System.out.println(pq.poll());
       System.out.println(pq);
       System.out.println(pq.peek());

       //make the max priority queue
       PriorityQueue<Integer> pq1= new PriorityQueue<>(Comparator.reverseOrder());

       pq1.add(4);
       pq1.add(2);
       pq1.add(9);
       System.out.println();
       System.out.println(pq1.peek());
       System.out.println(pq1.poll());
       System.out.println(pq1);

    }
    public static void main(String[] args) {
        PriorityQueueExamples();
    }
    
}
