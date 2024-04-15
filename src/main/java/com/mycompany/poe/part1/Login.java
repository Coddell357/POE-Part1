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
    //making my String variables public so i can use them anywhere without restrictions
    public String username;
    public String password;
    
    public boolean CheckUsername(String username) { 
        this.username = username; //instance variable = parameter passed to constructor
        //username input from user will be checked to have less than or 5 characters including an underscore
        if ( username != null && username.length()<=5 && username.contains("_") ) {          
          return true;
        }else {
           return false; 
        }
        
    }
    
    public boolean CheckPasswordComplexity(String password) {  
        this.password = password; //instance variable = parameter passed to constructor
        /* Baeldung and Michal,A(2024)
           Provides us with proper lengths and matches for our passwird fro  the user to contain thus checking the String password
           password input from user will be required to have an uppercase & lowercase letter, digit,special character and at least 8 characters
        */
        if ( password != null && password.length()>=8 && password.matches(".*[a-z]*.") && password.matches(".*[0-9]*.") 
            && password.matches(".*[A-Z]*.") && password.matches(".*[!@#$%^&*().*]") ) { 
           return true;
        }else {
           return false; 
        }
    }
  
    public String registerUser() { 
        //Used 3 if statements to validate username, password and register the user if both are correctly formatted
        if ( !CheckUsername(username) ) {
            return "Username is not correctly formatted, please ensure that your username contains"
                    + " an underscore and is no more than 5 characters in length." ;
        }
        if ( !CheckPasswordComplexity(password) ) {
            return "Password is not correctly formatted, please ensure that the passowrd contains at least"
                    + " 8 characters, a capital letter, a number and a special character.";
        } 
        if (CheckUsername(username) && CheckPasswordComplexity(password)) {
             return "You are now registered";
        } return " You are not registered"; //statements is returned if both password and username are both incorrect
            
    }
    
    public boolean LoginUser(String username, String password) { 
        
        /*Ramgulia,G(2023)
          The equals() method checks if String variables are equal
          The password and username the user registers with should be the same as when they want to login
        */
        if ( this.password.equals(password) && this.username.equals(username)) { //instance variable = parameter passed to constructor
            return true;
        }else {
            return false;
        }
        
    }
    
    public String returnLoginStatus() { 
        /*John(2021)
          The double equals checks if input eneytred is excatly the same as needed
          Validating if the users input is the same so they can be registed to output a successfull login message 
          which is compared to true in LoginUser()
        */
        if( LoginUser(username,password) == true ) {
           return "Successfull login" ; 
        }else {
            return "unseccessfully login";
        }
        
    }
            
        
    }

    
    
                
  
