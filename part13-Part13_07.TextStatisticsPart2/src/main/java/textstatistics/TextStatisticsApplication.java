package textstatistics;

import java.util.Arrays;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application{


    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();

        HBox texts = new HBox();
        
        Label letters = new Label("Letters: 0");
        Label wrds = new Label("Words: 0");
        Label longst = new Label("The longest word is: 0");
        
        texts.setSpacing(10);
        texts.getChildren().add(letters);
        texts.getChildren().add(wrds);
        texts.getChildren().add(longst);

        TextArea tArea = new TextArea("");
        
        tArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

            // set values of text elements
            letters.setText("Letters: " + characters);
            wrds.setText("Words: " + words);
            longst.setText("The longest word is: " + longest);
            
            
        });
        
        layout.setBottom(texts);

        layout.setCenter(tArea);

        Scene view = new Scene(layout);

        window.setScene(view);
        window.show();
    }

}
