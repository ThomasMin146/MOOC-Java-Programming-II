/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Thomas
 */
public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        
        while(true){
            System.out.println("Command:");
            String userInput = this.scanner.nextLine();
            if(userInput.equals("add")){
                System.out.println("To add:");
                String addInput = scanner.nextLine();
                this.todoList.add(addInput);
                
            } else if(userInput.equals("list")){
                this.todoList.print();
                
            } else if(userInput.equals("remove")){
                System.out.println("Which one is removed?");
                int numberInput = Integer.valueOf(scanner.nextLine());
                this.todoList.remove(numberInput);
                
            } else if (userInput.equals("stop")){
                break;
            }
        }
    }
    
    
}
