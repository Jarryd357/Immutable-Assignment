/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import starting11.rightWinger;

/**
 *
 * @author user
 */
public class rightWingerTest {
    
    public rightWingerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        rightWinger rw = new rightWinger.Builder("31").Name("Raheem").Surname("Sterling").Age(18).distanceCovered(73.08).build();
        Assert.assertEquals(rw.getPlayerNumber(),"31");
        Assert.assertEquals(rw.getName(),"Raheem");
        Assert.assertEquals(rw.getSurname(),"Sterling");
        Assert.assertEquals(rw.getAge(),18);
        Assert.assertEquals(rw.getDistanceCovered(),73.08);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        rightWinger rw = new rightWinger.Builder("31").Name("Raheem").Surname("Sterling").Age(19).distanceCovered(76.22).build();
        Assert.assertEquals(rw.getPlayerNumber(),"31");
        Assert.assertEquals(rw.getName(),"Raheem");
        Assert.assertEquals(rw.getSurname(),"Sterling");
        Assert.assertEquals(rw.getAge(),19);
        Assert.assertEquals(rw.getDistanceCovered(),76.22);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}