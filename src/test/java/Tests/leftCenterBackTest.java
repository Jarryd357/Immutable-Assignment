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
import starting11.leftCenterBack;

/**
 *
 * @author user
 */
public class leftCenterBackTest {
    
    public leftCenterBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        leftCenterBack lcb = new leftCenterBack.Builder("5").Name("Daniel").Surname("Agger").Age(29).cleanSheets(8).build();
        Assert.assertEquals(lcb.getPlayerNumber(),"5");
        Assert.assertEquals(lcb.getName(),"Daniel");
        Assert.assertEquals(lcb.getSurname(),"Agger");
        Assert.assertEquals(lcb.getAge(),29);
        Assert.assertEquals(lcb.getCleanSheets(),8);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        leftCenterBack lcb = new leftCenterBack.Builder("5").Name("Daniel").Surname("Agger").Age(29).cleanSheets(12).build();
        Assert.assertEquals(lcb.getPlayerNumber(),"5");
        Assert.assertEquals(lcb.getName(),"Daniel");
        Assert.assertEquals(lcb.getSurname(),"Agger");
        Assert.assertEquals(lcb.getAge(),29);
        Assert.assertEquals(lcb.getCleanSheets(),12);
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