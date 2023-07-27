/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Thomas
 */
public class TemperatureSensor implements Sensor{
    
    private boolean sensor;
    private int temp;
    
    public TemperatureSensor(){
        this.sensor = false; 
    }

    @Override
    public boolean isOn() {
        return this.sensor;
    }

    @Override
    public void setOn() {
        this.sensor = true;
    }

    @Override
    public void setOff() {
        this.sensor = false;
    }

    @Override
    public int read() {
        if(sensor){
            Random random = new Random();
            this.temp = random.nextInt(61)-30;
            return this.temp;
        } else {
            throw new IllegalStateException();
        }
    }
    
}
