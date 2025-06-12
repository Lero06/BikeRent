/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_Register;

/**
 *
 * @author llean
 */
public class Rental_Registers {
    //Attributes
    private int id;
    private int idUser;
    private String EndDateAndTime;
    
    //getters

    public int getId() {
        return id;
    }

    public int getIdUser() {
        return idUser;
    }

    public String getEndDateAndTime() {
        return EndDateAndTime;
    }
    
    //setters

    public void setEndDateAndTime(String EndDateAndTime) {
        this.EndDateAndTime = EndDateAndTime;
    }
    
    //constructor

    public Rental_Registers(int id, int idUser, String EndDateAndTime) {
        this.id = id;
        this.idUser = idUser;
        this.EndDateAndTime = EndDateAndTime;
    }
    
    //toString

    @Override
    public String toString() {
        return "Rental_Registers{" + "id=" + id + ", idUser=" + idUser + ", EndDateAndTime=" + EndDateAndTime + '}';
    }
    
}
