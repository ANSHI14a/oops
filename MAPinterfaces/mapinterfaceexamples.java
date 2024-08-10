package MAPinterfaces;
import java.util.*;

public class mapinterfaceexamples {
    public static void main(String[] args) {
        Map<Integer, String> mp = new HashMap<>();
        mp.put(1, "Anshika");
        mp.put(2, "Vivek");
        mp.put(3,"Dev");
        mp.put(1,"sweety");//duplicate key//overridng ho jayes 
        //1 pr tiya ayega
        mp.putIfAbsent(1, "Priya");// ye priya enter nahi hoga alreasy present hai 1 key

        System.out.println(mp);
        System.out.println((mp.get(2)));
        System.out.println(mp.containsKey(4));
        System.out.println(mp.containsValue("Anshika"));
        System.out.println(mp.entrySet());
        System.out.println(mp.keySet());
        System.out.println(mp.values());

        //iterate Over Keys
        for(String  i:mp.values()){//String i k jagah var i likh do

            System.out.println(i);

        }
        for(var e:mp.entrySet()){
            System.out.println(e);//prins the entire map
        }

        //only key
        for(var e:mp.entrySet()){
            System.out.println(e.getKey());
        }
        //only values
        for(var e:mp.entrySet()){
            System.out.println(e.getValue());
        }

//linked hash map is similar to linkedHashSet just diffrence is order is preserved
        





    }
    
}
