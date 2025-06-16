/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;
import Bikes.PedalBike;
/**
 *
 * @author llean
 */
public class Station {
    //attributes
    private int id;
    private String location;
    private int maxCap;
    private PedalBike pedalBike[];
    
    public void addPedalBike(PedalBike pedalBike) {
        for (int i = 0; i < maxCap; i++) {
            if(this.pedalBike[i] == null) {
                this.pedalBike[i]= pedalBike;
                break;
            }
        }
    }
    
//getters
    public int getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getMaxCap() {
        return maxCap;
    }

    public PedalBike[] getPedalBike() {
        return pedalBike;
    }

  //setters
    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public void setBikelist(int[] Bikelist) {
        //this.Bikelist = Bikelist;
    }
    
    //constructor
    
    public Station(int id, String location, int maxCap, int[] Bikelist) {
        this.id = id;
        this.location = location;
        this.maxCap = maxCap;
       // this.Bikelist = Bikelist;
    } 
    //toString

    @Override
    public String toString() {
        return "Station:" + "id=" + id + ", location=" + location + ", maxCap=" + maxCap + ", Bikelist=" ;//+ Bikelist;
    }

}
