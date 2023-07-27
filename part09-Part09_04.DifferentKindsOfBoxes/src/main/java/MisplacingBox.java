
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class MisplacingBox extends Box{
    
    private ArrayList<Item> box;
    
    public MisplacingBox(){
        box = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        this.box.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        
        if(this.box.contains(item)){
            return false;
        } else{
            return false;
        } 
    }
    
}
