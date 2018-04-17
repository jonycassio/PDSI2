package projeto_pdsi_ii;

import Imagens.Compra;
import Backgrounds.Background_Funcoes;
import Banco_de_Dados.DAO;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import java.util.logging.Level;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JButton;
import Banco_de_Dados.DAO;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;









public class CompraF extends JFrame implements ActionListener {

    JButton Registrar_Compra = new JButton("Registrar Pedido");
    JButton Cancelar_Compra = new JButton("Cancelar Pedido");
    JButton Adicionar = new JButton("Adicionar Pedido");

    ArrayList<String> QUANTIDADE = new ArrayList<>();
    ArrayList<String> PRECO = new ArrayList<>();
    ArrayList<String> NOME = new ArrayList<>();
    ArrayList<String> QNT = new ArrayList<>();
    ArrayList<String> ID = new ArrayList<>();
    
    ArrayList<String> Refrigerante = new ArrayList<>();
    ArrayList<String> Suco = new ArrayList<>();
    ArrayList<String> Milkshake = new ArrayList<>();


    JTextField Pega_Quantidade = new JTextField();
    JTextField Pega_Quantidade2 = new JTextField();
    JTextField Mostra_Total = new JTextField();
    JTextField Pega_Nome = new JTextField();

    JTextArea Mostra_Quantidade = new JTextArea();
    JTextArea Mostra_Modelo = new JTextArea();
    JTextArea Mostra_Marca = new JTextArea();
    JTextArea Mostra_Preco = new JTextArea();
    JTextArea Mostra_Nome = new JTextArea();

    JComboBox<String> Pega_Tipo = new JComboBox<>();
    JComboBox<String> Pega_BebidaP = new JComboBox<>();
    JComboBox<String> Pega_BebidaR = new JComboBox<>();
    JComboBox<String> Pega_BebidaS = new JComboBox<>();
    JComboBox<String> Pega_BebidaM = new JComboBox<>();

    JRadioButton aRadioButton = new JRadioButton("Refrigerantes");
    JRadioButton bRadioButton = new JRadioButton("Sucos");
    JRadioButton cRadioButton = new JRadioButton("milkshake");

    ButtonGroup group = new ButtonGroup();

    DAO c = new DAO();

    float total = 0;

    int cont = 0;

    int conta = 0;

    
    
