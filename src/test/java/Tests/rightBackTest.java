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
import starting11.rightBack;

/**
 *
 * @author user
 */
public class rightBackTest {
    
    public rightBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        rightBack rb = new rightBack.Builder("2").Name("Glen").Surname("Johnson").Age(29).playStyle("Attacking").styleAttribute("Dribbling").build();
        Assert.assertEquals(rb.getPlayerNumber(),"2");
        Assert.assertEquals(rb.getName(),"Glen");
        Assert.assertEquals(rb.getSurname(),"Johnson");
        Assert.assertEquals(rb.getAge(),29);
        Assert.assertEquals(rb.getPlayStyle(),"Attacking");
        Assert.assertEquals(rb.getStyleAttribute(),"Dribbling");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        rightBack rb = new rightBack.Builder("2").Name("Glen").Surname("Johnson").Age(29).playStyle("Attacking").styleAttribute("Dribbling").build();
        Assert.assertEquals(rb.getPlayerNumber(),"2");
        Assert.assertEquals(rb.getName(),"Glen");
        Assert.assertEquals(rb.getSurname(),"Johnson");
        Assert.assertEquals(rb.getAge(),29);
        Assert.assertEquals(rb.getPlayStyle(),"Attacking");
        Assert.assertEquals(rb.getStyleAttribute(),"Dribbling");   
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