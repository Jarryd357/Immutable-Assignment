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
import substitutes7.subFullBack;

/**
 *
 * @author user
 */
public class subFullBackTest {
    
    public subFullBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subFullBack sfb = new subFullBack.Builder("38").subNo(2).Name("Jon").Surname("Flannagan").Age(21).Apps(9).Flank("Left").build();
        Assert.assertEquals(sfb.getPlayerNumber(),"38");
        Assert.assertEquals(sfb.getSubNo(),2);
        Assert.assertEquals(sfb.getName(),"Jon");
        Assert.assertEquals(sfb.getSurname(),"Flannagan");
        Assert.assertEquals(sfb.getAge(),21);
        Assert.assertEquals(sfb.getApps(),9);
        Assert.assertEquals(sfb.getFlank(),"Left");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subFullBack sfb = new subFullBack.Builder("38").subNo(2).Name("Jon").Surname("Flannagan").Age(21).Apps(9).Flank("Right").build();
        Assert.assertEquals(sfb.getPlayerNumber(),"38");
        Assert.assertEquals(sfb.getSubNo(),2);
        Assert.assertEquals(sfb.getName(),"Jon");
        Assert.assertEquals(sfb.getSurname(),"Flannagan");
        Assert.assertEquals(sfb.getAge(),21);
        Assert.assertEquals(sfb.getApps(),9);
        Assert.assertEquals(sfb.getFlank(),"Right");
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