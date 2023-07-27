/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author Thomas
 */
public class ShoppingCart {
    private Map<String,Item> listOfItems;

    public ShoppingCart() {
        this.listOfItems = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(listOfItems.containsKey(product)){
            Item item = listOfItems.get(product);
            item.increaseQuantity();
            listOfItems.put(product, item);
        } else {
            this.listOfItems.put(product, new Item(product, 1, price));
        }
        
    }
    
    public int price(){
        int sum =0;
        for(Item item:this.listOfItems.values()){
            sum = sum + item.price();
        }
        return sum;
    }
    
    public void print(){
        for(Item item:this.listOfItems.values()){
            System.out.println(item);
        }
    }
}
