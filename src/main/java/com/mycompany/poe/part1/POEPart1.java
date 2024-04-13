/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poe.part1;

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;

public class POEPart1 {

    public static void main(String[] args) {
        String username;
        String password;
        String firstname;
        String lastname;
        
        Login lg = new Login();
        
        //prompt user for firstname input
        firstname = JOptionPane.showInputDialog(null, "Enter your firstname");
        
        //prompt useer for input of firstname
        lastname = JOptionPane.showInputDialog(null, "Enter your lastname");
        
         //prompted user for username input
        username = JOptionPane.showInputDialog(null, "Enter your username"); 
        lg.CheckUsername(username);
        
        if( lg.CheckUsername(username)== true) {
            JOptionPane.showMessageDialog(null,"Username successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        
        
        //prompted user for password input
        password = JOptionPane.showInputDialog(null, "Enter your password");
        lg.CheckPasswordComplexity(password);
        
        if(lg.CheckPasswordComplexity(password) == true) {
        JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the passowrd contains at least 8 characters, a capital letter, a number and a special character.");
        }
        
        
        
        //Username While Loop
        boolean usernameValid = false;
        username =(JOptionPane.showInputDialog(null,"Enter your username" ));
        while(usernameValid)
        {
             if( ! lg.CheckUsername(username))
            {
                JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
            }  
            else
            {
                usernameValid = true;
            }
        }
        
        //Password WhileLoop
        boolean passwordValid = false;
        password =(JOptionPane.showInputDialog(null,"Enter your password" ));
        while(passwordValid)
        {
             if( ! lg.CheckPasswordComplexity(password))
            {
                JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the passsword contains at least 8 characters, a capital letter, a number and a special character");
            }  
            else
            {
                passwordValid = true;
            }
        }
        
        
        lg.registerUser();
        
        
        
        if(lg.LoginUser(username, password) == true) {
            JOptionPane.showMessageDialog(null,"You have been successfully logged in");
        }
        
       
        
        if(lg.returnLoginStatus().equals("Successfull login")) {
           JOptionPane.showMessageDialog(null, "Welcome " + firstname + " "+ lastname + 
        " it is great to see you again.");
        }else{
        JOptionPane.showMessageDialog(null, "Username or password incorrect, " +
        "please try again.");
        }
    }
}
