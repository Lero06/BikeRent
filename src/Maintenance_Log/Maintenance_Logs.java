/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintenance_Log;

/**
 *
 * @author llean
 */
public class Maintenance_Logs {
    private String date;
    private String description;
    private String responsible_technician;
    private int idBike;
    
    //getters

    public String getDate() {
        return date;
    }

    public String getDescription() {
        return description;
    }

    public String getResponsible_technician() {
        return responsible_technician;
    }

    public int getIdBike() {
        return idBike;
    }
    //setters

    public void setDate(String date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setResponsible_technician(String responsible_technician) {
        this.responsible_technician = responsible_technician;
    }
    //constructor

    public Maintenance_Logs(String date, String description, String responsible_technician, int idBike) {
        this.date = date;
        this.description = description;
        this.responsible_technician = responsible_technician;
        this.idBike = idBike;
    }
    //toString

    @Override
    public String toString() {
        return "Maintenance_Logs{" + "date=" + date + ", description=" + description + ", responsible_technician=" + responsible_technician + ", idBike=" + idBike + '}';
    }
    
}
