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
    public String username;
    public String password;
    
    public boolean CheckUsername(String username) { 
        this.username = username;
        if ( username != null && username.length()<=5 && username.contains("_") ) {          
          return true;
        }else{
           return false; 
        }
        
    }
    
    public boolean CheckPasswordComplexity(String password) {  
        this.password = password;
        if ( password != null && password.length()>=8 && password.matches(".*[a-z]*.") && password.matches(".*[0-9]*.") && password.matches(".*[A-Z]*.") && password.matches(".*[!@#$%^&*().*]") ) { 
           return true;
        }else {
           return false; 
        }
    }
  
    public String registerUser() { 
        
        if ( !CheckUsername(username) ) {
            return "Username is incorrect" ;
        }
            
        
        if ( !CheckPasswordComplexity(password) ) {
            return "Password is incorrect";
        } 
        if (CheckUsername(username) && CheckPasswordComplexity(password)) {
             return "You are now registered";
        } return " You are not registered";
            
    }
    
    public boolean LoginUser(String username, String password) { 
        if ( this.password.equals(password) && this.username.equals(username)) {
            return true;
        }else {
            return false;
        }
        
    }
    
    public String returnLoginStatus() { 
        
        
        if( LoginUser(username,password) == true ) {
           return "Successfull login" ; 
        }else {
            return "unseccessfully login";
        }
        
    }
            
        
    }

    
    
                
  
