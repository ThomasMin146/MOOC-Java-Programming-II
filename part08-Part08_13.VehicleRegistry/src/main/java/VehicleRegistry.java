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
public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleRegistry;

    public VehicleRegistry() {
         this.vehicleRegistry = new HashMap<>();
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if(this.vehicleRegistry.containsKey(licensePlate)){
            return false;
        } else {
            this.vehicleRegistry.put(licensePlate, owner);
            return true;
        }
    }
    
    public String get(LicensePlate licensePlate){
        if(this.vehicleRegistry.containsKey(licensePlate)){
            return this.vehicleRegistry.get(licensePlate);
        } else {
            return null;
        }
    }
    
    public boolean remove(LicensePlate licensePlate){
        if(this.vehicleRegistry.containsKey(licensePlate)){
            this.vehicleRegistry.remove(licensePlate);
            return true;
        } else {
            return false;
        }
    }
    
    public void printLicensePlates(){
        for(LicensePlate plate:this.vehicleRegistry.keySet()){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
        ArrayList<String> owners = new ArrayList<>();
        
        for(String owner: this.vehicleRegistry.values()){
            if(!(owners.contains(owner))){
                owners.add(owner);
            }
        }
        for(String owner: owners){
            System.out.println(owner);
        }
    }
}
