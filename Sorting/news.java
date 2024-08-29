
import java.util.Scanner;

public class news {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your girlfriend's name: ");
        String love  = scanner.nextLine();

        System.out.println("\nTrying to say sorry to " + love  + "...\n");
        
        for (int i = 1; i <= 5; i++) {
            System.out.println("I'm really sorry, " + "anshika" + " ❤ (Attempt " + i + ")");
            try {
                Thread.sleep(1500); // Pause for 1.5 seconds between attempts
            } catch (InterruptedException e) {
                System.out.println("Something went wrong...");
            }
        }

        System.out.println("\n" + "anshika"  + ", I promise I'll make it up to you! �");
    }
}
    
