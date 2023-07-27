
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while(true){
            System.out.println("Input the name of the book, empty stops:");
            String userInput = scanner.nextLine();
            if(userInput.equals("")){
                break;
            }
            
            System.out.println("Input the age recommendation:");
            String userInput2 = scanner.nextLine();
            
            books.add(new Book(userInput, Integer.valueOf(userInput2)));
            
        }
        
        Comparator<Book> comparator = Comparator
                    .comparing(Book::getAgeRecommendations)
                    .thenComparing(Book::getName);

        Collections.sort(books, comparator);
        
        System.out.println(books.size()+" books in total.");
        System.out.println();
        System.out.println("Books:");
        books.stream().sorted().forEach(book->System.out.println(book));
        

    }

}
