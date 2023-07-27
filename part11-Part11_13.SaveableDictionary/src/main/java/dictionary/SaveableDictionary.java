/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Thomas
 */
public class SaveableDictionary {
    private Map<String, String> dictionary;
    private Map<String, String> dictionary2;
    private String file;
    
    public SaveableDictionary(){
        this.dictionary = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.file = null;
    }
    
    public SaveableDictionary(String file){
        this.dictionary = new HashMap<>();
        this.dictionary2 = new HashMap<>();
        this.file = file;
        
    }
    
    public void add(String words, String translation){
        this.dictionary.putIfAbsent(words, translation);
        this.dictionary2.putIfAbsent(translation, words);
    }
    
    public String translate(String word){
        String w = this.dictionary.get(word);
        if(w==null){
            w = this.dictionary2.get(word);
        }
        return w;
    }
    
    public void delete(String word){
        if (this.dictionary.containsKey(word)) {
            String val = this.dictionary.get(word);
            this.dictionary2.remove(val);
            this.dictionary.remove(word);
        }

        if (this.dictionary2.containsKey(word)) {
            String val = this.dictionary2.get(word);
            this.dictionary.remove(val);
            this.dictionary2.remove(word);
        }
    }
    
    
    
    
    
    public boolean load(){

        List<String> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get(this.file))
                    .forEach(row -> rows.add(row));

            for (String line : rows) {
                String[] parts = line.split(":");
                this.add(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
    
    public boolean save(){
        try {
            PrintWriter writer = new PrintWriter(this.file);
            for (String key : this.dictionary.keySet()) {
                writer.println(key + ":" +this.dictionary.get(key));
            }
            writer.close();
            return true;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }
}
