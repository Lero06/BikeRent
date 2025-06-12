/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author llean
 */
public class Users extends Person {
    //attributes
    private String phone;
    //getters
    public String getPhone() {
        return phone;
    }
    //setters
    public void setPhone(String phone) {
       if (verifyPhone(phone)) {
            this.phone= phone;
        }
    }
      public boolean verifyPhone(String phone) {
        String regex = "^\\d{4}-\\d{4}$";
        return phone.matches(regex);
    }
    //constructor
        public Users(int id,String name, String email,String phone) {
            super(id,name,email);
            this.phone = phone;
        }
    //toString
    @Override
    public String toString() {
        return "Users: " + super.toString() + " phone= " + phone ;
    }
}
