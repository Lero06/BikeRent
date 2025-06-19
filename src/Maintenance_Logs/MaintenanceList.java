/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Maintenance_Logs;
import Main.Lists;
/**
 *
 * @author llean
 */
public class MaintenanceList implements Lists <Maintenance_Log>{ 
        private Maintenance_Log list[];
    
         public MaintenanceList() {
        this.list = new Maintenance_Log[100];
    }
         
           @Override
    public boolean add(Maintenance_Log t) {
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
    public boolean delete(Maintenance_Log t) {
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
                    Maintenance_Log temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
    }

    @Override
    public Maintenance_Log search(Object id) {
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
