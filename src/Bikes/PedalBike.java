/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;

/**
 *
 * @author llean
 */
public class PedalBike extends Bike {

    public PedalBike(int id, BikeStatus status, String brand) {
        super(id, status, brand);
    }

    @Override
    public String toString() {
        return "PedalBike:" + super.toString();
    }
    
}