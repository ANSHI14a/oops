package Practice;

interface Herbivore{
    void eat();
}
interface Animal{

}
class Lion implements Herbivore, Animal{
    public void eat(){
        System.out.println("Eats deer");
    }
}

public class oops {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
    }
    
}
