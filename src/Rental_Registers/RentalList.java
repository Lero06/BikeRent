/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Rental_Registers;
import Main.Lists;
/**
 *
 * @author llean
 */
public class RentalList implements Lists <Rental_Register>{ 
        private Rental_Register list[];
    
         public RentalList() {
        this.list = new Rental_Register[100];
    }
         
           @Override
    public boolean add(Rental_Register t) {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            if(list[i] == null){
                list[i]=t;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean delete(Rental_Register t) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == t) {
                list[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void sort() {
        int max = list.length;
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < max-1; j++) {
                if(list[j] != null && list[j+1] != null && list[j].getId()>list[j+1].getId()) {
                    Rental_Register temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public Rental_Register search(Object id) {
        int max = list.length;
        int idt = Integer.parseInt(id.toString());
        for (int i = 0; i <max; i++) {
            if(list[i].getId()==idt){
                return list[i];
            }
        }
        return null;
    }
}
