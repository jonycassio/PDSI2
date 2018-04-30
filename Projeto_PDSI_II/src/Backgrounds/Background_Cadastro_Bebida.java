package Backgrounds;

import Backgrounds.Background_Principal;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background_Cadastro_Bebida extends JPanel{
    
    public void paintComponent(Graphics g){
    
        Dimension t = getSize();

        ImageIcon img = new ImageIcon(new ImageIcon(getClass().getResource("/Imagens/Cadastro_Bebida.png")).getImage());

        g.drawImage (img.getImage(), 0, 0, t.width, t.height, null);
    
    }
    
    public static void main(String[]args){
        
        new Background_Principal();
        
    }
    
}
