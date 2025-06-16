/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bikes;
import Main.Lists;
/**
 *
 * @author llean
 */
public class BikeList implements Lists <PedalBike> {
    private PedalBike list[];

    @Override
    public boolean add(PedalBike t) {
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
    public boolean delete(PedalBike t) {
        int max = list.length;
        for (int i = 0; i < max ; i++) {
            if(list[i]==t){
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
                    PedalBike temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public PedalBike search(Object id) {
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
