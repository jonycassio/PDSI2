package Listagem;


import Banco_de_Dados.DAO;
import Botoes.Borda_Redonda;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Listagem_Massas extends JFrame implements ActionListener {
    
    
    
   
    JTable tableLista;
    DefaultTableModel modelo;
    JScrollPane barra;
    
    JButton Adicionar = new JButton("Adicionar");
    JButton Alterar = new JButton("Alterar");
    JButton Apagar = new JButton("Apagar");
    JButton Voltar = new JButton("Voltar");
    
    JTextField Busca_tabela = new JTextField();
    
    TableRowSorter Filtro;
    
    DAO con = new DAO();
    
    
    
    
    public Listagem_Massas() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 14);
        
        Container c = this.getContentPane();
        c.setLayout(null);
       
      
        tabela();
        
        
        tableLista = new JTable();
        tableLista.setBackground(Color.WHITE);
        tableLista.setModel(modelo);
        tableLista.setFillsViewportHeight(true);
        
 
               
        barra = new JScrollPane(tableLista);
        barra.setBounds(80, 100, 920, 300);
        barra.setBorder(new LineBorder(Color.BLACK));
        add(barra);   
        
        
        JLabel Busca = new JLabel("Filtro:");
        Busca_tabela.setBounds(130, 45, 300, 30);
        Busca.setBounds(80, 40, 50, 40);
        Busca_tabela.setFont(fonte);
        Busca.setFont(fonte);
        add(Busca_tabela);
        add(Busca);
      
        
        Voltar.setBorder(new Borda_Redonda(7));
        Voltar.setBounds(80, 440, 100, 40);
        Voltar.addActionListener(this);
        Voltar.setFont(fonte);
        add(Voltar);
        
        
        Adicionar.setBorder(new Borda_Redonda(7));
        Adicionar.setBounds(660, 440, 100, 40);
        Adicionar.addActionListener(this);
        Adicionar.setFont(fonte);
        add(Adicionar);
        
        
        Alterar.setBorder(new Borda_Redonda(7));
        Alterar.setBounds(780, 440, 100, 40);
        Alterar.addActionListener(this);
        Alterar.setFont(fonte);
        add(Alterar);
        
        
        Apagar.setBorder(new Borda_Redonda(7));
        Apagar.setBounds(900, 440, 100, 40);
        Apagar.addActionListener(this);
        Apagar.setFont(fonte);
        add(Apagar);
    
        
             

        setTitle("..:FastZooom:..");
        setSize(1100, 550);  
        getContentPane().setBackground(Color.decode("#82b3d1"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    
    
    
    
    
    
    public void tabela(){
        
        String[] colunas = {"ID_alimento", "Tipo", "Fornecedor", "Quantidade", "Quat. Porção"};

        modelo = (DefaultTableModel) (new DefaultTableModel() {

            public boolean isCellEditable(int row, int coluna) {
                return false;
            }
            
            public boolean isCellRedimentionable(int row, int coluna) {
                return true;
            }
            
        });
        
        modelo.setColumnIdentifiers(colunas);
        modelo.setNumRows(0);
        
        con.conexao();

        con.executaSQL("select * from cad_massas");
   
        /*try {

            con.rs.first();
                   
            do{     
                
                String[] dados = new String[4];

                for (int i = 0; i < 4; i++) {
                    
                    dados[0] = String.valueOf(con.rs.getInt("ID_Bebida"));
                    dados[1] = con.rs.getString("Bebida");
                    dados[2] = con.rs.getString("Tipo");
                    dados[3] = String.valueOf(con.rs.getString("Preco"));

                }
                
                modelo.addRow(dados);
            
            }while (con.rs.next());
                        
        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");

        }*/
        
        
    }
    
   
    
    
    public void actionPerformed(ActionEvent e) {
        
        
                     
    }
    
    
    
    
    public static void main(String [] args){
        
        new Listagem_Massas();
        
    }

    

}
