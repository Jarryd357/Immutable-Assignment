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
import coachStaff2.headCoach;

/**
 *
 * @author user
 */
public class headCoachTest {
    
    public headCoachTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        headCoach hc = new headCoach.Builder("10").Name("Brendan").Surname("Rodgers").Age(40).yearOfHire(2013).Trophies(0).build();
        Assert.assertEquals(hc.getId(),"10");
        Assert.assertEquals(hc.getName(),"Brendan");
        Assert.assertEquals(hc.getSurname(),"Rodgers");
        Assert.assertEquals(hc.getAge(),40);
        Assert.assertEquals(hc.getYearOfHire(),2013);
        Assert.assertEquals(hc.getTrophies(),0);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        headCoach hc = new headCoach.Builder("10").Name("Brendan").Surname("Rodgers").Age(41).yearOfHire(2012).Trophies(0).build();
        Assert.assertEquals(hc.getId(),"10");
        Assert.assertEquals(hc.getName(),"Brendan");
        Assert.assertEquals(hc.getSurname(),"Rodgers");
        Assert.assertEquals(hc.getAge(),41);
        Assert.assertEquals(hc.getYearOfHire(),2012);
        Assert.assertEquals(hc.getTrophies(),0);
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