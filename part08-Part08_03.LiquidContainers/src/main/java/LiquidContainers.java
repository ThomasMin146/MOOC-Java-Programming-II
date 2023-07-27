
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int holdLimit = 100;
        int firstHoldAmount = 0;
        int secondHoldAmount = 0;
        
        while (true) {
            System.out.println("First: "+firstHoldAmount + "/" + holdLimit);
            System.out.println("Second: "+secondHoldAmount + "/" + holdLimit);
            
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            
            String[] parts = input.split(" ");

            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            if(command.equals("add")){
                if(firstHoldAmount+amount>holdLimit){
                    firstHoldAmount = holdLimit;
                } else if (amount > 0) {
                    firstHoldAmount = firstHoldAmount + amount;
                }
            } else if (command.equals("move")){
                
                if(amount >= 0){
                    if(firstHoldAmount - amount < 0){
                        secondHoldAmount = secondHoldAmount + firstHoldAmount;
                        firstHoldAmount = 0;
                    } else{
                        firstHoldAmount = firstHoldAmount - amount;
                        if(secondHoldAmount + amount > 100){
                            secondHoldAmount = holdLimit;
                        } else{
                            secondHoldAmount = secondHoldAmount + amount;
                        }
                    }
                }
                
            } else if (command.equals("remove")){
                if(secondHoldAmount - amount < 0){
                    secondHoldAmount = 0;
                } else {
                    secondHoldAmount = secondHoldAmount - amount;
                }
                
            }

        }
    }

}
