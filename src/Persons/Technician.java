/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author llean
 */
public class Technician extends Person {
    //atributes
    private String speciality;
    
    //getters
    public String getSpeciality() {
        return speciality;
    }
    //setters
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
    //constructor
    public Technician(int id,String name,  String email,String speciality) {
        super(id,name,email);
        this.speciality = speciality;
    }
    //toString
    @Override
    public String toString() {
        return "Technician: " + super.toString() + " Speciality= " + speciality;
    }
    
}
