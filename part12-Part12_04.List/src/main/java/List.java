/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class List <T> {
    private T[] values;
    private int index;

    public List() {
        this.values = (T[]) new Object[10];
        index = 0;
    }
    
    public void add(T value){
        if(index == values.length){
            grow();
        }
        values[index] = value;
        index++;
    }
    
    private void grow(){
        int newSize = values.length + values.length/2;
        T[] newValues = (T[]) new Object[newSize];
        for(int i = 0;i<values.length;i++){
            newValues[i] = values[i];
        }
        
        values = newValues;
    }
    
    public boolean contains(T value){
        for(int i = 0; i<index;i++){
            if(values[i].equals(value)){
                return true;
            }
        }
        return false;
    }
    
    public void remove(T value){
        int indexOfValue = indexOfValue(value);
        if (indexOfValue < 0) {
            return; // not found
        }
        
        moveToTheLeft(indexOfValue);
        index--;
    }
    
    public int indexOfValue(T value) {
        for (int i = 0; i < index; i++) {
            if (this.values[i].equals(value)) {
                return i;
            }
        }

        return -1;
    }
    
    private void moveToTheLeft(int fromIndex) {
        for (int i = fromIndex; i < index - 1; i++) {
            this.values[i] = this.values[i + 1];
        }
    }
    
    public T value(int index){
        if(index < 0 || index > this.index){
            throw new ArrayIndexOutOfBoundsException("Index " + index + " outside of [0, " + this.index + "]"); 
        } else {
            return values[index];
        }
        
    }
    
    public int size() {
        return index;
    }
    
}
