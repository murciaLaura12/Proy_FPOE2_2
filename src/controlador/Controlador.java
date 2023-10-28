/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.MenuVista;

/**
 *
 * @author LEONARDO
 */
public class Controlador {
    
   private MenuVista menu;
   private Modelo modelo;
   
   public Controlador (Modelo modelo, MenuVista menu){
   
        this.modelo = modelo;
        this.menu = menu;
        
        menu.setVisible(true);
        
   
   };
   
   
   
    
    
}
