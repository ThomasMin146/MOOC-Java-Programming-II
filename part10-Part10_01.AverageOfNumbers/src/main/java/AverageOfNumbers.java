
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<String> list = new ArrayList<>();
        
        
       while(true){
           String userInput = scanner.nextLine();
           if(userInput.equals("end")){
               break;
           }
           list.add(userInput);
           
           
       }
       double average = list.stream().mapToInt(s -> Integer.valueOf(s))
               .average().getAsDouble();
       
        System.out.println("average of the numbers: " + average);
    }
}
