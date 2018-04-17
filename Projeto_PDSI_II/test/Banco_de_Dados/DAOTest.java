/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_de_Dados;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author raahp
 */
public class DAOTest {
    
    public DAOTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of conexao method, of class DAO.
     */
    @Test
    public void testConexao() {
        System.out.println("conexao");
        DAO instance = new DAO();
        instance.conexao();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of executaSQL method, of class DAO.
     */
    @Test
    public void testExecutaSQL() {
        System.out.println("executaSQL");
        String SQL = "";
        DAO instance = new DAO();
        instance.executaSQL(SQL);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
