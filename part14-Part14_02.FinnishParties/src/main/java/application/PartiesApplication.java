package application;

import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application{

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    @Override
    public void start(Stage stage) {
        
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        getValues().keySet().stream().forEach(party ->{
            XYChart.Series data = new XYChart.Series();
            data.setName(party);
            
            getValues().get(party).entrySet().stream().forEach(pair -> {
                
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });
            
            lineChart.getData().add(data);
        });
        
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
    
    public static HashMap<String, HashMap<Integer, Double>> getValues() {
        HashMap<String, HashMap<Integer, Double>> values = new HashMap<>();
        ArrayList<Integer> years = new ArrayList<>();

        try(Scanner data = new Scanner(Paths.get("partiesdata.tsv"))) {
            String row = data.nextLine();
            String[] pieces = row.split("\t");
            for (int i = 1; i < pieces.length; i++) {
                years.add(Integer.parseInt(pieces[i]));
            }

            while (data.hasNext()) {
                String next = data.nextLine();
                pieces = next.split("\t");
                String party = pieces[0];
                HashMap<Integer, Double> innerValues = new HashMap<>();
                for (int i = 1; i < pieces.length; i++) {
                    if (!pieces[i].equals("-")) {
                        
                        innerValues.put(years.get(i-1), Double.valueOf(pieces[i]));
                    }

                }
                values.put(party, innerValues);
            }

        } catch(Exception e) {
            System.err.println("Error: " + e.toString());
        }

        return values;
    }
}
