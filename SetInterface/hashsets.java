package SetInterface;
import java.util.HashSet;


public class hashsets {


    public static void main(String[] args) {
        HashSet<Integer> st= new HashSet<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println(st);
        st.add(1);
        st.add(48);
        st.add(2);
        st.add(34);
        st.add(36);
        System.out.println(st);

        st.remove(2);
        System.out.println(st.contains(5));
        System.out.println(st.size());


    }
   
    
}
