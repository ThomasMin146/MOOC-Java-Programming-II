package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application{


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }
    
        @Override
    public void start(Stage window) {

        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(120, 120, 50, 50);
        painter.fillRect(320, 120, 50, 50);
        painter.fillRect(120, 360, 250, 50);
        painter.fillRect(70, 310, 50, 50);
        painter.fillRect(370, 310, 50, 50);
        
        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        window.setScene(view);
        window.show();
    }

    


}
