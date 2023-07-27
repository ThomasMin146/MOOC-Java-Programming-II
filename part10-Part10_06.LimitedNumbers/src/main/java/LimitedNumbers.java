
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true){
            int userInput = scanner.nextInt();
            
            if(userInput < 0){
                break;
            }
            
            list.add(userInput);
            
        }
        list.stream().filter(num -> num >= 1 && num <= 5)
                .forEach(num -> System.out.println(num));
    }
}
