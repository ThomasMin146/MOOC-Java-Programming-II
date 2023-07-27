/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.ArrayList;
/**
 *
 * @author Thomas
 */
public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.storage.get(unit);
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        if(this.storage.get(storageUnit)==null){
            return new ArrayList<>();
        } else {
            return this.storage.get(storageUnit);
        }
    }
    
    public void remove(String storageUnit, String item){
        
        this.storage.get(storageUnit).remove(item);
        if(this.storage.get(storageUnit).isEmpty()){
            this.storage.remove(storageUnit);
        }
        
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        
        for(String unit: this.storage.keySet()){
            if(!(this.storage.get(unit)==null))
                units.add(unit);
        }
        return units;
    }
    
}
