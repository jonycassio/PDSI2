
package Cadastro_Alimenticio;

import Backgrounds.BG_CadAlimentos_Bebida;
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
import projeto_pdsi_ii.Bebida;
import projeto_pdsi_ii.Lanche;
import projeto_pdsi_ii.Registro;


public class Cadastro_de_Bebidas extends JFrame {
    
    
    JButton Voltar = new JButton("Voltar");
    JButton Adicionar = new JButton("Cadastrar Bebida");

    
    ArrayList<Registro> RegistroList = new ArrayList<Registro>();
    ArrayList<Lanche> LancheList = new ArrayList<Lanche>();
    ArrayList<Bebida> BebidaList = new ArrayList<Bebida>();
    
    
    ArrayList<String> Refrigerante = new ArrayList<>();
    ArrayList<String> Suco = new ArrayList<>();
    ArrayList<String> Milkshake = new ArrayList<>();


    JTextField Pega_Nome_Bebida = new JTextField();
    JTextField Pega_Quantidade_Bebida = new JTextField();
    JTextField Pega_Preco_Bebida = new JTextField();
    JTextField Pega_Volume_Bebida = new JTextField();
    JTextField Pega_Nome_Fornecedor = new JTextField();

    
    JTextArea Mostra_Quantidade = new JTextArea();
    JTextArea Mostra_Modelo = new JTextArea();
    JTextArea Mostra_Marca = new JTextArea();
    JTextArea Mostra_Preco = new JTextArea();
    JTextArea Mostra_Nome = new JTextArea();

    
    JComboBox<String> Pega_Tipo_Bebida = new JComboBox<>();
    
    
    JRadioButton Pequeno = new JRadioButton("300 ML");
    JRadioButton Medio = new JRadioButton("600 ML");
    JRadioButton Grande1 = new JRadioButton("1 L");
    JRadioButton Grande2 = new JRadioButton("2 L");
    ButtonGroup volume = new ButtonGroup();
    
  
    DAO c = new DAO();

    float total = 0;
    
    int indexLanhe = 0, indexBebida = 0, tipo = 0;

    
    
    public Cadastro_de_Bebidas() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 14);

           
        JLabel Tipo_Bebida = new JLabel("Tipo: ");
        Pega_Tipo_Bebida.setBounds(240, 165, 130, 30);
        Tipo_Bebida.setBounds(180, 160, 130, 40);
        Pega_Tipo_Bebida.setFont(fonte);
        Tipo_Bebida.setFont(fonte);
        add(Pega_Tipo_Bebida);
        add(Tipo_Bebida);       
        
        Pega_Tipo_Bebida.addItem("");
        Pega_Tipo_Bebida.addItem("Refrigerante");
        Pega_Tipo_Bebida.addItem("Suco");
        Pega_Tipo_Bebida.addItem("Milkshack");
            
        
        
        JLabel Nome_Bebida = new JLabel("Bebida:");
        Pega_Nome_Bebida.setBounds(240, 225, 210, 30);
        Nome_Bebida.setBounds(180, 220, 130, 40);
        Pega_Nome_Bebida.setFont(fonte);
        Nome_Bebida.setFont(fonte);
        add(Pega_Nome_Bebida);
        add(Nome_Bebida);
        
        
        
        JLabel Fornecedor = new JLabel("Fornecedor:");
        Pega_Nome_Fornecedor.setBounds(270, 285, 210, 30);
        Fornecedor.setBounds(180, 280, 130, 40);
        Pega_Nome_Fornecedor.setFont(fonte);
        Fornecedor.setFont(fonte);
        add(Pega_Nome_Fornecedor);
        add(Fornecedor);
        
    
        
        Pequeno.setBounds(650, 160, 80, 30);
        //Pequeno.addActionListener(this);
        Pequeno.setFont(fonte);
        add(Pequeno);
        
       
        Medio.setBounds(730, 160, 80, 30);
        //Medio.addActionListener(this);
        Medio.setFont(fonte);
        add(Medio);
        
                
        Grande1.setBounds(810, 160, 54, 30);
        //Grande1.addActionListener(this);
        Grande1.setFont(fonte);
        add(Grande1);
        
        
        Grande2.setBounds(860, 160, 80, 30);
        //Grande2.addActionListener(this);
        Grande2.setFont(fonte);
        add(Grande2);
        
        
        volume.add(Pequeno);
        volume.add(Medio);
        volume.add(Grande1);
        volume.add(Grande2);
        
        
        
        JLabel Quantidade = new JLabel("Quantidade:");
        Pega_Quantidade_Bebida.setBounds(745, 215, 100, 30);
        Quantidade.setBounds(650, 210, 130, 40);
        Pega_Quantidade_Bebida.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_Quantidade_Bebida);
        add(Quantidade);
                
                
                
        JLabel Preco = new JLabel("Preço por unidade:");
        Pega_Preco_Bebida.setBounds(790, 265, 100, 30);
        Preco.setBounds(650, 260, 140, 40);
        Pega_Preco_Bebida.setFont(fonte);
        Preco.setFont(fonte);
        add(Pega_Preco_Bebida);
        add(Preco);
        
        
        
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
        add(new BG_CadAlimentos_Bebida());
        setBackground(Color.black);
        setResizable(false);
        setTitle("..:FastZooom:..");
        setSize(1100, 550);
        setLocationRelativeTo(null);
        setVisible(true);

    
    }
    
    
    
    public static void main(String [] args){
        
        new Cadastro_de_Bebidas();
        
    }
    
    
    
}
