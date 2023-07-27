package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class NotifierApplication extends Application{


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }
    
    @Override
    public void start(Stage window) {
        TextField leftText = new TextField();
        Label rightText = new Label();
        Button button = new Button("Copy");

        button.setOnAction((event) -> {
            rightText.setText(leftText.getText());
        });

        VBox componentGroup = new VBox();
        componentGroup.setSpacing(10);
        componentGroup.getChildren().addAll(leftText, button, rightText);

        Scene scene = new Scene(componentGroup);

        window.setScene(scene);
        window.show();
    }
    

}
