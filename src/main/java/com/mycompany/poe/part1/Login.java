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
        
        return username.length()<=5 && username.contains("_"); 
        
        if ( username != null && CheckUsername(username) == true) {
           JOptionPane.showMessageDialog(null, "Username succesfully captured");
        }else
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted,please ensure that your username contains an underscore and is no more than 5 characters in length.");
    }
    
    public static boolean CheckPasswordComplexity(String password) {
        
        return password.length()>=8 && password.matches("a-z") && password.matches("A-Z") && password.matches("@#$%^*()-&+=");
      
    if ( password != null && CheckPasswordComplexity(password) == true) { //(password.length()>= 8 && password.matches("a-z") && password.matches("A-Z") && password.contains("_") && password.matches("@#$%^*()-&+=")) {
       JOptionPane.showMessageDialog(null, "Password succesfully captured");
    }else {
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special ");
    }
    }
  
    public string registerUser() {
        
    }
    public static boolean LoginUser() {
        
    }
    
    public static boolean returnLogicStatus() { //string returnLoginStatus ??
        
        if(CheckUsername(username) && CheckPAsswordComplexity(password) == true ) {
            JOptionPane.showMessageDialog(null, "Welcome " + firstname + lastname + " it is great to see you again.");
        }else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
        }
            
        
    }

    
    
                
    
}
