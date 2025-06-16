/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;

/**
 *
 * @author llean
 */
public class GasolineBike extends PedalBike {
    private int FuelLevel;

    public int getFuelLevel() {
        return FuelLevel;
    }

    public void setFuelLevel(int FuelLevel) {
        this.FuelLevel = FuelLevel;
    }

    public GasolineBike(int id,  String brand) {
        super(id,brand);
        this.FuelLevel = 100;
    }

    @Override
    public String toString() {
        return "GasolineBike:"+ super.toString() + "FuelLevel=" + FuelLevel;
    }
    
    
    
}
