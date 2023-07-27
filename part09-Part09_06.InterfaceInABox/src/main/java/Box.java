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
public class Box implements Packable{
    private double capacity;
    private int itemsSize;
    private ArrayList<Packable> items;
    
    public Box(double capacity){
        this.capacity = capacity;
        this.items = new ArrayList<>();
        this.itemsSize = 0;
    }
    
    public void add(Packable item){
        if(weight()+item.weight() <= this.capacity){
            this.items.add(item);
            this.itemsSize++;
        }
    }
    
    public double weight(){
        double tempSum = 0;
        for(Packable item:items){
            tempSum = tempSum + item.weight();
        }
        
        return tempSum;
    }
    
    public String toString(){
        return "Box: " + this.itemsSize + " items, total weight " + weight() + " kg";
    }
}
