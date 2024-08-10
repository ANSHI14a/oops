package oops;

interface Herbivore{
    int eyes =2;
    void walk();
}

class Horse implements Herbivore{
    public void walk(){
        System.out.println("Eats green grass");
    }
}
public class OOP {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walk();
    }
    
}
