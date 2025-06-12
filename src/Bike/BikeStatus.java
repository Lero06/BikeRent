/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Bike;

/**
 *
 * @author llean
 */
public enum BikeStatus {
     AVAILABLE("available"),
     RENTED("rented"),
     MAINTENANCE("maintenance");
    
    private final String status;
    
    BikeStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        return status;
    }
    
}
