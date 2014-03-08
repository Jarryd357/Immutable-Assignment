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
import starting11.leftBack;

/**
 *
 * @author user
 */
public class leftBackTest {
    
    public leftBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        leftBack lb = new leftBack.Builder("3").Name("Jose").Surname("Enrique").Age(28).matchFitStatus("Match Fit").numInjuries(0).build();
        Assert.assertEquals(lb.getPlayerNumber(),"3");
        Assert.assertEquals(lb.getName(),"Jose");
        Assert.assertEquals(lb.getSurname(),"Enrique");
        Assert.assertEquals(lb.getAge(),28);
        Assert.assertEquals(lb.getMatchFitStatus(),"Match Fit");
        Assert.assertEquals(lb.getNumInjuries(),0);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        leftBack lb = new leftBack.Builder("3").Name("Jose").Surname("Enrique").Age(28).matchFitStatus("Injured").numInjuries(1).build();
        Assert.assertEquals(lb.getPlayerNumber(),"3");
        Assert.assertEquals(lb.getName(),"Jose");
        Assert.assertEquals(lb.getSurname(),"Enrique");
        Assert.assertEquals(lb.getAge(),28);
        Assert.assertEquals(lb.getMatchFitStatus(),"Injured");
        Assert.assertEquals(lb.getNumInjuries(),1);
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