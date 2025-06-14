/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stations;

/**
 *
 * @author llean
 */
public class Station {
    //attributes
    private int id;
    private String location;
    private int maxCap;
    private int[] Bikelist;
    
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

    public int[] getBikelist() {
        return Bikelist;
    }
    
  //setters
    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }

    public void setBikelist(int[] Bikelist) {
        this.Bikelist = Bikelist;
    }
    
    //constructor
    
    public Station(int id, String location, int maxCap, int[] Bikelist) {
        this.id = id;
        this.location = location;
        this.maxCap = maxCap;
        this.Bikelist = Bikelist;
    } 
    //toString

    @Override
    public String toString() {
        return "Station:" + "id=" + id + ", location=" + location + ", maxCap=" + maxCap + ", Bikelist=" + Bikelist;
    }

}
