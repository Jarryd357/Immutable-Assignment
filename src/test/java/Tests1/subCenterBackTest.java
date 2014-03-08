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
import substitutes7.subCenterBack;

/**
 *
 * @author user
 */
public class subCenterBackTest {
    
    public subCenterBackTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testCreation() throws Exception 
    {
        subCenterBack scb = new subCenterBack.Builder("17").subNo(3).Name("Mamadou").Surname("Sakho").Age(24).Apps(5).Blocks(3).build();
        Assert.assertEquals(scb.getPlayerNumber(),"17");
        Assert.assertEquals(scb.getSubNo(),3);
        Assert.assertEquals(scb.getName(),"Mamadou");
        Assert.assertEquals(scb.getSurname(),"Sakho");
        Assert.assertEquals(scb.getAge(),24);
        Assert.assertEquals(scb.getApps(),5);
        Assert.assertEquals(scb.getBlocks(),3);
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subCenterBack scb = new subCenterBack.Builder("17").subNo(3).Name("Mamadou").Surname("Sakho").Age(24).Apps(6).Blocks(7).build();
        Assert.assertEquals(scb.getPlayerNumber(),"17");
        Assert.assertEquals(scb.getSubNo(),3);
        Assert.assertEquals(scb.getName(),"Mamadou");
        Assert.assertEquals(scb.getSurname(),"Sakho");
        Assert.assertEquals(scb.getAge(),24);
        Assert.assertEquals(scb.getApps(),6);
        Assert.assertEquals(scb.getBlocks(),7);
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