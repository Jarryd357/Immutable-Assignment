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
import coachStaff2.assistantCoach;

/**
 *
 * @author user
 */
public class assistantCoachTest {
    
    public assistantCoachTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        assistantCoach ac = new assistantCoach.Builder("20").Name("Colin").Surname("Pascoe").Age(48).yearOfHire(2012).prevClub("Unknown").build();
        Assert.assertEquals(ac.getId(),"20");
        Assert.assertEquals(ac.getName(),"Colin");
        Assert.assertEquals(ac.getSurname(),"Pascoe");
        Assert.assertEquals(ac.getAge(),48);
        Assert.assertEquals(ac.getYearOfHire(),2012);
        Assert.assertEquals(ac.getPrevClub(),"Unknown");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        assistantCoach ac = new assistantCoach.Builder("20").Name("Colin").Surname("Pascoe").Age(48).yearOfHire(2012).prevClub("Swansea City").build();
        Assert.assertEquals(ac.getId(),"20");
        Assert.assertEquals(ac.getName(),"Colin");
        Assert.assertEquals(ac.getSurname(),"Pascoe");
        Assert.assertEquals(ac.getAge(),48);
        Assert.assertEquals(ac.getYearOfHire(),2012);
        Assert.assertEquals(ac.getPrevClub(),"Swansea City");
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