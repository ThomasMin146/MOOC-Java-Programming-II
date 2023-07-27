/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class CD implements Packable{
    private String artist;
    private String cdName;
    private int pubYear;
    private double weight;
    
    public CD(String artist, String cdName,int pubYear){
        this.artist = artist;
        this.cdName = cdName;
        this.pubYear = pubYear;
        this.weight = 0.1;
    }
    
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString(){
        return this.artist + ": " + this.cdName + " (" + this.pubYear + ")";
    }
}
