/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Thomas
 */
public class ChangeHistory{
    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public String toString(){
        return this.history.toString();
    }
    
    public double maxValue(){
        if(!this.history.isEmpty()){
            double maxValue = this.history.get(0);
            for(Double change:this.history){
                if(change>maxValue){
                    maxValue = change;
                }
            }
            return maxValue;
        } else {
            return 0.0;
        }
        
    }
    
    public double minValue(){
        if(!this.history.isEmpty()){
            double minValue = this.history.get(0);
            for(Double change:this.history){
                if(change<minValue){
                    minValue = change;
                }
            }
            return minValue;
        } else {
            return 0.0;
        }
        
    }
    
    public double average(){
        if(!this.history.isEmpty()){
            double sum = 0.0;
            int counter = 0;
            for(Double number:this.history){
                sum = sum + number;
                counter++;
            }
            double average = sum/counter;
            return average;
            
        } else {
            return 0.0;
        }
    }
    
}
