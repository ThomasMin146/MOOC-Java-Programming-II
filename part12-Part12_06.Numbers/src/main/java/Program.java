
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        
        String userInput = scanner.nextLine();
        
        Random ladyLuck = new Random(); // create Random object ladyLuck

        for (int i = 0; i < Integer.valueOf(userInput); i++) {
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(11);
            System.out.println(randomNumber);
        }
    }

}
