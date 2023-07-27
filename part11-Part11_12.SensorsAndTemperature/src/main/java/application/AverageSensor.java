/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Thomas
 */
public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> readings;
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    @Override
    public boolean isOn() {
        for(Sensor sensor:sensors){
            if(!sensor.isOn()){
                return false;
            } 
        }
        return true;
    }

    @Override
    public void setOn() {
        for (Sensor sensor : sensors) {
            sensor.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor sensor : sensors) {
            sensor.setOff();
        }
    }

    @Override
    public int read() {
        int sum = 0;
        int average = 0;
        for(Sensor sensor:sensors){
            sum = sum + sensor.read();
        }
        average = sum / sensors.size();
        this.readings.add(average);
        return average;
    }
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return readings;
        
    }
    
}
