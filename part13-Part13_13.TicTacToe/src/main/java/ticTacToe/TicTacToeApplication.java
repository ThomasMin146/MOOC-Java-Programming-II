package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;



public class TicTacToeApplication extends Application {
    private Button[] buttons = new Button[9];
    private AppLogic logic = new AppLogic();
    private Label turnText = new Label("Turn: X");
    private GridPane gPane = new GridPane();


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        BorderPane bPane = new BorderPane();
        
        turnText.setStyle("-fx-font-size: 30pt;");
        
        bPane.setTop(turnText);

        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new Button(" ");
            buttons[i].setFont(Font.font("Monospaced", 40));
            final int index = i; // To capture the current index in lambda
            buttons[i].setOnAction((event) -> handleButtonClick(index));
            gPane.add(buttons[i], i % 3, i / 3);
        }
        
        gPane.setHgap(10);
        gPane.setVgap(10);
        
        bPane.setMargin(gPane, new javafx.geometry.Insets(10));
        
        bPane.setCenter(gPane);

        Scene view = new Scene(bPane);

        stage.setScene(view);
        stage.show();
    }
    
    private void handleButtonClick(int index) {
        int row = index / 3;
        int col = index % 3;
        if (logic.isTurn()) {
            buttons[index].setText("X");
            logic.setTurn(false);
            turnText.setText("Turn: O");
            logic.setArray(row, col, 1);
        } else {
            buttons[index].setText("O");
            logic.setTurn(true);
            turnText.setText("Turn: X");
            logic.setArray(row, col, 2);
        }
        buttons[index].setDisable(true);
        if (logic.isFinished()) {
            turnText.setText("The end!");
            for (int i = 0; i < gPane.getChildren().size(); i++) {
                gPane.getChildren().get(i).setDisable(true);
            }
        }
    }

}
