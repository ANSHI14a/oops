package CollectionFrameWork;
import java.util.*;

public class Dequeue {
    static void DequeueEg(){
        Deque<Integer> dq=new ArrayDeque<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        System.out.println(dq.pollFirst());
        System.out.println(dq.pollLast());
        System.out.println(dq);



    }
    public static void main(String[] args) {
        DequeueEg();
    }

    
}
