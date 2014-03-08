/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests1;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import substitutes7.subGoalKeeper;

/**
 *
 * @author user
 */
public class subGoalKeeperTest {
    
    public subGoalKeeperTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subGoalKeeper sgk = new subGoalKeeper.Builder("1").subNo(1).Name("Brad").Surname("Jones").Age(31).Apps(6).savesMade(11).build();
        Assert.assertEquals(sgk.getPlayerNumber(),"1");
        Assert.assertEquals(sgk.getSubNo(),1);
        Assert.assertEquals(sgk.getName(),"Brad");
        Assert.assertEquals(sgk.getSurname(),"Jones");
        Assert.assertEquals(sgk.getAge(),31);
        Assert.assertEquals(sgk.getApps(),6);
        Assert.assertEquals(sgk.getSavesMade(),11);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subGoalKeeper sgk = new subGoalKeeper.Builder("1").subNo(1).Name("Brad").Surname("Jones").Age(31).Apps(9).savesMade(13).build();
        Assert.assertEquals(sgk.getPlayerNumber(),"1");
        Assert.assertEquals(sgk.getSubNo(),1);
        Assert.assertEquals(sgk.getName(),"Brad");
        Assert.assertEquals(sgk.getSurname(),"Jones");
        Assert.assertEquals(sgk.getAge(),31);
        Assert.assertEquals(sgk.getApps(),9);
        Assert.assertEquals(sgk.getSavesMade(),13);
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