
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box smallerBox = new Box(10);
        Box biggerBox = new Box(15);
        
        smallerBox.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2)) ;
        smallerBox.add(new Book("Robert Martin", "Clean Code", 1));
        smallerBox.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        biggerBox.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        biggerBox.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        biggerBox.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));
        biggerBox.add(smallerBox);
        
        System.out.println(smallerBox);
        System.out.println(biggerBox);
    }

}
