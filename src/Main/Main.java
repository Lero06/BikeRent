/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Persons.Person;
import Persons.Users;
import Persons.Technician;
/**
 *
 * @author llean
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Users u1 = new Users(2,"Carlos","Carlos@gmail.com","88888888");
        Technician t1 = new Technician(3,"Ana","Ana@gmail.com","tyre");
        System.out.println(u1);
        System.out.println(t1);
    }
    
}
