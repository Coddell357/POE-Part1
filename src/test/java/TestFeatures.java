/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poe.part1.Login;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lab_services_student
 */
public class TestFeatures {
    
    public TestFeatures() {
    }
    
    
    @Test
    public void TestCheckUsernameTrue()
    {
        Login ln = new Login();
        boolean Expected = true;
        boolean Actual = ln.CheckUsername("kyl_1");
             
        Assertions.assertEquals(Expected, Actual);
          
    }
    
    @Test
    public void TestCheckUsernameFalse()
    {
        Login ln = new Login();
        boolean Expected = false;
        boolean Actual = ln.CheckUsername("kyle!!!!!!!"); 
             
        Assertions.assertEquals(Expected, Actual);
          
    }
    
    @Test
    public void TestCheckPasswordComplexityTrue()
    {
        Login ln = new Login();
        boolean Expected = true;
        boolean Actual = ln.CheckPasswordComplexity("Ch&&sec@ke99!");
        
        Assertions.assertEquals(Expected, Actual);
    }
    
     @Test
    public void TestCheckPasswordComplexityFalse()
    {
        Login ln = new Login();
        boolean Expected = false;
        boolean Actual = ln.CheckPasswordComplexity("password");
        
        Assertions.assertEquals(Expected, Actual);
    }
    
    @Test
    public void TestLoginSuccess()
    {
        Login ln = new Login();
        ln.username = "kyl_1";
        ln.password = "Ch&&sec@ke99!";
     
        boolean Actual = ln.LoginUser("kyl_1", "Ch&&sec@ke99!") ;
      
        Assertions.assertTrue(Actual);
    }
    
    
    @Test
    public void TestLoginFail()
    {
        
        Login ln = new Login();
        ln.username = "kyl_1";
        ln.password = "Ch&&sec@ke99!";
                
        boolean Actual = ln.LoginUser("kyle!!!!!!!", "password") ;
      
        Assertions.assertFalse(Actual);
    }
    
    
    @Test
    public void TestUsernameCorrectFormat()
    {
        Login ln = new Login();
        
        boolean Actual = ln.CheckUsername("kyl_1") ;
        
        Assertions.assertTrue(Actual);
    }
    
   
    @Test
    public void TestUsernameWrongFormat()
    {
        Login ln = new Login();
       
        boolean Actual = ln.CheckUsername("kyle!!!!!!!") ;
        
        Assertions.assertFalse(Actual);
    }
    
    @Test
    public void TestPasswordCorrectFormat()
    {
        Login ln = new Login();
      
        boolean Actual = ln.CheckPasswordComplexity("Ch&&sec@ke99!");
        
        Assertions.assertTrue(Actual);
    }
    
    @Test
    public void TestPasswordWrongFormat()
    {
        Login ln = new Login();
       
        boolean Actual = ln.CheckPasswordComplexity("password");
       
        Assertions.assertFalse(Actual);
    }
}
