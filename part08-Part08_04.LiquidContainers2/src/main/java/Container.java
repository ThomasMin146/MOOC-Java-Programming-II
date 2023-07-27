/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Container {
    private int holdAmount;
    private int bottomLimit;
    private int upperLimit;
    
    public Container() {
        this.holdAmount = 0;
        this.bottomLimit = 0;
        this.upperLimit = 100;
    }
    
    public int contains(){
        return this.holdAmount;
    }
    
    public void add(int amount){
        if(amount > 0){
            if(this.holdAmount + amount > upperLimit){
                this.holdAmount = upperLimit;
            } else {
                this.holdAmount = this.holdAmount + amount;
            }
        }
        
    }
    
    public void remove(int amount){
        if(this.holdAmount - amount < bottomLimit){
            this.holdAmount = bottomLimit;
        } else {
            this.holdAmount = this.holdAmount - amount;
        }
    }
    
    public String toString(){
        return this.holdAmount + "/" + this.upperLimit;
    }
}
