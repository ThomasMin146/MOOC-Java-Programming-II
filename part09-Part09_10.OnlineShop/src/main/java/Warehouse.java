/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/**
 *
 * @author Thomas
 */
public class Warehouse {
    private Map<String, Integer> map;
    private Map<String, Integer> mapStock;
    
    
    public Warehouse(){
        this.map = new HashMap<>();
        this.mapStock = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.map.put(product, price);
        this.mapStock.put(product, stock);
    }
    
    public int price(String product){
        if(this.map.containsKey(product)){
            return this.map.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.mapStock.containsKey(product)){
            return this.mapStock.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product){
        if(this.mapStock.containsKey(product)){
            int tempStock = this.mapStock.get(product);
            if(tempStock > 0){
                tempStock--;
                this.mapStock.remove(product);
                this.mapStock.put(product, tempStock);
                return true;
            }
            return false;
        } else {
            return false;
        }
    }
    
    public Set<String> products(){
        return this.map.keySet();
    }
}
