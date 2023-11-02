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
import vista.SirveVista;

/**
 *
 * @author LEONARDO
 */
public class ControladorMenu {
    
   private MenuVista ClaseMenu;
   private Modelo modelo;
   private String src;
   private Background2 mImagen;
   
   public ControladorMenu (Modelo modelo, MenuVista ClaseMenu){
   
        this.modelo = modelo;
        this.ClaseMenu = ClaseMenu;
        this.src = "/Imagenes/FondoJuego/FondoMenu.jpg";
        
        

       
        ClaseMenu.setVisible(true);
       
        mImagen = new Background2(ClaseMenu.getPPal(), src);
        ClaseMenu.getPPal().add(mImagen).repaint();
        ClaseMenu.getPPal().setOpaque(false);
        ClaseMenu.getPPal().setBorder(null);
        ClaseMenu.getPPal().setBackground(new Color(0,0,0,0));
        


        ClaseMenu.IrAInstrucciones(new SirveListener());
        
   

   };

   
   public void changeImage(){
       this.src = "/Imagenes/FondoJuego/Sirve.jpeg";
       mImagen = new Background2(ClaseMenu.getPPal(), src);
       /*ClaseMenu.getPPal().add(mImagen).repaint();*/

       
   }

   
    class SirveListener implements ActionListener{
        
                

        @Override
        public void actionPerformed(ActionEvent e) {
            
            ControladorSirvevista controladorSirvevista = new ControladorSirvevista(new SirveVista());
            ClaseMenu.setVisible(false);
         }


    }
    

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

