/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author Thomas
 */
public class Abbreviations {
    private HashMap<String, String> hash;
    
    public Abbreviations() {
        this.hash = new HashMap<>();
    }
    
    public void addAbbreviation(String abbreviation, String explanation){
        this.hash.put(abbreviation, explanation);
    }
    
    public boolean hasAbbreviation(String abbreviation){
        if(this.hash.containsKey(abbreviation)){
            return true;
        } else {
            return false;
        }
    }
    
    public String findExplanationFor(String abbreviation){
        return this.hash.get(abbreviation);
    }
}
