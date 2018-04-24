/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_pdsi_ii;

import Botoes.Borda_Redonda;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
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
public class Borda_RedondaTest {
    
    public Borda_RedondaTest() {
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
     * Test of getBorderInsets method, of class Borda_Redonda.
     */
    @Test
    public void testGetBorderInsets() {
        System.out.println("getBorderInsets");
        Component c = null;
        Borda_Redonda instance = null;
        Insets expResult = null;
        Insets result = instance.getBorderInsets(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isBorderOpaque method, of class Borda_Redonda.
     */
    @Test
    public void testIsBorderOpaque() {
        System.out.println("isBorderOpaque");
        Borda_Redonda instance = null;
        boolean expResult = false;
        boolean result = instance.isBorderOpaque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of paintBorder method, of class Borda_Redonda.
     */
    @Test
    public void testPaintBorder() {
        System.out.println("paintBorder");
        Component c = null;
        Graphics g = null;
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        Borda_Redonda instance = null;
        instance.paintBorder(c, g, x, y, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
