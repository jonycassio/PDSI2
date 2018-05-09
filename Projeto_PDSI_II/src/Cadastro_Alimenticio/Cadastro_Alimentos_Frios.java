
package Cadastro_Alimenticio;

import Backgrounds.BG_CadAlimentos_Frios;
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


public class Cadastro_Alimentos_Frios extends JFrame {
    
    
    JButton Voltar = new JButton("Voltar");
    JButton Adicionar = new JButton("Cadastrar Bebida");
 

    JTextField Pega_Nome_Fornecedor = new JTextField();
    JTextField Pega_UnidadesKG = new JTextField();
    JTextField Pega_QuantidadeKG = new JTextField();
    JTextField Pega_Unidade_porcao = new JTextField();

    
    JComboBox<String> Pega_Frios = new JComboBox<>();
    
    
    DAO c = new DAO();

    
    public Cadastro_Alimentos_Frios() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 14);

           
        JLabel Frios = new JLabel("Frios: ");
        Pega_Frios.setBounds(240, 165, 130, 30);
        Frios.setBounds(180, 160, 130, 40);
        Pega_Frios.setFont(fonte);
        Frios.setFont(fonte);
        add(Pega_Frios);
        add(Frios);       
        
        Pega_Frios.addItem("");
        
            
        
        
        JLabel Fornecedor = new JLabel("Fornecedor:");
        Pega_Nome_Fornecedor.setBounds(270, 245, 210, 30);
        Fornecedor.setBounds(180, 240, 130, 40);
        Pega_Nome_Fornecedor.setFont(fonte);
        Fornecedor.setFont(fonte);
        add(Pega_Nome_Fornecedor);
        add(Fornecedor);
        
        
                
                
        JLabel Quantidade = new JLabel("Quantidade(KG):");
        Pega_QuantidadeKG.setBounds(770, 165, 100, 30);
        Quantidade.setBounds(650, 160, 130, 40);
        Pega_QuantidadeKG.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_QuantidadeKG);
        add(Quantidade);
        
       
    
        JLabel UKG = new JLabel("Unidades por KG:");
        Pega_UnidadesKG.setBounds(775, 215, 100, 30);
        UKG.setBounds(650, 210, 130, 40);
        Pega_UnidadesKG.setFont(fonte);
        UKG.setFont(fonte);
        add(Pega_UnidadesKG);
        add(UKG);
                
                
                
        JLabel UP = new JLabel("Unidades por porção:");
        Pega_Unidade_porcao.setBounds(805, 265, 100, 30);
        UP.setBounds(650, 260, 160, 40);
        Pega_Unidade_porcao.setFont(fonte);
        UP.setFont(fonte);
        add(Pega_Unidade_porcao);
        add(UP);
        
        
        
        Voltar.setBorder(new Borda_Redonda(7));
        Voltar.setBounds(130, 430, 160, 40);
        //Adicionar.addActionListener(this);
        Voltar.setFont(fonte);
        add(Voltar);
        
        
        Adicionar.setBorder(new Borda_Redonda(7));
        Adicionar.setBounds(808, 430, 160, 40);
        //Adicionar.addActionListener(this);
        Adicionar.setFont(fonte);
        add(Adicionar);

  
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(new BG_CadAlimentos_Frios());
        setBackground(Color.black);
        setResizable(false);
        setTitle("..:FastZooom:..");
        setSize(1100, 550);
        setLocationRelativeTo(null);
        setVisible(true);

    
    }
    
    
    
    public static void main(String [] args){
        
        new Cadastro_Alimentos_Frios();
        
    }
    
    
    
}
