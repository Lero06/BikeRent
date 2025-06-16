/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_Registers;
import java.time.LocalDateTime;
import Bikes.PedalBike;
import Persons.Users;
/**
 *
 * @author llean
 */
public class Rental_Register {
    //Attributes
    private int id;
    private PedalBike bike;
    private LocalDateTime endDate;
    private LocalDateTime startDate;
    private Users user;
    //getters

    public int getId() {
        return id;
    }

    public PedalBike getBike() {
        return bike;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public Users getUser() {
        return user;
    }
    //setters

    public void setBike(PedalBike bike) {
        this.bike = bike;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public void setUser(Users user) {
        this.user = user;
    }
    
    
    //constructor

    public Rental_Register(int id, PedalBike bike, LocalDateTime endDate, LocalDateTime startDate, Users user) {
        this.id = id;
        this.bike = bike;
        this.endDate = endDate;
        this.startDate = startDate;
        this.user = user;
    }

    //toString

    @Override
    public String toString() {
        return "Rental_Register:" + "id=" + id + ", bike=" + bike + ", endDate=" + endDate + ", startDate=" + startDate + ", user=" + user;
    }

    
}
