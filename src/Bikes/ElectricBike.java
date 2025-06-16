/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;

/**
 *
 * @author llean
 */
public class ElectricBike extends PedalBike {
    private int BatteryLevel;

    public int getBatteryLevel() {
        return BatteryLevel;
    }

    public void setBatteryLevel(int BatteryLevel) {
        this.BatteryLevel = BatteryLevel;
    }

    public ElectricBike(int BatteryLevel, int id, BikeStatus status, String brand) {
        super(id, status, brand);
        this.BatteryLevel = BatteryLevel;
    }

    @Override
    public String toString() {
        return "ElectricBike:"+ super.toString() + " BatteryLevel =" + BatteryLevel;
    }
    
    
}
