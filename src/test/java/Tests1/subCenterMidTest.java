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
import substitutes7.subCenterMid;

/**
 *
 * @author user
 */
public class subCenterMidTest {
    
    public subCenterMidTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    
    
    @Test
    public void testCreation() throws Exception 
    {
        subCenterMid scm = new subCenterMid.Builder("24").subNo(4).Name("Joe").Surname("Allen").Age(23).Apps(4).appInfluence("Suttle").build();
        Assert.assertEquals(scm.getPlayerNumber(),"24");
        Assert.assertEquals(scm.getSubNo(),4);
        Assert.assertEquals(scm.getName(),"Joe");
        Assert.assertEquals(scm.getSurname(),"Allen");
        Assert.assertEquals(scm.getAge(),23);
        Assert.assertEquals(scm.getApps(),4);
        Assert.assertEquals(scm.getAppInfluence(),"Suttle");
    }
    
    @Test
    public void testUpdate() throws Exception 
    {
        subCenterMid scm = new subCenterMid.Builder("24").subNo(4).Name("Joe").Surname("Allen").Age(23).Apps(4).appInfluence("Effective").build();
        Assert.assertEquals(scm.getPlayerNumber(),"24");
        Assert.assertEquals(scm.getSubNo(),4);
        Assert.assertEquals(scm.getName(),"Joe");
        Assert.assertEquals(scm.getSurname(),"Allen");
        Assert.assertEquals(scm.getAge(),23);
        Assert.assertEquals(scm.getApps(),4);
        Assert.assertEquals(scm.getAppInfluence(),"Effective");
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