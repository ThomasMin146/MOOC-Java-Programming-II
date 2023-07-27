
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumPositive = 0;
        int counterPositive = 0;
        
        while(true){
            int userInput = Integer.valueOf(scanner.nextLine());
            if(userInput == 0){
                break;
            }
            
            if(userInput >= 0){
                sumPositive = sumPositive + userInput;
                counterPositive++;
                
            }
            
        }
        
        if(sumPositive == 0){
            System.out.println("Cannot calculate the average");
        } else {
            double average = 1.0*sumPositive/counterPositive;
            System.out.println(average);
        }
    }
}
