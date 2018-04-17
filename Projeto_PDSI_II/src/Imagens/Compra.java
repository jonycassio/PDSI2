package Imagens;

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
//import Tabelas.Compra_Listar;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.JButton;
import Banco_de_Dados.DAO;
import java.io.FileWriter;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
//import projeto_pdsi_ii.Borda_Redonda;
//import Tabelas.Listar;

public class Compra extends JFrame implements ActionListener {

    JButton Registrar_Compra = new JButton("Registrar Pedido");
    JButton Cancelar_Compra = new JButton("Cancelar Pedido");
    JButton Adicionar = new JButton("Adicionar Pedido");

    ArrayList<String> QUANTIDADE = new ArrayList<>();
    ArrayList<String> MODELO = new ArrayList<>();
    ArrayList<String> MARCA = new ArrayList<>();
    ArrayList<String> PRECO = new ArrayList<>();
    ArrayList<String> NOME = new ArrayList<>();
    ArrayList<String> QNT = new ArrayList<>();
    ArrayList<String> ID = new ArrayList<>();
    ArrayList<String> refri = new ArrayList<>();
    ArrayList<String> suco = new ArrayList<>();
    ArrayList<String> milk = new ArrayList<>();

    JTextField Pega_Quantidade = new JTextField();
    JTextField Pega_Quantidade2 = new JTextField();
    //JTextField Pega_Descricao = new JTextField();
    JTextField Mostra_Total = new JTextField();
    //JTextField Pega_Codigo = new JTextField();
    JTextField Pega_Nome = new JTextField();

    JTextArea Mostra_Quantidade = new JTextArea();
    JTextArea Mostra_Modelo = new JTextArea();
    JTextArea Mostra_Marca = new JTextArea();
    JTextArea Mostra_Preco = new JTextArea();
    JTextArea Mostra_Nome = new JTextArea();

    JComboBox<String> Pega_Tipo = new JComboBox<>();
    JComboBox<String> Pega_Bebida = new JComboBox<>();
    JComboBox<String> Pega_Bebida1 = new JComboBox<>();
    JComboBox<String> Pega_Bebida2 = new JComboBox<>();
    JComboBox<String> Pega_Bebida3 = new JComboBox<>();

    JRadioButton aRadioButton = new JRadioButton("Refrigerantes");
    JRadioButton bRadioButton = new JRadioButton("Sucos");
    JRadioButton cRadioButton = new JRadioButton("milkshake");

    ButtonGroup group = new ButtonGroup();

    DAO c = new DAO();

    float total = 0;

    int cont = 0,conta=0;

    int g = 0;

