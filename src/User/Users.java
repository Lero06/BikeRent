/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;

/**
 *
 * @author llean
 */
public class Users {
    //attributes
    private String name;
    private int id;
    private String phone;
    private String email;

    //getters
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    //setters
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //constructor

    public Users(String name, int id, String phone, String email) {
        this.name = name;
        this.id = id;
        this.phone = phone;
        this.email = email;
    }
    
    //toString

    @Override
    public String toString() {
        return "Users{" + "name=" + name + ", id=" + id + ", phone=" + phone + ", email=" + email + '}';
    }
    
}
