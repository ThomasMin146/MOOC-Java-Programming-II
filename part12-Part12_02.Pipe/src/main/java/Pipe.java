
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
public class Pipe <T>{
    private ArrayList<T> list;
    
    public Pipe(){
        this.list = new ArrayList<>();
    }
    
    public void putIntoPipe(T value){
        list.add(value);
    }
    
    public T takeFromPipe(){
        if(list.size()==0){
            return null;
        }
        T temp = list.get(0);
        list.remove(0);
        return temp;
    }
    
    public boolean isInPipe(){
        if(list.size()==0){
            return false;
        } else {
            return true;
        }
    }
}
