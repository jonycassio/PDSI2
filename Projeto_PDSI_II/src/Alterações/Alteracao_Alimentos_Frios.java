
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


public class Alteracao_Alimentos_Frios extends JFrame {
    
    
    JButton Cancelar = new JButton("Cancelar");
    JButton Alterar = new JButton("Alterar");

    JTextField Pega_Nome_Fornecedor = new JTextField();
    JTextField Pega_Preco = new JTextField();
    JTextField Pega_Total_Compra = new JTextField();
    JTextField Pega_QuantidadeKG = new JTextField();
    JTextField Pega_Unidade_porcao = new JTextField();
    JTextField Pega_PT = new JTextField();

    
    JComboBox<String> Pega_Frios = new JComboBox<>();
    
    
    DAO c = new DAO();

    
    public Alteracao_Alimentos_Frios() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 15);

           
        JLabel Frios = new JLabel("Frios: ");
        Pega_Frios.setBounds(230, 185, 210, 30);
        Frios.setBounds(180, 180, 130, 40);
        Pega_Frios.setFont(fonte);
        Pega_Frios.setEnabled(true);
        Frios.setFont(fonte);
        add(Pega_Frios);
        add(Frios); 
        
           
        Pega_Frios.addItem("");
        Pega_Frios.addItem("peito de frango");
        Pega_Frios.addItem("peito de peru");
        Pega_Frios.addItem("frango");
        Pega_Frios.addItem("salsicha");
        Pega_Frios.addItem("Ovo");
          
            
        
        
        JLabel Fornecedor = new JLabel("Fornecedor:");
        Pega_Nome_Fornecedor.setBounds(275, 265, 210, 30);
        Fornecedor.setBounds(180, 260, 130, 40);
        Pega_Nome_Fornecedor.setFont(fonte);
        Fornecedor.setFont(fonte);
        add(Pega_Nome_Fornecedor);
        add(Fornecedor);
        
        
                
                
        JLabel Quantidade = new JLabel("Quantidade(KG):");
        Pega_QuantidadeKG.setBounds(620, 195, 100, 30);
        Quantidade.setBounds(610, 160, 130, 40);
        Pega_QuantidadeKG.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_QuantidadeKG);
        add(Quantidade);
        
       
    
        JLabel UKG = new JLabel("Preço por Kg:");
        Pega_Preco.setBounds(820, 195, 100, 30);
        UKG.setBounds(820, 160, 130, 40);
        Pega_Preco.setFont(fonte);
        UKG.setFont(fonte);
        add(Pega_Preco);
        add(UKG);
        
        
        
        JLabel UP = new JLabel("Quant. por porção:");
        Pega_Unidade_porcao.setBounds(625, 275, 100, 30);
        UP.setBounds(610, 240, 160, 40);
        Pega_Unidade_porcao.setFont(fonte);
        UP.setFont(fonte);
        add(Pega_Unidade_porcao);
        add(UP);
        
         
        JLabel PT = new JLabel("Total Compra:");
        Pega_PT.setBounds(820, 275, 100, 30);
        PT.setBounds(820, 240, 100, 40);
        Pega_PT.setEditable(false);   
        Pega_PT.setFont(fonte);
        PT.setFont(fonte);
        add(Pega_PT);
        add(PT);
                
                
                
        
        
        
        
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
        
        new Alteracao_Alimentos_Frios();
        
    }
    
    
    
}
