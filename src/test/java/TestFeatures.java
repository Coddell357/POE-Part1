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
//public keyword means it can be used everywhere
public class TestFeatures {
    
    public TestFeatures() {
    }
    
    
    @Test
    public void TestCheckUsernameTrue()
    { //Testing program if it can identify a correctly formatted username
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Expected = true;
        boolean Actual = ln.CheckUsername("kyl_1"); //Actual test data is correctly formatted
             
        Assertions.assertEquals(Expected, Actual);
          
    }
    
    @Test
    public void TestCheckUsernameFalse()
    { //Testing if program can detect a wrong username format
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Expected = false;
        boolean Actual = ln.CheckUsername("kyle!!!!!!!"); 
             
        Assertions.assertEquals(Expected, Actual);
          
    }
    /*IIEVCSchoolofComputerScince(2022)
      Basic Unit Testing includes comparing the actual and expected values from a class using assertEquals
      We are testing if our password and username check if methods work efficiently
    */
    
    @Test
    public void TestCheckPasswordComplexityTrue()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Expected = true;
        boolean Actual = ln.CheckPasswordComplexity("Ch&&sec@ke99!");
        
        Assertions.assertEquals(Expected, Actual);
    }
    
    
     @Test
    public void TestCheckPasswordComplexityFalse()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Expected = false;
        boolean Actual = ln.CheckPasswordComplexity("password");
        
        Assertions.assertEquals(Expected, Actual);
    }
    
    /*Shrivasta,A(2023)
      Unit Testing in java includes AssertTrue/False where a expected value is not needed to run the test only the actual
      Checking Both username and password to Test LoginUser() method from Login class
    */
    @Test
    public void TestLoginSuccess()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        //calling our username and password variables was essential for a successfull test
        ln.username = "kyl_1";
        ln.password = "Ch&&sec@ke99!";
     
        boolean Actual = ln.LoginUser("kyl_1", "Ch&&sec@ke99!") ;
        Assertions.assertTrue(Actual);
    }
    
    
    @Test
    public void TestLoginFail()
    {
        
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        //calling our username and password variables 
        ln.username = "kyl_1";
        ln.password = "Ch&&sec@ke99!";
                
        boolean Actual = ln.LoginUser("kyle!!!!!!!", "password");
        Assertions.assertFalse(Actual);
    }
    
    
    @Test
    public void TestUsernameCorrectFormat()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Actual = ln.CheckUsername("kyl_1"); 
        Assertions.assertTrue(Actual);
    }
    
   
    @Test
    public void TestUsernameWrongFormat()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Actual = ln.CheckUsername("kyle!!!!!!!") ;
        Assertions.assertFalse(Actual);
    }
    
    
    @Test
    public void TestPasswordCorrectFormat()
    {
        Login ln = new Login(); // creating an instance in order to use our methods from Login class
        boolean Actual = ln.CheckPasswordComplexity("Ch&&sec@ke99!"); 
        Assertions.assertTrue(Actual);
    }
    
    
    @Test
    public void TestPasswordWrongFormat()
    {
        Login ln = new Login();// creating an instance in order to use our methods from Login class
        boolean Actual = ln.CheckPasswordComplexity("password");
        Assertions.assertFalse(Actual);
    }
}
