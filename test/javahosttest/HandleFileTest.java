/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javahosttest;

import org.junit.AfterClass;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;


public class HandleFileTest {

    public HandleFileTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of readFromFile method, of class HandleFile.
     */
    @Test
    public void getNewFileNameTest() {
        System.out.println("getNewFileNameTest");
        HandleFile hf = new HandleFile();
        String name = hf.getNewFileName();
        System.out.println(name);
        assertNotNull(name);
    }
}
