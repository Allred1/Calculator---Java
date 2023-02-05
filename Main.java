import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;


// Every Java application begins with a class referencing the name of its file. 


public class Main {


    // Get user input (an equation as a string)
    static void userInput() {
        Scanner input = new Scanner(System.in); // Create a Scanner object to allow user input.

        // System.out.println("Enter a number: ");
        // System.out.println("Enter an operation: ");
        // System.out.println("Enter another number: ");
        // System.out.println("FirstNum: " + firstNum);
        // System.out.println("Operator: " + operator);
        // System.out.println("SecondNum: " + secondNum);

        System.out.println("Enter a number, operator, and number:");
        // String equation = input.nextLine();

        // Defects: needs a space
        double firstNum = input.nextDouble();
        String operator = input.next();
        double secondNum = input.nextDouble();

        // For Debugging Purposes
        // System.out.println(firstNum);
        // System.out.println(operator);
        // System.out.println(secondNum);



        var solution = performCalculations(firstNum, operator, secondNum);
        System.out.println("The solution is: " + solution);

        // return performCalculations(firstNum, operator, secondNum);

        // System.out.println("Enter an equation: ");
        // String equation = input.nextLine(); // Read user input
        // return equation;
    }

    static double performCalculations(double firstNum, String operation, double secondNum) {
        
        double result = 0;

        // Determine the operator, then calculate
        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;
            case "-":
                result = firstNum - secondNum;
                break;
            case "*":
                result = firstNum * secondNum;
                break;
            case "/":
                result = firstNum / secondNum;
                break;
        }        

        // return the solution
        return result;
    }

    // static void performCalculation(String equation) {
    //     // parse string
    //     // loop through
    //     // condition: if a number, or else
    //     // number: stored as number variables
    //     // else: stored as an operator
    // }

    // Parse the string (take the two numbers and the operator)

    // Determine operator equation, then calculate
    // Return the solution

    

 


    /*
     * Notes to self:
     *  I can take the user input, then do a shift each time an a second number is inputed. It'll give the solution to the first equation, but then automatically shift the second number into the first number's place, and allow the user to enter a second number. Ideas: a "next number" method. 
     */
    



    public static void main(String[] args) {

        // Print out "Hello World!"
        // System.out.println("Hello World!");

        
        userInput();

        // var solution = userInput();
        // System.out.println("The equation is: " + solution);
        // System.out.print("The answer is: " + solution);
        // userInput();


        // Get user input, Perform a calculation
        // performCalculations();
    }


}