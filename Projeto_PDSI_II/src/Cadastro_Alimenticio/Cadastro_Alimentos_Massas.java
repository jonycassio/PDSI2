
package Cadastro_Alimenticio;

import Backgrounds.BG_CadAlimentos_Massas;
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


public class Cadastro_Alimentos_Massas extends JFrame {
    
    
    JButton Voltar = new JButton("Voltar");
    JButton Adicionar = new JButton("Cadastrar");
 

    JTextField Pega_Nome_Fornecedor = new JTextField();
    JTextField Pega_UnidadesKG = new JTextField();
    JTextField Pega_QuantidadeKG = new JTextField();
    JTextField Pega_Unidade_porcao = new JTextField();

    
    JComboBox<String> Pega_Massas = new JComboBox<>();
    
    
    DAO c = new DAO();

    
    public Cadastro_Alimentos_Massas() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 14);

           
        JLabel Massas = new JLabel("Massas: ");
        Pega_Massas.setBounds(250, 165, 130, 30);
        Massas.setBounds(180, 160, 130, 40);
        Pega_Massas.setFont(fonte);
        Massas.setFont(fonte);
        add(Pega_Massas);
        add(Massas);       
        
        Pega_Massas.addItem("");
        
            
        
        
        JLabel Fornecedor = new JLabel("Fornecedor:");
        Pega_Nome_Fornecedor.setBounds(270, 245, 210, 30);
        Fornecedor.setBounds(180, 240, 130, 40);
        Pega_Nome_Fornecedor.setFont(fonte);
        Fornecedor.setFont(fonte);
        add(Pega_Nome_Fornecedor);
        add(Fornecedor);
        
        
                
                
        JLabel Quantidade = new JLabel("Quantidade:");
        Pega_QuantidadeKG.setBounds(740, 165, 100, 30);
        Quantidade.setBounds(650, 160, 130, 40);
        Pega_QuantidadeKG.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_QuantidadeKG);
        add(Quantidade);
        
                
                
        JLabel UP = new JLabel("Unidades por porção:");
        Pega_Unidade_porcao.setBounds(805, 225, 100, 30);
        UP.setBounds(650, 220, 160, 40);
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
        add(new BG_CadAlimentos_Massas());
        setBackground(Color.black);
        setResizable(false);
        setTitle("..:FastZooom:..");
        setSize(1100, 550);
        setLocationRelativeTo(null);
        setVisible(true);

    
    }
    
    
    
    public static void main(String [] args){
        
        new Cadastro_Alimentos_Massas();
        
    }
    
    
    
}