    public Compra() {

        aRadioButton.setBounds(10, 10, 110, 30);
        add(aRadioButton);
        aRadioButton.addActionListener(this);
        add(aRadioButton);

        bRadioButton.setBounds(120, 10, 70, 30);
        add(bRadioButton);
        bRadioButton.addActionListener(this);
        add(bRadioButton);

        cRadioButton.setBounds(190, 10, 100, 30);
        add(cRadioButton);
        cRadioButton.addActionListener(this);
        add(cRadioButton);

        add(Pega_Bebida);
        add(Pega_Bebida1);
        add(Pega_Bebida2);

        group.add(aRadioButton);

        group.add(bRadioButton);

        group.add(cRadioButton);

        JLabel Tipo = new JLabel("Tipo de Produto: ");
        Tipo.setBounds(10, 75, 130, 40);
        add(Tipo);
        Pega_Tipo.setBounds(120, 80, 130, 30);
        add(Pega_Tipo);

        Pega_Tipo.addItem("");
        Pega_Tipo.addItem("Pão");
        Pega_Tipo.addItem("Queijo");
        Pega_Tipo.addItem("sanduiche");

        JLabel Bebida = new JLabel("Bebida: ");
        Bebida.setBounds(10, 160, 130, 40);
        add(Bebida);
        Pega_Bebida3.setBounds(120, 165, 130, 30);

        Pega_Bebida3.setEditable(false);
        Pega_Bebida3.setSelectedIndex(-1);
        add(Pega_Bebida3);

        JLabel Quantidade = new JLabel("Quantidade:");
        Quantidade.setBounds(10, 120, 130, 40);
        add(Quantidade);
        Pega_Quantidade.setBounds(120, 125, 70, 30);
        add(Pega_Quantidade);

        JLabel Quantidade2 = new JLabel("Quantidade:");
        Quantidade2.setBounds(10, 200, 130, 40);
        add(Quantidade2);
        Pega_Quantidade2.setBounds(120, 205, 70, 30);
        add(Pega_Quantidade2);

        JLabel N = new JLabel("PEDIDOS");
        N.setBounds(300, 45, 130, 40);
        add(N);
        Mostra_Nome.setBounds(300, 80, 230, 160);
        Mostra_Nome.setEditable(false);
        add(Mostra_Nome);

        JLabel P = new JLabel("PREÇO");
        P.setBounds(540, 45, 130, 40);
        add(P);
        Mostra_Preco.setBounds(530, 80, 230, 160);
        Mostra_Preco.setEditable(false);
        add(Mostra_Preco);

        JLabel Q = new JLabel("QUANTIDADE");
        Q.setBounds(770, 45, 130, 40);
        add(Q);
        Mostra_Quantidade.setBounds(760, 80, 230, 160);
        Mostra_Quantidade.setEditable(false);
        add(Mostra_Quantidade);

        JLabel T = new JLabel("TOTAL:");
        T.setBounds(1010, 45, 130, 40);
        add(T);
        Mostra_Total.setBounds(1000, 80, 70, 30);
        Mostra_Total.setEditable(false);
        add(Mostra_Total);

//        Adicionar.setBorder(new Borda_Redonda(7));
        Adicionar.setBounds(50, 280, 130, 40);
        Adicionar.addActionListener(this);
        add(Adicionar);

  //      Registrar_Compra.setBorder(new Borda_Redonda(7));
        Registrar_Compra.setBounds(520, 280, 200, 40);
        Registrar_Compra.addActionListener(this);
        add(Registrar_Compra);

 //       Cancelar_Compra.setBorder(new Borda_Redonda(7));
        Cancelar_Compra.setBounds(820, 280, 200, 40);
        Cancelar_Compra.addActionListener(this);
        add(Cancelar_Compra);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        add(new Background_Funcoes());
        setBackground(Color.black);
        setResizable(false);
        setTitle("Compra");
        setSize(1100, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        System.out.println("ldmldp=" + Pega_Bebida.getActionCommand());
    }

    public void arr() {

        Pega_Bebida.setBounds(120, 165, 130, 30);

        Pega_Bebida.setEditable(false);
        Pega_Bebida.setSelectedIndex(-1);

    }

    public void brr() {

        Pega_Bebida1.setBounds(120, 165, 130, 30);

        Pega_Bebida1.setEditable(false);
        Pega_Bebida1.setSelectedIndex(-1);

    }

    public void crr() {

        Pega_Bebida2.setBounds(120, 165, 130, 30);

        Pega_Bebida2.setEditable(false);
        Pega_Bebida2.setSelectedIndex(-1);

    }

    public void actionPerformed(ActionEvent e) {

        System.out.println("ldmldp=" + Pega_Bebida.getActionCommand());
        if (e.getSource() == aRadioButton) {

            arr();
            Pega_Bebida1.setVisible(false);
            Pega_Bebida2.setVisible(false);
            Pega_Bebida3.setVisible(false);
            Pega_Bebida.setVisible(true);

            if (refri.isEmpty() == true) {
                arr();
                bebidasshabas("refrigerante", refri);
            

            Pega_Bebida.addItem("");
            for (int i = 0; i < refri.size(); i++) {

                Pega_Bebida.addItem(refri.get(i));

            }
            
            conta = 1;

        }
        }
        if (e.getSource() == bRadioButton) {
            brr();
            Pega_Bebida.setVisible(false);
            Pega_Bebida2.setVisible(false);
            Pega_Bebida3.setVisible(false);
            Pega_Bebida1.setVisible(true);

            if (suco.isEmpty() == true) {
                brr();
                bebidasshabas("suco", suco);

                //Pega_Bebida1.removeAllItems();
                Pega_Bebida1.addItem("");

                for (int i = 0; i < suco.size(); i++) {

                    Pega_Bebida1.addItem(suco.get(i));

                }
            }
            
            conta = 2;

        }
        if (e.getSource() == cRadioButton) {
            crr();
            Pega_Bebida1.setVisible(false);
            Pega_Bebida.setVisible(false);
            Pega_Bebida3.setVisible(false);
            Pega_Bebida2.setVisible(true);

            //Pega_Bebida2.removeAllItems();
            if (milk.isEmpty() == true) {
                crr();

                bebidasshabas("milkshake", milk);
                Pega_Bebida2.addItem("");
                for (int i = 0; i < milk.size(); i++) {

                    Pega_Bebida2.addItem(milk.get(i));

                }
            }
            
            conta = 3;

        }

        System.out.println("ldmldp=" + Pega_Bebida.getActionCommand());
        if (e.getSource() == Adicionar) {
            
            System.out.println("ldmldp=" + Pega_Bebida.getSelectedItem().toString());

            if (Pega_Tipo.getSelectedItem().equals("") || Pega_Quantidade.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Existe um ou mais campos vazios!");

            } else {

                c.conexao();

                c.executaSQL("select * from lanches where Pedido = '" + (String) Pega_Tipo.getSelectedItem() + " '");

                //System.out.println("0");
                try {

                    c.rs.first();

                    String id = c.rs.getString("ID_Pedido");
                    String nome = c.rs.getString("Pedido");
                    //String marca = c.rs.getString("Marca");
                    //String modelo = c.rs.getString("Modelo"); 
                    String preco = c.rs.getString("Preco");
                    //String quantidade = c.rs.getString("Quantidade");

                    String qnt = Pega_Quantidade.getText();

                    ID.add(id);
                    QNT.add(qnt);
                    NOME.add(nome);
                    //MARCA.add(marca);
                    //MODELO.add(modelo);
                    PRECO.add(preco);
                    //QUANTIDADE.add(quantidade);

                    total = total + Float.parseFloat(preco);

                    cont++;

                    System.out.println("1");

                } catch (SQLException ex) {

                    JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");
                    System.out.println("2");
                    dispose();

                    new Compra();

                }
                System.out.println("3");
                Mostra_Total.setText(String.valueOf(total));
                Pega_Tipo.addItem("");
                //Pega_Codigo.setText("");
                Pega_Quantidade.setText("");
                Mostra_Modelo.setText("");
                Mostra_Preco.setText("");
                Mostra_Marca.setText("");
                Mostra_Nome.setText("");
                Mostra_Quantidade.setText("");

                System.out.println("4");

                for (int i = 0; i < cont; i++) {

                    Mostra_Quantidade.append("|    " + QNT.get(i) + "\n");
                    //Mostra_Modelo.append("|   "+MODELO.get(i)+"\n");
                    Mostra_Preco.append("|   " + PRECO.get(i) + "\n");
                    //Mostra_Marca.append("|   "+MARCA.get(i)+"\n");
                    Mostra_Nome.append("    " + NOME.get(i) + "\n");

                }

            }

        } else if (e.getSource() == Registrar_Compra) {

            if (Mostra_Nome.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Adicione um produto para efetuar a compra!");

            } else {

                for (int i = 0; i < cont; i++) {

                    int quant_tabela = Integer.parseInt(QUANTIDADE.get(i));

                    int quant_compra = Integer.parseInt(QNT.get(i));

                    int Nova_Quantidade = quant_tabela - quant_compra;

                    String sql = "update estoque set Quantidade = '" + Nova_Quantidade + "' WHERE ID ='" + ID.get(i) + "'";

                    try {

                        PreparedStatement stmt = c.conn.prepareStatement(sql);

                        stmt.executeUpdate();

                        stmt.close();

                    } catch (SQLException ex) {

                        JOptionPane.showMessageDialog(null, "Não foi possivel alterar este produto!");

                        //Logger.getLogger(Cadastro_de_Produtos.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }

                JOptionPane.showMessageDialog(null, "Compra efetuada com sucesso!");

                dispose();

                //new Principal();
            }

        } else if (e.getSource() == Cancelar_Compra) {

            dispose();

            //new Principal();
        }

    }

    public void bebidasshabas(String aux, ArrayList abc) {

        c.conexao();

        c.executaSQL("select * from bebidas where tipo = '" + aux + "'");

        //System.out.println("0");
        try {

            c.rs.first();
            do {

                String nome = c.rs.getString("nome");

                abc.add(nome);
            } while (c.rs.next());

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(null, "Não foi possivel encontar este produto!");
            System.out.println("2");
            dispose();

        }
        System.out.println("nome");

    }

    public static void main(String[] args) {

        new Compra();

    }

}
