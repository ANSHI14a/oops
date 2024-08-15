package ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
public class Al {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(12);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get
        int element=list.get(0);
        System.out.println(element);

        //add elemtn in betweeen
        list.add(1,11);
        System.out.println(list);

        //set elemt
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(3);
        System.out.println(list);

        //size
        int size=list.size();
        System.out.println(size);

        //loops
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }

        //sort
        Collections.sort(list);
        System.out.println(list+" ");
        
    }

    
}
