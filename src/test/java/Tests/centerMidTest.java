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
import starting11.centerMid;

/**
 *
 * @author user
 */
public class centerMidTest {
    
    public centerMidTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        centerMid cm = new centerMid.Builder("21").Name("Lucas").Surname("Leiva").Age(27).midFielderType("Defensive").tacklesCompleted(46).Interceptions(73).build();
        Assert.assertEquals(cm.getPlayerNumber(),"21");
        Assert.assertEquals(cm.getName(),"Lucas");
        Assert.assertEquals(cm.getSurname(),"Leiva");
        Assert.assertEquals(cm.getAge(),27);
        Assert.assertEquals(cm.getMidfielderType(),"Defensive");
        Assert.assertEquals(cm.getTacklesCompleted(),46);
        Assert.assertEquals(cm.getInterceptions(),73);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        centerMid cm = new centerMid.Builder("21").Name("Lucas").Surname("Leiva").Age(27).midFielderType("Defensive").tacklesCompleted(50).Interceptions(80).build();
        Assert.assertEquals(cm.getPlayerNumber(),"21");
        Assert.assertEquals(cm.getName(),"Lucas");
        Assert.assertEquals(cm.getSurname(),"Leiva");
        Assert.assertEquals(cm.getAge(),27);
        Assert.assertEquals(cm.getMidfielderType(),"Defensive");
        Assert.assertEquals(cm.getTacklesCompleted(),50);
        Assert.assertEquals(cm.getInterceptions(),80);
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