    public CompraF() {
        
        
        Font fonte = new Font("SansSerif", Font.BOLD, 14);

       
        aRadioButton.setBounds(600, 100, 130, 30);
        aRadioButton.addActionListener(this);
        aRadioButton.setFont(fonte);
        add(aRadioButton);
        
       
        bRadioButton.setBounds(730, 100, 80, 30);
        bRadioButton.addActionListener(this);
        bRadioButton.setFont(fonte);
        add(bRadioButton);
        
                
        cRadioButton.setBounds(810, 100, 110, 30);
        cRadioButton.addActionListener(this);
        cRadioButton.setFont(fonte);
        add(cRadioButton);
        
        
        group.add(aRadioButton);
        group.add(bRadioButton);
        group.add(cRadioButton);
        
             
        JLabel Tipo = new JLabel("Pedido: ");
        Pega_Tipo.setBounds(290, 125, 130, 30);
        Tipo.setBounds(230, 120, 130, 40);
        Pega_Tipo.setFont(fonte);
        Tipo.setFont(fonte);
        add(Pega_Tipo);
        add(Tipo);       

                
        ArrayList<String> tipo = new ArrayList<>();
           
        pegalanche(tipo);
            
        Pega_Tipo.removeAllItems();
            
        Pega_Tipo.addItem("");
            
        for (int i = 0; i < tipo.size(); i++) {

            Pega_Tipo.addItem(tipo.get(i));

        }
        

        JLabel Bebida = new JLabel("Bebida: ");
        Pega_BebidaP.setBounds(690, 155, 130, 30);
        Bebida.setBounds(620, 150, 130, 40);
        Pega_BebidaP.setFont(fonte);
        Bebida.setFont(fonte);
        add(Bebida);
        add(Pega_BebidaR);
        add(Pega_BebidaS);
        add(Pega_BebidaM);
        add(Pega_BebidaP);
            
 
        JLabel Quantidade = new JLabel("Quantidade:");
        Pega_Quantidade.setBounds(317, 175, 70, 30);
        Quantidade.setBounds(230, 170, 130, 40);
        Pega_Quantidade.setFont(fonte);
        Quantidade.setFont(fonte);
        add(Pega_Quantidade);
        add(Quantidade);
        
        
        JLabel Quantidade2 = new JLabel("Quantidade:");
        Pega_Quantidade2.setBounds(707, 200, 70, 30);
        Quantidade2.setBounds(620, 195, 130, 40);
        Pega_Quantidade2.setFont(fonte);
        Quantidade2.setFont(fonte);
        add(Pega_Quantidade2);
        add(Quantidade2);
        
        
        JLabel N = new JLabel("PEDIDOS");
        Mostra_Nome.setBounds(150, 420, 230, 160);
        N.setBounds(150, 380, 130, 40);
        Mostra_Nome.setEditable(false);        
        Mostra_Nome.setFont(fonte);
        N.setFont(fonte);
        add(Mostra_Nome);
        add(N);
        
        
        JLabel P = new JLabel("PREÇO");
        Mostra_Preco.setBounds(380, 420, 230, 160);
        P.setBounds(380, 380, 130, 40);
        Mostra_Preco.setEditable(false);       
        Mostra_Preco.setFont(fonte);
        P.setFont(fonte);
        add(Mostra_Preco);
        add(P);
        
        
        JLabel Q = new JLabel("QUANTIDADE");
        Mostra_Quantidade.setBounds(610, 420, 230, 160);
        Q.setBounds(610, 380, 130, 40);
        Mostra_Quantidade.setEditable(false);       
        Mostra_Quantidade.setFont(fonte);
        Q.setFont(fonte);
        add(Mostra_Quantidade);
        add(Q);
        
        
        JLabel T = new JLabel("TOTAL:");
        Mostra_Total.setBounds(870, 420, 70, 30);
        T.setBounds(880, 380, 130, 40);
        Mostra_Total.setEditable(false);       
        Mostra_Total.setFont(fonte);
        T.setFont(fonte);
        add(Mostra_Total);
        add(T);
        
        
        Adicionar.setBorder(new Borda_Redonda(7));
        Adicionar.setBounds(808, 290, 160, 40);
        Adicionar.addActionListener(this);
        Adicionar.setFont(fonte);
        add(Adicionar);

        
        Registrar_Compra.setBorder(new Borda_Redonda(7));
        Registrar_Compra.setBounds(500, 660, 200, 40);
        Registrar_Compra.addActionListener(this);
        Registrar_Compra.setFont(fonte);
        add(Registrar_Compra);

        
        Cancelar_Compra.setBorder(new Borda_Redonda(7));
        Cancelar_Compra.setBounds(770, 660, 200, 40);
        Cancelar_Compra.addActionListener(this);
        Cancelar_Compra.setFont(fonte);
        add(Cancelar_Compra);

        
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(new Background_Funcoes());
        setBackground(Color.black);
        setResizable(false);
        setTitle("..:FastZooom:..");
        setSize(1100, 800);
        setLocationRelativeTo(null);
        setVisible(true);

    }
    
    
    
    public void Posiciona_BebidaR() {

        Pega_BebidaR.setBounds(690, 155, 130, 30);
        Pega_BebidaR.setEditable(false);
        Pega_BebidaR.setSelectedIndex(-1);

    }
    

    public void Posiciona_BebidaS() {

        Pega_BebidaS.setBounds(690, 155, 130, 30);
        Pega_BebidaS.setEditable(false);
        Pega_BebidaS.setSelectedIndex(-1);

    }
    

