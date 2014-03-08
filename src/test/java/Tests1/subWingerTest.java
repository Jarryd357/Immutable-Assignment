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
import substitutes7.subWinger;

/**
 *
 * @author user
 */
public class subWingerTest {
    
    public subWingerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subWinger sw = new subWinger.Builder("12").subNo(6).Name("Victor").Surname("Moses").Age(23).Apps(10).subGoals(1).build();
        Assert.assertEquals(sw.getPlayerNumber(),"12");
        Assert.assertEquals(sw.getSubNo(),6);
        Assert.assertEquals(sw.getName(),"Victor");
        Assert.assertEquals(sw.getSurname(),"Moses");
        Assert.assertEquals(sw.getAge(),23);
        Assert.assertEquals(sw.getApps(),10);
        Assert.assertEquals(sw.getSubGoals(),1);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subWinger sw = new subWinger.Builder("12").subNo(6).Name("Victor").Surname("Moses").Age(23).Apps(13).subGoals(3).build();
        Assert.assertEquals(sw.getPlayerNumber(),"12");
        Assert.assertEquals(sw.getSubNo(),6);
        Assert.assertEquals(sw.getName(),"Victor");
        Assert.assertEquals(sw.getSurname(),"Moses");
        Assert.assertEquals(sw.getAge(),23);
        Assert.assertEquals(sw.getApps(),13);
        Assert.assertEquals(sw.getSubGoals(),3);
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