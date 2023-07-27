
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        ArrayList<String> list = new ArrayList<>();
        
        System.out.println("Input numbers, type \"end\" to stop.");
        
        while(true){
            
            String userInput = scanner.nextLine();
            
            if(userInput.equals("end")){
                break;
            }
            
            list.add(userInput);
        }
        
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String userInput2 = scanner.nextLine();
        
        if(userInput2.equals("n")){
            double negative = list.stream().mapToInt(s -> Integer.valueOf(s))
                                .filter(n -> n <= 0).average().getAsDouble();
            System.out.println("Average of the negative numbers: " + negative);
        }
        
        if(userInput2.equals("p")){
            double positive = list.stream().mapToInt(s -> Integer.valueOf(s))
                                .filter(n -> n >= 0).average().getAsDouble();
            System.out.println("Average of the positive numbers: " + positive);
        }

    }
}
