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
        while(!usernameValid)
        { username =(JOptionPane.showInputDialog(null,"Enter your username" ));
        
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
        while(!passwordValid)
        { password =(JOptionPane.showInputDialog(null,"Enter your password" ));
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
        } else {
            JOptionPane.showMessageDialog(null,"You have not been successfully logged in");
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


/*
Anonymous. 2021. Boolean Keyword in Java. (Version 1.0-SNAPSHOT) [Source code]. https://www.javatpoint.com/boolean-keyword-in-java (Accessed 1 April 2024)
Anonymous. 2023. Java Stringformat() Method with Examples. (Version 1.0-SNAPSHOT) [Source code]. https://www.geeksforgeeks.org/java-string-format-method-with-examples/ (Accessed 1 April 2024)
Baeldung  Michal,A. Java Check a String for Lowercase/Uppercase Letter, Special Character and Digit. (Version 1.0-SNAPSHOT) [Source code]. https://www.baeldung.com/java-lowercase-uppercase-special-character-digit-regex (Accessed 11 April 2024)
Farrell, J. 2018. Java Programming
Gravelle, R. 2023. Java WHILE and DO WHILE Loops. (Version 1.0-SNAPSHOT) [Source code]. https://www.developer.com/java/java-while-loops/ (Accessed 10 April 2024)
IIEVC School of Computer Science.2022. Basic Unit Testing example. (Version 1.0-SNAPSHOT) [Source Code]. https://youtu.be/2UxaA00H3og?si=Pb5TxsUsqDd7Ev5m (Accessed 7 April 2024)
John. 2021. Equals() vs == in Java-The Real Difference.(Version 1.0-SNAPSHOT) [Source code]. https://youtu.be/AoUVdLWFQw?si=tAhlCgHOCZ1m2rxH (Accessed 9 April 2024)
McKenzie, C. 2022. User Input with a Java JOptionPane example. (Version 1.0-SNAPSHOT) [Source code]. https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-user-input-with-a-Swing-JOptionPane-example (Accessed 7 April 2024)
Pankaj. 2022. Java Access Modifiers. (Version 1.0-SNAPSHOT) [Source code]. https://www.digitalocean.com/community/tutorials/java-access-modifiers (Accessed 11 April 2024)
Patidar, R. 2024. How to Validate Input in Java. (Version 1.0-SNAPSHOT) [Source code]. https://www.delfstack.com/howto/java/java-input-validation/ (Accessed 11 April 2024)
Ramgulia, G. 2023. Java.equals() Method: A Detailed Tutorial. (Version 1.0-SNAPSHOT) [Source code]. https://ioflood.com/blog/dot-equals-method-java/ (Accessed 9 April)
Shrivasta, A. 2023. Unit Testing in Java with JUnit. (Version 1.0-SNAPSHOT) [Source code]. https://www.browserstack.com/guide/unit-testing-java (Accessed 11 April 2024)
*/

