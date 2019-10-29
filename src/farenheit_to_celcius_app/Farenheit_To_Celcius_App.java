/*
 * Handout Project 3.1
 * Course: Introduction to JAVA - (72636)
 * Programmer: Ivoire Morrell
 * This program takes user input for farenheit and convers it into celsius
 */
                 
package farenheit_to_celcius_app;

//import Scanner class
import java.util.Scanner;

public class Farenheit_To_Celcius_App
{
    public static void main(String[] args)
    {
        //Print welcome message
        System.out.println("Welcome to Fareheit to Celcius Calculator\n");
        
        //Create scanner object
        Scanner sc = new Scanner(System.in);
        
        // initialize farenheit variable
        double fahrenheit = 0;
        
        //Create string choice to control while loop
        String userChoice = "y";
        
        //Create while loop to control user input
        while (userChoice.equalsIgnoreCase("y"))
        {
            //Enter the fahrenheit
            fahrenheit = getDouble(sc, "Enter the fahrenheit\n");
            
            //Calculate the celsius
            double celcius = getCelsius(fahrenheit);
            
            System.out.println();
            
            //Print out the celcius
            String message = ("Degrees in Celcius: " + celcius + "\n");
            
            //Print message
            System.out.println(message);
            
            //Would user like to go again?
            System.out.println("Would user like to continue? (y/n)" + "\n");
            
            //user choice
            
            userChoice = sc.next();
            
            System.out.println();
        }
        
        //End of program
        System.out.println("Program ended");
    }
    
    //Get double method checks to see if user entered correct value
    //If user enters the correct value program will continue flow
    //If not, user will be promt to re-enter correct value
    
    private static double getDouble(Scanner sc, String prompt)
    {
        //Intialize double value that will be returned
        double numberValue = 0.0;
        
        //Create boolean variable to test for true/false user input
        boolean isValid = false;
        
        //While loop to control and return user input
        while (isValid == false)
        {
            //Print out prompt message
            System.out.println(prompt);
            
            //Use if else loop to test for valid input. use has next double
            //object which will automatically test variable
            
            if (sc.hasNextDouble())
            {
                numberValue = sc.nextDouble();
                
                //make isValid true which exits the loop
                isValid = true;
            }
            else
            {
                //Print out error message for invalid input
                System.out.println("Error! Invalid decimal value. Try again.");
            }
            //use the sc.nextline object to discard any other data entered on 
            //the line
            sc.nextLine();
        }
        //return number value
        return numberValue;
    }
   //Get celcius is a method that converts the fahrenheit entered by the user
    //into the degrees in celcius
    
    private static double getCelsius(Double fahrenheit)
    {
       //Create celcius variable that will be returned
        double celsius;
        
        //use the celcius converter equation to collect celsius
        celsius = (fahrenheit - 32) * 5/9;
        
        return celsius;
    }        
}
