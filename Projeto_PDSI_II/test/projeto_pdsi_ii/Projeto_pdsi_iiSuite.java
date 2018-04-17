/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_pdsi_ii;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author raahp
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({projeto_pdsi_ii.abcTest.class, projeto_pdsi_ii.CompraFTest.class, projeto_pdsi_ii.Borda_RedondaTest.class})
public class Projeto_pdsi_iiSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
