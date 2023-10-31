/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Modelo;
import vista.MenuVista;

/**
 *
 * @author LEONARDO
 */
public class ControladorMenu {
    
   private MenuVista menu;
   private Modelo modelo;
   
   public ControladorMenu (Modelo modelo, MenuVista menu){
   
        this.modelo = modelo;
        this.menu = menu;
        
        menu.setVisible(true);
        

        
   
   };

    private static class CalculateListener implements ActionListener {

        public CalculateListener() {
        }

        @Override
           public void actionPerformed(ActionEvent e) {
               if(e.getActionCommand().equalsIgnoreCase("jugar")){
             
                   
               
             }
    }
   
   
   
    
    }   
}
