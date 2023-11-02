/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import vista.SirveVista;

/**
 *
 * @author LEONARDO
 */
public class ControladorSirvevista {
    
    private SirveVista sirveVista;

    public ControladorSirvevista(SirveVista sirveVista) {
        this.sirveVista = sirveVista;
        
        sirveVista.setVisible(true);
        }
        
    }
