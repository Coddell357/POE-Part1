/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poe.part1;

import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class Login {
    
    public static boolean CheckUsername(String username) { 
        
        if ( username != null && username.length()<=5 && username.contains("_") ) {
          return true;
        }else{
           return false; 
    }
    }
    
    public static boolean CheckPasswordComplexity(String password) {
        
      if ( password != null && password.length()>=8 && password.matches("a-z") && password.matches("A-Z") && password.matches("@#$%^*()-&+=") ) { 
       return true;
    }else {
       return false; 
    }
    }
  
    public String registerUser() { //chech if and else use their methods from password and username
        
    }
    public static boolean LoginUser() { //google equals method call in  parameters
        
    }
    
    public String returnLoginStatus() { //string returnLoginStatus ??
        
        if( LoginUser() ) { // login user call
           return true; 
        }else {
            return false;
        }
            
        
    }

    
    
                
    
}
