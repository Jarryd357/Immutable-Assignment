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
import starting11.rightCenterBack;

/**
 *
 * @author user
 */
public class rightCenterBackTest {
    
    public rightCenterBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        rightCenterBack rcb = new rightCenterBack.Builder("47").Name("Martin").Surname("Skrtel").Age(29).heightInMeters(1.91).build();
        Assert.assertEquals(rcb.getPlayerNumber(),"47");
        Assert.assertEquals(rcb.getName(),"Martin");
        Assert.assertEquals(rcb.getSurname(),"Skrtel");
        Assert.assertEquals(rcb.getAge(),29);
        Assert.assertEquals(rcb.getHeightInMeters(),1.91);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        rightCenterBack rcb = new rightCenterBack.Builder("37").Name("Martin").Surname("Skrtel").Age(29).heightInMeters(1.91).build();
        Assert.assertEquals(rcb.getPlayerNumber(),"37");
        Assert.assertEquals(rcb.getName(),"Martin");
        Assert.assertEquals(rcb.getSurname(),"Skrtel");
        Assert.assertEquals(rcb.getAge(),29);
        Assert.assertEquals(rcb.getHeightInMeters(),1.91);   
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