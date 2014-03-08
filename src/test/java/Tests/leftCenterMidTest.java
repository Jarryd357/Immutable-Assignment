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
import starting11.leftCenterMid;

/**
 *
 * @author user
 */
public class leftCenterMidTest {
    
    public leftCenterMidTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        leftCenterMid lcm = new leftCenterMid.Builder("10").Name("Phillipe").Surname("Coutinho").Age(21).midFielderType("Attacking").passesCompleted(126).Assists(13).build();
        Assert.assertEquals(lcm.getPlayerNumber(),"10");
        Assert.assertEquals(lcm.getName(),"Phillipe");
        Assert.assertEquals(lcm.getSurname(),"Coutinho");
        Assert.assertEquals(lcm.getAge(),21);
        Assert.assertEquals(lcm.getMidfielderType(),"Attacking");
        Assert.assertEquals(lcm.getPassesCompleted(),126);
        Assert.assertEquals(lcm.getAssists(),13);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        leftCenterMid lcm = new leftCenterMid.Builder("10").Name("Phillipe").Surname("Coutinho").Age(21).midFielderType("Attacking").passesCompleted(141).Assists(14).build();
        Assert.assertEquals(lcm.getPlayerNumber(),"10");
        Assert.assertEquals(lcm.getName(),"Phillipe");
        Assert.assertEquals(lcm.getSurname(),"Coutinho");
        Assert.assertEquals(lcm.getAge(),21);
        Assert.assertEquals(lcm.getMidfielderType(),"Attacking");
        Assert.assertEquals(lcm.getPassesCompleted(),141);
        Assert.assertEquals(lcm.getAssists(),14);
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