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
import substitutes7.subStriker;

/**
 *
 * @author user
 */
public class subStrikerTest {
    
    public subStrikerTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subStriker ss= new subStriker.Builder("9").subNo(7).Name("Iago").Surname("Aspas").Age(26).Apps(3).subDribblesCompleted(2).build();
        Assert.assertEquals(ss.getPlayerNumber(),"9");
        Assert.assertEquals(ss.getSubNo(),7);
        Assert.assertEquals(ss.getName(),"Iago");
        Assert.assertEquals(ss.getSurname(),"Aspas");
        Assert.assertEquals(ss.getAge(),26);
        Assert.assertEquals(ss.getApps(),3);
        Assert.assertEquals(ss.getSubDribblesCompleted(),2);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subStriker ss= new subStriker.Builder("9").subNo(7).Name("Iago").Surname("Aspas").Age(26).Apps(5).subDribblesCompleted(4).build();
        Assert.assertEquals(ss.getPlayerNumber(),"9");
        Assert.assertEquals(ss.getSubNo(),7);
        Assert.assertEquals(ss.getName(),"Iago");
        Assert.assertEquals(ss.getSurname(),"Aspas");
        Assert.assertEquals(ss.getAge(),26);
        Assert.assertEquals(ss.getApps(),5);
        Assert.assertEquals(ss.getSubDribblesCompleted(),4);
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