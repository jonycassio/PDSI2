
package Alterações;

import Backgrounds.BG_Alteracao;
import Banco_de_Dados.DAO;
import Botoes.Borda_Redonda;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Alteracao_Alimentos_Vegetais extends JFrame {
    
    
    JButton Cancelar = new JButton("Cancelar");
    JButton Alterar = new JButton("Alterar");
 

    JTextField Pega_Nome_Fornecedor = new JTextField();
    JTextField Pega_QuantsPocKG = new JTextField();
    JTextField Pega_QuantidadeKG = new JTextField();
    JTextField Pega_Preco = new JTextField();

    
    JComboBox<String> Pega_Vegetais = new JComboBox<>();
    
    
    DAO c = new DAO();

    
    public Alteracao_Alimentos_Vegetais() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 15);

           
        JLabel Vegetais = new JLabel("Vegetais: ");
        Pega_Vegetais.setBounds(255, 185, 130, 30);
        Vegetais.setBounds(180, 180, 130, 40);
        Pega_Vegetais.setFont(fonte);
        Vegetais.setFont(fonte);
        add(Pega_Vegetais);
        add(Vegetais);       
        
        Pega_Vegetais.addItem("");
        Pega_Vegetais.addItem("Tomate");
        Pega_Vegetais.addItem("Alface");
        
            
        
        
        JLabel Fornecedor = new JLabel("Fornecedor:");
        Pega_Nome_Fornecedor.setBounds(275, 265, 210, 30);
        Fornecedor.setBounds(180, 260, 130, 40);
        Pega_Nome_Fornecedor.setFont(fonte);
        Fornecedor.setFont(fonte);
        add(Pega_Nome_Fornecedor);
        add(Fornecedor);
        
        
                
                
        JLabel Quantidade = new JLabel("Quantidade(KG):");
        Pega_QuantidadeKG.setBounds(775, 165, 100, 30);
        Quantidade.setBounds(650, 160, 130, 40);
        Pega_QuantidadeKG.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_QuantidadeKG);
        add(Quantidade);
        
       
    
        JLabel UKG = new JLabel("Quant. por Porção:");
        Pega_QuantsPocKG.setBounds(790, 225, 100, 30);
        UKG.setBounds(650, 220, 160, 40);
        Pega_QuantsPocKG.setFont(fonte);
        UKG.setFont(fonte);
        add(Pega_QuantsPocKG);
        add(UKG);
                
                
                
        JLabel UP = new JLabel("Preço por Kg:");
        Pega_Preco.setBounds(755, 285, 100, 30);
        UP.setBounds(650, 280, 160, 40);
        Pega_Preco.setFont(fonte);
        UP.setFont(fonte);
        add(Pega_Preco);
        add(UP);
        
        
        
        Cancelar.setBorder(new Borda_Redonda(7));
        Cancelar.setBounds(130, 430, 160, 40);
        //Cancelar.addActionListener(this);
        Cancelar.setFont(fonte);
        add(Cancelar);
        
        
        Alterar.setBorder(new Borda_Redonda(7));
        Alterar.setBounds(808, 430, 160, 40);
        //Alterar.addActionListener(this);
        Alterar.setFont(fonte);
        add(Alterar);

  
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(new BG_Alteracao());
        setBackground(Color.black);
        setResizable(false);
        setTitle("..:FastZooom:..");
        setSize(1100, 550);
        setLocationRelativeTo(null);
        setVisible(true);

    
    }
    
    
    
    public static void main(String [] args){
        
        new Alteracao_Alimentos_Vegetais();
        
    }
    
    
    
}
