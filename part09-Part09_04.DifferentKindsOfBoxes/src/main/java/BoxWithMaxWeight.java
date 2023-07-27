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
public class BoxWithMaxWeight extends Box {
    private int capacity;
    private ArrayList<Item> box;
    
    public BoxWithMaxWeight(int capacity){
        this.capacity = capacity;
        box = new ArrayList<>();
    }
    @Override
    public void add(Item item){
        int temp = 0;
        for(Item oneItem:box){
            temp = temp+oneItem.getWeight();
        }
        
        
        if(temp + item.getWeight()<=this.capacity){
            this.box.add(item);
        }
        
    }
    @Override
    public boolean isInBox(Item item){
        
        if(this.box.contains(item)){
            return true;
        } else{
            return false;
        }
                
        
    }
}
