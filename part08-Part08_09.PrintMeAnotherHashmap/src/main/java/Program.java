
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("pride", 1813, "...."));
        hashmap.put("happy", new Book("Don't let the pigeon drive the bus", 2003, "...."));
        printValueIfNameContains(hashmap, "ide");
    }
    
    public static void printValues(HashMap<String,Book> hashmap){
        for(Book valueElement:hashmap.values()){
            System.out.println(valueElement);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for(Book valueElement:hashmap.values()){
            if(valueElement.getName().contains(text)){
                System.out.println(valueElement);
            }
        }
    }

}
