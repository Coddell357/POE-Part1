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
        
        username = JOptionPane.showInputDialog(null, "Enter your username");
        lg.CheckUsername(username);
        JOptionPane.showMessageDialog(null,"Username is incorrect");
        username = JOptionPane.showInputDialog(null, "Enter username");
        
        password = JOptionPane.showInputDialog(null, "Enter your password");
        lg.CheckPasswordComplexity(password);
        
        
        firstname = JOptionPane.showInputDialog(null, "Enter your firstname");
        
        lastname = JOptionPane.showInputDialog(null, "Enter your lastname");
        
        
        JOptionPane.showMessageDialog(null, "Welcome " + firstname + lastname + 
        " it is great to see you again.");
        
        JOptionPane.showMessageDialog(null, "Username or password incorrect, " +
        "please try again.");
        
    }
}
