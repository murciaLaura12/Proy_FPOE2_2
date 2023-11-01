/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Modelo;
import vista.MenuVista;

/**
 *
 * @author LEONARDO
 */
public class ControladorMenu {
    
   private MenuVista ClaseMenu;
   private Modelo modelo;
   
   public ControladorMenu (Modelo modelo, MenuVista ClaseMenu){
   
        this.modelo = modelo;
        this.ClaseMenu = ClaseMenu;
        
        

       
        ClaseMenu.setVisible(true);
       
        Background2 mImagen = new Background2(ClaseMenu.getPPal(), "/Imagenes/FondoJuego/FondoMenu.jpg");
        ClaseMenu.getPPal().add(mImagen).repaint();
        ClaseMenu.getPPal().setOpaque(false);
        ClaseMenu.getPPal().setBorder(null);
        ClaseMenu.getPPal().setBackground(new Color(0,0,0,0));
        
        JButton Anterior = ClaseMenu.getBtnAnterior();
        JButton Siguente = ClaseMenu.getBtnSiguiente();
        
        Anterior.setVisible(false);
        Siguente.setVisible(false);

        
   

   };


    

    public class Background2 extends JLabel{
    private int x, y;
    private final String path;

    public Background2 (JPanel panel, String path) {
        this.path = path;
        this.x = panel.getWidth();
        this.y = panel.getHeight();
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        ImageIcon img = new ImageIcon(getClass().getResource(path));
        g.drawImage(img.getImage(), 0, 0, x, y, null);
    
        }
    }
}
