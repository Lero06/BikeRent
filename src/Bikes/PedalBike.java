/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;
/**
 *
 * @author llean
 */
public class PedalBike {
    
    //Atributes
    
    private int id;
    private BikeStatus status;
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

    public PedalBike(int id,  String brand) {
        this.id = id;
        this.status = BikeStatus.AVAILABLE;
        this.brand = brand;
    }
    
    //toString

    @Override
    public String toString() {
        return "id=" + id + ", status=" + status + ", brand=" + brand;
    }
    
}
