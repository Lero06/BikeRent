/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Station;

/**
 *
 * @author llean
 */
public class Stations {
    //attributes
    private int id;
    private String location;
    private int maxCap;
    
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
    
  //setters
    public void setMaxCap(int maxCap) {
        this.maxCap = maxCap;
    }
    
    //constructor
    public Stations(int id, String location, int maxCap) {
        this.id = id;
        this.location = location;
        this.maxCap = maxCap;
    }
    
    //toString
    @Override
    public String toString() {
        return "Stations{" + "id=" + id + ", location=" + location + ", maxCap=" + maxCap + '}';
    }
}
