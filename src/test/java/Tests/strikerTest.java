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
import starting11.Striker;

/**
 *
 * @author user
 */
public class strikerTest {
    
    public strikerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        Striker st = new Striker.Builder("15").Name("Daniel").Surname("Sturridge").Age(24).Goals(18).Crackers(15).build();
        Assert.assertEquals(st.getPlayerNumber(),"15");
        Assert.assertEquals(st.getName(),"Daniel");
        Assert.assertEquals(st.getSurname(),"Sturridge");
        Assert.assertEquals(st.getAge(),24);
        Assert.assertEquals(st.getGoals(),18);
        Assert.assertEquals(st.getCrackers(),15);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        Striker st = new Striker.Builder("15").Name("Danny").Surname("Sturridge").Age(24).Goals(18).Crackers(16).build();
        Assert.assertEquals(st.getPlayerNumber(),"15");
        Assert.assertEquals(st.getName(),"Danny");
        Assert.assertEquals(st.getSurname(),"Sturridge");
        Assert.assertEquals(st.getAge(),24);
        Assert.assertEquals(st.getGoals(),18);
        Assert.assertEquals(st.getCrackers(),16);
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