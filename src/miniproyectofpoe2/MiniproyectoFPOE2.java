/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miniproyectofpoe2;

import controlador.ControladorMenu;
import modelo.Modelo;
import vista.MenuVista;

/**
 *
 * @author LAURA
 */
public class MiniproyectoFPOE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MenuVista menu = new MenuVista();
        
        Modelo modelo = new Modelo();
        
        ControladorMenu controlador = new ControladorMenu(modelo, menu);
      
    }
    
}
