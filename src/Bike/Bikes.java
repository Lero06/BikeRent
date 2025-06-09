/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bike;
/**
 *
 * @author llean
 */
public class Bikes {
    
    //Atributes
    
    private int id;
    BikeStatus status;
    private String brand;
    
    //Getters
    
    public int getId() {
        return id;
    }
    
    public BikeStatus getStatus(){
        return status;
    }
    
    public String getBrand(){
        return brand;
    }
    //Setters

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public void setStatus(BikeStatus status){
        this.status = status;
    }
    //Constructor
    
    public Bikes(int id,String brand) {
        this.id = id;
        this.status = BikeStatus.AVAILABLE;
        this.brand = brand;
    }
}
