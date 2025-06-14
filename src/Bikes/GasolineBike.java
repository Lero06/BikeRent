/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;

/**
 *
 * @author llean
 */
public class GasolineBike extends Bike {
    private String FuelLevel;

    public String getFuelLevel() {
        return FuelLevel;
    }

    public void setFuelLevel(String FuelLevel) {
        this.FuelLevel = FuelLevel;
    }

    public GasolineBike(String FuelLevel, int id, BikeStatus status, String brand) {
        super(id, status, brand);
        this.FuelLevel = FuelLevel;
    }

    @Override
    public String toString() {
        return "GasolineBike:"+ super.toString() + "FuelLevel=" + FuelLevel;
    }
    
    
    
}
