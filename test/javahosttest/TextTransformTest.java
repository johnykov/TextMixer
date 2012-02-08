/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javahosttest;

import org.junit.Ignore;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Janek
 */
public class TextTransformTest {
    
    public TextTransformTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of greateArrayFromString method, of class TextTransform.
     */

    /**
     * Test of printArray method, of class TextTransform.
     */
   @Ignore
    @Test
   
    public void testPrintArray() {
        System.out.println("printArray");
        String[] asd = null;
        TextTransform instance = null;
        instance.printArray(asd);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of shuffleOrder method, of class TextTransform.
     */
    @Test
    public void testShuffleOrder() {
        System.out.println("shuffleOrder");
        Integer inputCount = 9;
        TextTransform instance = new TextTransform("String");
        int expResult = 9;
        List result = instance.shuffleOrder(inputCount);
        System.out.println(result);        
        assertEquals(expResult, result.size());       
    }
}
