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
import starting11.leftWinger;

/**
 *
 * @author user
 */
public class leftWingerTest {
    
    public leftWingerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        leftWinger lw = new leftWinger.Builder("7").Name("Luis").Surname("Suarez").Age(27).dribblesCompleted(1000).chancesCreated(78).build();
        Assert.assertEquals(lw.getPlayerNumber(),"7");
        Assert.assertEquals(lw.getName(),"Luis");
        Assert.assertEquals(lw.getSurname(),"Suarez");
        Assert.assertEquals(lw.getAge(),27);
        Assert.assertEquals(lw.getDribblesCompleted(),1000);
        Assert.assertEquals(lw.getChancesCreated(),78);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        leftWinger lw = new leftWinger.Builder("7").Name("Luis a.k.a The best...").Surname("Suarez a.k.a ...footballer ever!").Age(27).dribblesCompleted(1000).chancesCreated(78).build();
        Assert.assertEquals(lw.getPlayerNumber(),"7");
        Assert.assertEquals(lw.getName(),"Luis a.k.a The best...");
        Assert.assertEquals(lw.getSurname(),"Suarez a.k.a ...footballer ever!");
        Assert.assertEquals(lw.getAge(),27);
        Assert.assertEquals(lw.getDribblesCompleted(),1000);
        Assert.assertEquals(lw.getChancesCreated(),78);
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