package FlightControl;
import ui.TextUI;
import FlightControl.logic.FlightControl;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // Write the main program here. It is useful to create some classes of your own.
        FlightControl fControl = new FlightControl();
        Scanner scanner = new Scanner(System.in);
        TextUI ui = new TextUI(fControl, scanner);
        
        ui.start();
        
    }
}
