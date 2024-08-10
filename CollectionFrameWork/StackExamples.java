package CollectionFrameWork;
import java.util.Stack;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class StackExamples {
    
    static void stackExamples(){
        Stack<String> st=new Stack<>();
        st.push("pw");
        st.push("skills");
        System.out.println(st.peek());
        // System.out.println(st.pop());
        // System.out.println(st.pop());
        System.out.println(st.size());
        System.out.println(st.empty());


    }
    public static void main(String[] args) {
        stackExamples();
    }
}
