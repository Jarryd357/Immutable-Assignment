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
import starting11.rightCenterMid;

/**
 *
 * @author user
 */
public class rightCenterMidTest {
    
    public rightCenterMidTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        rightCenterMid rcm = new rightCenterMid.Builder("8").Name("Steven").Surname("Gerrard").Age(34).midFielderType("Complete").keyAbility("Passing").build();
        Assert.assertEquals(rcm.getPlayerNumber(),"8");
        Assert.assertEquals(rcm.getName(),"Steven");
        Assert.assertEquals(rcm.getSurname(),"Gerrard");
        Assert.assertEquals(rcm.getAge(),34);
        Assert.assertEquals(rcm.getMidfielderType(),"Complete");
        Assert.assertEquals(rcm.getKeyAbility(),"Passing");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        rightCenterMid rcm = new rightCenterMid.Builder("8").Name("Steven").Surname("Gerrard").Age(34).midFielderType("Complete").keyAbility("Shooting").build();
        Assert.assertEquals(rcm.getPlayerNumber(),"8");
        Assert.assertEquals(rcm.getName(),"Steven");
        Assert.assertEquals(rcm.getSurname(),"Gerrard");
        Assert.assertEquals(rcm.getAge(),34);
        Assert.assertEquals(rcm.getMidfielderType(),"Complete");
        Assert.assertEquals(rcm.getKeyAbility(),"Shooting");
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