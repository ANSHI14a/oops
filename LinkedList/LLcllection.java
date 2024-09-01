package LinkedList;
import java.util.LinkedList;

public class LLcllection {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("Akshit");
        list.add("Anshika");
        list.add("vikki");
        list.add("VIVEK");
        System.out.println(list);

        String value="Simmi";
        for(int i=0;i<list.size();i++){
          
            
            System.out.println(list.get(i));

        }
        list.removeFirst();
        System.out.println(list);

        list.removeLast();
            System.out.println(list);
        
            list.remove(0);
            System.out.println(list);

    }
}
