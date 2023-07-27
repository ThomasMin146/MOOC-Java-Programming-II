package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }
    
    @Override
    public void start(Stage window) {
        
        BorderPane borderPane = new BorderPane();
        VBox vBox = new VBox();
        GridPane gridPane = new GridPane();
        
        Label label = new Label("First view!");
        Label label2 = new Label("Second view!");
        Label label3 = new Label("Third view!");
        
        
        
        Button back = new Button("To the second view!");
        
        Button forth = new Button("To the third view!");
        
        Button thirdBtn = new Button("To the first view!");
        
        borderPane.setTop(label);
        borderPane.setCenter(back);
        vBox.getChildren().addAll(forth, label2);
        gridPane.add(label3, 0, 0);
        gridPane.add(thirdBtn, 1, 1);
        

        Scene first = new Scene(borderPane, 200, 200);
        Scene second = new Scene(vBox, 200, 200);
        Scene third = new Scene(gridPane, 200, 200);
        
        

        back.setOnAction((event) -> {
            window.setScene(second);
        });

        forth.setOnAction((event) -> {
            window.setScene(third);
        });
        
        thirdBtn.setOnAction((event) -> {
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }

}
