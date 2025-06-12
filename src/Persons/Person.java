/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persons;

/**
 *
 * @author llean
 */
public abstract class Person {
    //attributes
    protected String name;
    protected int id;
    protected String email;
    //getters
      public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    //setters
    public void setEmail(String email) {
  if(verifyEmail(email)) {
           this.email = email;
       }
    }
     public boolean verifyEmail(String email) {
     String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-z]{2,}$";
     return email.matches(regex);
    }
    // constructor
    public Person(int id,String name, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }
    //toString
    @Override
    public String toString() {
        return "ID= "+ id + " Name= " + name + " Email= " + email;
    }
}
