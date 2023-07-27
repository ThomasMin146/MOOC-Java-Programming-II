
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        ArrayList<String> rows = new ArrayList<>();
        try{
            Files.lines(Paths.get("literacy.csv"))
                 .forEach(row-> rows.add(row));
                 
        }
        catch(Exception e){
            System.out.println("Error: " +e.getMessage());
        }
        
        
        Collections.sort(rows, (p1, p2) -> {
            String[] split1 = p1.split(",");
            String[] split2 = p2.split(",");
            double value1 = Double.parseDouble(split1[5]);
            double value2 = Double.parseDouble(split2[5]);
            return Double.compare(value1, value2);
        });
        
        rows.stream().map(parts -> parts.split(","))
                .forEach(row-> System.out.println(row[3]
                + " (" + row[4] + "), " + row[2].trim().split(" ")[0]
                + ", " + row[5]
                ));

    }
}
