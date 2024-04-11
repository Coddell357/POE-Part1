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
    void TestOne()
    {
     String strExpected = "kyl_1";
     String strActual = ln.CheckUsername(username);
             
    Assertions.assertEquals(strExpected, strActual);
          
    }
    
    @Test
    void TestTwo()
    {
     String strExpected = "Ch&&sec@ke99!";
     String strActual = ln.CheckPasswordComplexity(password);
    }
    
    @Test
    void TestThree()
    {
      
        
      Assertions.assertEquals()
    }
    
    //Testing assertTrue/False
    @Test
    void TestFour()
    {
        
      Assertions.assertTrue(true, "True");
    }
    
    @Test
    void TestFive()
    {
        
     Assertions.assertTrue(true, "True");
    }
    
    @Test
    void TestSix()
    {
        
        
        Assertions.assertTrue(true, "True");
    }
}
