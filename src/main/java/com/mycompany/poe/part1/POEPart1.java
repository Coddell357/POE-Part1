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
        
        firstname = JOptionPane.showInputDialog(null, "Enter your firstname");
        
        lastname = JOptionPane.showInputDialog(null, "Enter your lastname");
        
        username = JOptionPane.showInputDialog(null, "Enter your username");
        lg.CheckUsername(username);
        
        //Username WhileLoop
        if( lg.CheckUsername(username)== true) {
            JOptionPane.showMessageDialog(null,"Username successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an underscore and is no more than 5 characters in length.");
        }
        
        
        
        //Password WhileLoop
        password = JOptionPane.showInputDialog(null, "Enter your password");
        lg.CheckPasswordComplexity(password);
        
        if(lg.CheckPasswordComplexity(password) == true) {
        JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the passowrd contains at least 8 characters, a capital letter, a number and a special character.");
        }
        
        
        
        
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
        
        lg.LoginUser(username, password);
        
        if(lg.LoginUser(username, password) == true) {
            JOptionPane.showMessageDialog(null,"You have been successfully registered");
        }
        
        lg.returnLoginStatus();
        
        if(lg.returnLoginStatus().equals("Successfull login")) {
           JOptionPane.showMessageDialog(null, "Welcome " + firstname + lastname + 
        " it is great to see you again.");
        }else{
        JOptionPane.showMessageDialog(null, "Username or password incorrect, " +
        "please try again.");
        }
    }
}
