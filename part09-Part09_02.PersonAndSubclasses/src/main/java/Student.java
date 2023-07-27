/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Thomas
 */
public class Student extends Person{
    private int credits;

    public Student(String name, String address) {
        super(name, address);
        
    }

    public int credits() {
        return credits;
    }
    
    public void study(){
        this.credits++;
    }

    @Override
    public String toString() {
        return super.toString()+"\n  "+"Study credits "+this.credits; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
