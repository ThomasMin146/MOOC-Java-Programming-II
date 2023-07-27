
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
public class Hideout<T> {
    private T param;
    
    public Hideout(){
    }
    
    public void putIntoHideout(T toHide){
        param = toHide;
    }
    
    public T takeFromHideout(){
        if(param == null){
            return null;
        }
        T temp = param;
        param = null;
        return temp;
    }
    
    public boolean isInHideout(){
        if(param != null){
            return true;
        }
        return false;
    }
}
