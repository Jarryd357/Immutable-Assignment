/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import starting11.goalKeeper;

/**
 *
 * @author user
 */
public class goalKeeperTest {
    
    public goalKeeperTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        goalKeeper gk = new goalKeeper.Builder("22").Name("Simon").Surname("Mignolet").Age(26).saveStyle("Traditional").build();
        Assert.assertEquals(gk.getPlayerNumber(),"22");
        Assert.assertEquals(gk.getName(),"Simon");
        Assert.assertEquals(gk.getSurname(),"Mignolet");
        Assert.assertEquals(gk.getAge(),26);
        Assert.assertEquals(gk.getSaveStyle(),"Traditional");   
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        goalKeeper gk = new goalKeeper.Builder("22").Name("Simon").Surname("Mignolet").Age(26).saveStyle("Acrobatic").build();
        Assert.assertEquals(gk.getPlayerNumber(),"22");
        Assert.assertEquals(gk.getName(),"Simon");
        Assert.assertEquals(gk.getSurname(),"Mignolet");
        Assert.assertEquals(gk.getAge(),26);
        Assert.assertEquals(gk.getSaveStyle(),"Acrobatic");   
    }
    
    

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }
}