    public void Posiciona_BebidaM() {

        Pega_BebidaM.setBounds(690, 155, 130, 30);
        Pega_BebidaM.setEditable(false);
        Pega_BebidaM.setSelectedIndex(-1);

    }
    
    
    public void actionPerformed(ActionEvent e) {

        
        if(e.getSource() == aRadioButton){
            
            conta = 1;
            Posiciona_BebidaR();
            Pega_BebidaP.setVisible(false);
            Pega_BebidaR.setVisible(true);
            Pega_BebidaS.setVisible(false);
            Pega_BebidaM.setVisible(false);

            if (Refrigerante.isEmpty() == true) {
                
                Posiciona_BebidaR();
                bebidasshabas(1);
 
                Pega_BebidaR.addItem("");

                for (int i = 0; i < Refrigerante.size(); i++) {

                    Pega_BebidaR.addItem(Refrigerante.get(i));

                }            

            }
        
        }
                
        
        if (e.getSource() == bRadioButton) {
            
            conta = 2;    
            Posiciona_BebidaS();
            
            Pega_BebidaP.setVisible(false);
            Pega_BebidaR.setVisible(false);
            Pega_BebidaS.setVisible(true);
            Pega_BebidaM.setVisible(false);

            if (Suco.isEmpty() == true) {
                
                Posiciona_BebidaS();
                bebidasshabas(2);

                Pega_BebidaS.addItem("");

                for (int i = 0; i < Suco.size(); i++) {

                    Pega_BebidaS.addItem(Suco.get(i));

                }
                
            }
            
        } 
        
        
        if (e.getSource()==cRadioButton) {
            
            conta = 3;
            Posiciona_BebidaM();           
            
            Pega_BebidaP.setVisible(false);
            Pega_BebidaR.setVisible(false);
            Pega_BebidaS.setVisible(false);
            Pega_BebidaM.setVisible(true);
           
            if (Milkshake.isEmpty() == true) {
                
                Posiciona_BebidaM();
                bebidasshabas(3);
                
                Pega_BebidaM.addItem("");
                
                for (int i = 0; i < Milkshake.size(); i++) {

                    Pega_BebidaM.addItem(Milkshake.get(i));

                }
            
            }
            
        }
        
               
        if (e.getSource() == Adicionar) {

            if (Pega_Tipo.getSelectedItem().equals("") || Pega_Quantidade.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Existe um ou mais campos vazios!");

            } else {
                
            
                System.out.println("o que tem em conta: "+conta);

                pegaDadosPedido((String) Pega_Tipo.getSelectedItem());

                if(conta == 1) pegaDadosBebidas((String) Pega_BebidaR.getSelectedItem());
                if(conta == 2) pegaDadosBebidas((String) Pega_BebidaS.getSelectedItem());
                if(conta == 3) pegaDadosBebidas((String) Pega_BebidaM.getSelectedItem());

                Pega_BebidaP.setVisible(true);
                Pega_BebidaR.setVisible(false);
                Pega_BebidaS.setVisible(false);
                Pega_BebidaM.setVisible(false);

                group.clearSelection();

                ArrayList<String> tipo = new ArrayList<>();

                pegalanche(tipo);
                Pega_Tipo.removeAllItems();
                Pega_Tipo.addItem("");

                for (int i = 0; i < tipo.size(); i++) {

                    Pega_Tipo.addItem(tipo.get(i));

                }      

            }
 
        }else if (e.getSource() == Registrar_Compra) {
            
            try {
                
                Registra();
            
            } catch (SQLException ex) {
            
                Logger.getLogger(CompraF.class.getName()).log(Level.SEVERE, null, ex);
            
            }
            
            Mostra_Quantidade.setText(""); ;
            Mostra_Modelo.setText("");             
            Mostra_Marca.setText("");             
            Mostra_Preco.setText("");             
            Mostra_Nome.setText("") ;
            Mostra_Total.setText("");
               
            Pega_BebidaP.setVisible(true);             
            Pega_BebidaR.setVisible(false);
            Pega_BebidaS.setVisible(false);            
            Pega_BebidaM.setVisible(false);
                
            group.clearSelection();
               
            ArrayList<String> tipo = new ArrayList<>();
           
            pegalanche(tipo);            
            Pega_Tipo.removeAllItems();            
            Pega_Tipo.addItem("");
            
            for (int i = 0; i < tipo.size(); i++) {

               Pega_Tipo.addItem(tipo.get(i));

            }       

        } else if (e.getSource() == Cancelar_Compra) {

            Mostra_Quantidade.setText(""); ;
            Mostra_Modelo.setText("");
            Mostra_Marca.setText("");
            Mostra_Preco.setText("");
            Mostra_Nome.setText("");
            Mostra_Total.setText("");

            Pega_BebidaP.setVisible(true);
            Pega_BebidaR.setVisible(false);
            Pega_BebidaS.setVisible(false);
            Pega_BebidaM.setVisible(false);
                
            group.clearSelection();
               
            ArrayList<String> tipo = new ArrayList<>();
           
            pegalanche(tipo);            
            Pega_Tipo.removeAllItems();           
            Pega_Tipo.addItem("");
            
            for (int i = 0; i < tipo.size(); i++) {

                Pega_Tipo.addItem(tipo.get(i));

            }
                          
        }

    }
    
    
    public void pegaDadosPedido(String pedido) {
        

        c.conexao();

                c.executaSQL("select * from lanches where Pedido = '" + pedido + "'");
                

                try {

                    c.rs.first();

                    String id = c.rs.getString("ID_Pedido");
                    String nome = c.rs.getString("Pedido");
                    String preco = c.rs.getString("Preco");
                    //String quantidade = c.rs.getString("Quantidade");

                    String qnt = Pega_Quantidade.getText();

                    ID.add(id);
                    QNT.add(qnt);
                    NOME.add(nome);
                    PRECO.add(preco);
                    //QUANTIDADE.add(quantidade);

                    total = total + Float.parseFloat(preco) * Integer.parseInt(qnt);

                    cont++;

                    

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");

                }
                
                
                Mostra_Total.setText(String.valueOf(total));
                Pega_Tipo.addItem("");
                Pega_Quantidade.setText("");
                Mostra_Preco.setText("");
                Mostra_Nome.setText("");
                Mostra_Quantidade.setText("");

                for (int i = 0; i < cont; i++) {

                    Mostra_Quantidade.append("|    " + QNT.get(i) + "\n");
                    Mostra_Preco.append("|   " + PRECO.get(i) + "\n");
                    Mostra_Nome.append("    " + NOME.get(i) + "\n");

                }
        
        
    }
    
    
    public void pegaDadosBebidas(String bebida) {
        
        
        System.out.println("bgfngfnfdn = "+bebida);
        
        c.conexao();

        c.executaSQL("select * from bebidas where Bebida = '"+bebida+"'");
                

                try {

                    c.rs.first();

                    String id = c.rs.getString("ID_Bebida");                    
                    String nome = c.rs.getString("Bebida");                    
                    String preco = c.rs.getString("Preco");
                    
                    String qnt = Pega_Quantidade2.getText();
                    
                    ID.add(id);
                    QNT.add(qnt);
                    NOME.add(nome);
                    PRECO.add(preco);
                    

                    total = total + (Float.parseFloat(preco) * Integer.parseInt(qnt));

                    cont++;

                    

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");

                }
                
                
                Mostra_Total.setText(String.valueOf(total));
                
                Pega_Quantidade2.setText("");               
                Mostra_Preco.setText("");
                Mostra_Nome.setText("");
                Mostra_Quantidade.setText("");

                for (int i = 0; i < cont; i++) {

                    Mostra_Quantidade.append("|    " + QNT.get(i) + "\n");
                    Mostra_Preco.append("|   " + PRECO.get(i) + "\n");
                    Mostra_Nome.append("    " + NOME.get(i) + "\n");

                }
        
        
    }
    
    
    public void bebidasshabas(int bebida) {

        int cont = 0;
        
        c.conexao();

        if(bebida == 1) c.executaSQL("select * from bebidas where Tipo = 'refrigerante'");
        if(bebida == 2) c.executaSQL("select * from bebidas where Tipo = 'suco'");
        if(bebida == 3) c.executaSQL("select * from bebidas where Tipo = 'milkshake'");

        try {

            c.rs.first();
            
            do{

                String nome = c.rs.getString("Bebida");

                if(bebida == 1) Refrigerante.add(nome);
                if(bebida == 2) Suco.add(nome);
                if(bebida == 3) Milkshake.add(nome);
                
                
                System.out.println("asd   =========  "+nome);

                cont++;
            
            }while(c.rs.next());

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");

        }
        
    }
    
    
    public void pegalanche(ArrayList abc) {

        int cont = 0;
        
        c.conexao();

        c.executaSQL("select * from lanches");

        try {

            c.rs.first();
            
            do{

                String nome = c.rs.getString("Pedido");

                abc.add(nome);

                cont++;
            
            }while(c.rs.next());

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");

        }
        
    }
    
   
    public void Registra() throws SQLException{
        
        c.conexao();

            if(NOME.isEmpty() ){

                JOptionPane.showMessageDialog(null, "Existe um ou mais campos vazios!");

           }else{

                
                
                for(int i = 0; i < NOME.size(); i++){
                    
                    
                    String sql = "insert into registro (Pedidos, Preco, Data_Registrada) values (?, ?, NOW());";
                
                    PreparedStatement stmt = c.conn.prepareStatement(sql);
                    

                    try {

                            stmt.setString(1, NOME.get(i));
                            stmt.setString(2, PRECO.get(i));
                                         

                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(null, "Não foi possivel cadastrar este produto!");
                        
                        Logger.getLogger(CompraF.class.getName()).log(Level.SEVERE, null, ex);
                       
                    }  
                    
                    stmt.execute();
                
                    stmt.close();
               
                }
                
            }  
                
                JOptionPane.showMessageDialog(null, "Produto cadatrado com sucesso!");

                

                
        
        
    }
    

    public static void main(String[] args) {

        new CompraF();

    }

}
