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
import substitutes7.subAttackMid;

/**
 *
 * @author user
 */
public class subAttackMidTest {
    
    public subAttackMidTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subAttackMid sam = new subAttackMid.Builder("14").subNo(5).Name("Jordan").Surname("Henderson").Age(23).Apps(8).attackBenefit("Possession").build();
        Assert.assertEquals(sam.getPlayerNumber(),"14");
        Assert.assertEquals(sam.getSubNo(),5);
        Assert.assertEquals(sam.getName(),"Jordan");
        Assert.assertEquals(sam.getSurname(),"Henderson");
        Assert.assertEquals(sam.getAge(),23);
        Assert.assertEquals(sam.getApps(),8);
        Assert.assertEquals(sam.getAttackBenefit(),"Possession");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subAttackMid sam = new subAttackMid.Builder("14").subNo(5).Name("Jordan").Surname("Henderson").Age(23).Apps(12).attackBenefit("Goals").build();
        Assert.assertEquals(sam.getPlayerNumber(),"14");
        Assert.assertEquals(sam.getSubNo(),5);
        Assert.assertEquals(sam.getName(),"Jordan");
        Assert.assertEquals(sam.getSurname(),"Henderson");
        Assert.assertEquals(sam.getAge(),23);
        Assert.assertEquals(sam.getApps(),12);
        Assert.assertEquals(sam.getAttackBenefit(),"Goals");
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