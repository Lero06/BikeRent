/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintenance_Logs;
import Persons.Technician;
import Bikes.PedalBike;
import java.time.LocalDate;
/**
 *
 * @author llean
 */
public class Maintenance_Log {
    private LocalDate date;
    private String description;
    private Technician technician;
    private PedalBike idPedalBike;
    
    //getters

    public LocalDate getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public Technician getTechnician() {
        return technician;
    }

    public PedalBike getIdBike() {
        return idPedalBike;
    }


    //setters

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

  
    //constructor
    
    public Maintenance_Log(LocalDate date, String description, Technician technician, PedalBike idPedalBike) {
        this.date = date;
        this.description = description;
        this.technician = technician;
        this.idPedalBike = idPedalBike;
    }

    //toString

    @Override
    public String toString() {
        return "Maintenance_Logs{" + "date=" + date + ", description=" + description + ", responsible_technician=" + technician + ", idBike=" + idPedalBike + '}';
    }
    
}
