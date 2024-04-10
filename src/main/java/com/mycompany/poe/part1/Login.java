/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe.part1;



/**
 *
 * @author lab_services_student
 */
public class Login {
    String username;
    String password;
    
    public static boolean CheckUsername(String username) { 
        
        if ( username != null && username.length()<=5 && username.contains("_") ) {
          return true;
        }else{
           return false; 
        }
    }
    
    public static boolean CheckPasswordComplexity(String password) {  
        
        if ( password != null && password.length()>=8 && password.matches("[a-z]") && password.matches("[A-Z]") && password.matches("[@#$%^*()-&+=]") ) { 
           return true;
        }else {
           return false; 
        }
    }
  
    public String registerUser() { 
        
        if (CheckUsername(username)==true && CheckPasswordComplexity(password)==true) {
            return true;
        }else {
            return false;
        }
    }
    
    public boolean LoginUser(String username, String password) { 
        if ( password.equals(password) && username.equals(username)) {
            return true;
        }else {
            return false;
        }
        
    }
    
    public String returnLoginStatus() { 
        
        if( LoginUser(username,password) == true ) {
           return true; 
        }else {
            return false;
        }
        
    }
            
        
    }

    
    
                
  
