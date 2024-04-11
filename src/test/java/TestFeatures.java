/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.poe.part1.Login;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lab_services_student
 */
public class TestFeatures {
    
    public TestFeatures() {
    }
    
     Login ln = new Login();
     String username;
     String password;
    
    @Test
    public void TestCheckUsername()
    {
        Login ln = new Login();
        boolean Expected = true; //"kyl_1";
        boolean Actual = ln.CheckUsername(username); //"kyle!!!!!!!";
             
        Assertions.assertEquals(Expected, Actual);
          
    }
    
    @Test
    public void TestCheckPasswordComplexity()
    {
        Login ln = new Login();
        boolean Expected = true; //"Ch&&sec@ke99!";
        boolean Actual = ln.CheckPasswordComplexity(password); //"password";
        
        Assertions.assertEquals(Expected, Actual);
    }
    
    @Test
    public void TestLoginSuccess()
    {
        Login ln = new Login();
        Expected = ;
        Actual = ;
      
        Assertions.assertTrue(true, "");
    }
    
    
    @Test
    public void TestUsernameFormat()
    {
        Login ln = new Login();
        Expected = ;
        Actual = ;
        
        Assertions.assertTrue(true, "True");
    }
    
    @Test
    public void TestPasswordFormat()
    {
        Login ln = new Login();
        Expected = ;
        Actual = ;
        
        Assertions.assertTrue(true, "True");
    }
    
    @Test
    public void Test()
    {
        Expected = ;
        Actual = ;
       
        Assertions.assertTrue(true, "True");
    }
}
