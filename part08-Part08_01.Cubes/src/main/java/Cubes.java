
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String userInput = scanner.nextLine();
            if(userInput.equals("end")){
                break;
            } else{
                int num = Integer.valueOf(userInput);
                int result = num*num*num;
                System.out.println(result);
            }
            
        }

    }
}
