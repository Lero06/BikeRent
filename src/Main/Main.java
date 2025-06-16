/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;
import Bikes.*;
/**
 *
 * @author llean
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PedalBike b1 = new PedalBike(1,"superpro");
        ElectricBike b2 = new ElectricBike(2,"energy");
        GasolineBike b3 = new GasolineBike(3,"yamaha");
        
        BikeList bikeList = new BikeList();
        bikeList.add(b2);
        bikeList.add(b3);
        bikeList.add(b1);
        
        System.out.println(bikeList.delete(2));
    }
    
}
