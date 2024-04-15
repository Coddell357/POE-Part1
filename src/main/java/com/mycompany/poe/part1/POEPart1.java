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

    /*Pankaj(2022)
      Access Modifiers provide access control if they can be used by other classes or not according to their keyword
      Public Keyword means it can be used in any class, it is a global vafriable
    */
    public static void main(String[] args) {
        //Declaring String variables that will be used in the main class
        String username;
        String password;
        String firstname;
        String lastname;
        
        Login lg = new Login(); // creating an instance in order to use our methods from Login class
        
        /* McKenzie,C(2022)
           The input dialog field for JOptionPane shows a prompt that allows user to enter required information
           prompt user for firstname input
        */
        firstname = JOptionPane.showInputDialog(null, "Enter your firstname");
        
        //prompt useer for input of lastname
        lastname = JOptionPane.showInputDialog(null, "Enter your lastname");
        
         //prompted user for username input
        username = JOptionPane.showInputDialog(null, "Enter your username"); 
        lg.CheckUsername(username); //calling a method from Login class
        
        /* Farrel,J(2018)
           The if/if else statements allows the program to make a decision given certain requirements and displays given messages from programmer
           if else statements checks if the username is correctly formatted if not it will display appropriate message
        */
        if( lg.CheckUsername(username)== true) {
            
            /* Farrel,J(2018)
               The Message Dialog field of JOptionPane displays a message to the user
               The user will get a message according to if their username meets the username requirements or not
            */
            JOptionPane.showMessageDialog(null,"Username successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Username is not correctly formatted, please ensure that your username contains an"
          + " underscore and is no more than 5 characters in length."); //Error message that displays if username is incorrectly formatted
        }
        
        
        //prompted user for password input
        password = JOptionPane.showInputDialog(null, "Enter your password");
        lg.CheckPasswordComplexity(password); //calling a method from Login class
        
        //Checking if password input from user is formatted correctly or not thus a messahge will be displayed
        if(lg.CheckPasswordComplexity(password) == true) {
        JOptionPane.showMessageDialog(null, "Password successfully captured");
        }else {
        JOptionPane.showMessageDialog(null, "Password is not correctly formatted, please ensure that the passowrd contains at least"
         + " 8 characters, a capital letter, a number and a special character."); //Error message that displays if password is incorrectly formatted
        }
        
        
        
        //Username While Loop
        
        /* Farrel,J(2018)
           Boolean is a data type that results in true or false only
           We are chacking if the username is valid or not in order for the user to be registered 
        */
        boolean usernameValid = false;
        
        /* Gravelle,R(2023)
           While Loop allows the program to repeatedly ask the user for the input until it reaches the requiremenets/expectations
           While Loop will run if the username is not correct
        */
        while(!usernameValid)
            
            //if username is incorrect then the user is forced to type their username until it is corrrect for a successfull login
        { username =(JOptionPane.showInputDialog(null,"Enter your username" ));
        
             if( ! lg.CheckUsername(username))
            {
                //System will dispaly this message everytime the username is incorrectly formatted by user
                JOptionPane.showMessageDialog(null,"Username is not correctly formatted, please ensure that your username contains"
                 + " an underscore and is no more than 5 characters in length.");
            }  
            else
            {
                usernameValid = true;
            }
        }
        
        //Password WhileLoop
        boolean passwordValid = false;
        while(!passwordValid) //if the password is wrong the while loop will continue
            //user is prompted for password input until it is correct to continue
        { password =(JOptionPane.showInputDialog(null,"Enter your password" ));
             if( ! lg.CheckPasswordComplexity(password))
            {
                //if password is wrong then system will output this message
                JOptionPane.showMessageDialog(null,"Password is not correctly formatted, please ensure that the passsword contains"
                 + " at least 8 characters, a capital letter, a number and a special character");
            }  
            else
            {
                passwordValid = true;
            }
        }
        

       // if password and username are the same and correctly given the the user is successfully registered
        lg.registerUser(); //calling registerUser() method from Login class
        
        
        //Checks if the userrname and password are correct so user can be successfully logged in and display that message
        if(lg.LoginUser(username, password) == true) {
            JOptionPane.showMessageDialog(null,"You have been successfully logged in");
        } else {
            JOptionPane.showMessageDialog(null,"You have not been successfully logged in"); //errror message that occurs if both password and username are incorrect
        }
            
        
       
        //if the user has successfully logged in then the Welcome message will be displayed along with their first and last name
        //else they have to reguster and login again to recieve a welcome message
        if(lg.returnLoginStatus().equals("Successfull login")) {
           JOptionPane.showMessageDialog(null, "Welcome " + firstname + " "+ lastname + 
        " it is great to see you again.");
        }else{
        JOptionPane.showMessageDialog(null, "Username or password incorrect, " +
        "please try again.");
        }
        
        
    }


 /*References

Anonymous. 2021. Boolean Keyword in Java. (Version 1.0-SNAPSHOT) [Source code]. https://www.javatpoint.com/boolean-keyword-in-java (Accessed 1 April 2024)
Anonymous. 2023. Java Stringformat() Method with Examples. (Version 1.0-SNAPSHOT) [Source code]. https://www.geeksforgeeks.org/java-string-format-method-with-examples/ (Accessed 1 April 2024)
Baeldung and Michal,A. Java Check a String for Lowercase/Uppercase Letter, Special Character and Digit. (Version 1.0-SNAPSHOT) [Source code]. https://www.baeldung.com/java-lowercase-uppercase-special-character-digit-regex (Accessed 11 April 2024)
Farrell, J. 2018. Java Programming. 9th ed. Boston;Cengage
Gravelle, R. 2023. Java WHILE and DO WHILE Loops. (Version 1.0-SNAPSHOT) [Source code]. https://www.developer.com/java/java-while-loops/ (Accessed 10 April 2024)
IIEVC School of Computer Science.2022. Basic Unit Testing example. (Version 1.0-SNAPSHOT) [Source Code]. https://youtu.be/2UxaA00H3og?si=Pb5TxsUsqDd7Ev5m (Accessed 7 April 2024)
John. 2021. Equals() vs == in Java-The Real Difference.(Version 1.0-SNAPSHOT) [Source code]. https://youtu.be/AoUVdLWFQw?si=tAhlCgHOCZ1m2rxH (Accessed 9 April 2024)
McKenzie, C. 2022. User Input with a Java JOptionPane example. (Version 1.0-SNAPSHOT) [Source code]. https://www.theserverside.com/blog/Coffee-Talk-Java-News-Stories-and-Opinions/Java-user-input-with-a-Swing-JOptionPane-example (Accessed 7 April 2024)
Pankaj. 2022. Java Access Modifiers. (Version 1.0-SNAPSHOT) [Source code]. https://www.digitalocean.com/community/tutorials/java-access-modifiers (Accessed 11 April 2024)
Patidar, R. 2024. How to Validate Input in Java. (Version 1.0-SNAPSHOT) [Source code]. https://www.delfstack.com/howto/java/java-input-validation/ (Accessed 11 April 2024)
Ramgulia, G. 2023. Java.equals() Method: A Detailed Tutorial. (Version 1.0-SNAPSHOT) [Source code]. https://ioflood.com/blog/dot-equals-method-java/ (Accessed 9 April)
Shrivasta, A. 2023. Unit Testing in Java with JUnit. (Version 1.0-SNAPSHOT) [Source code]. https://www.browserstack.com/guide/unit-testing-java (Accessed 11 April 2024)
*/

}