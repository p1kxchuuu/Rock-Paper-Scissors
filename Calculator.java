//Import to handle the scanners
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
      //First scanner to handle the user input when giving numbers and operations
      Scanner calc = new Scanner(System.in);
      //Second scanner to handle the user input when asking to run another program
      Scanner ulator = new Scanner(System.in);

      //String to hold the user's response when prompted to run another operation
      String userResponse;
      //Boolean variable to handle the loop
      boolean loopCheck = true;

    //Loop allows user to ru multiple operations without having the run the program again
    while(loopCheck) {
      //Prompts user for a number
      System.out.println("Pick a number, any number!");
      int first = calc.nextInt();

      //Prompts user for an operation
      System.out.println("Give me an operation! (+, -, *, /)");
      char input = calc.next().charAt(0);

      //Prompts user for a second number
      System.out.println("Give me another number!");
      int second = calc.nextInt();

        //Gives output accordingly if the user runs an addition equation
      if(input == '+') {
          int addanswer = first + second;
          System.out.println("Your answer is " + addanswer);

        //Gives output accoridingly if the user runs a subtraction equation
      } else if(input == '-') {
          int subanswer = first - second;
          System.out.println("Your answer is " + subanswer);

          //Gives output accordingly if the user runs a mutliplication equation
      } else if(input == '*') {
          int mulanswer = first * second;
          System.out.println("Your answer is " + mulanswer);

          //Gives output accordingly if the user runs a division equation
      } else if(input == '/') {
          int divanswer = first / second;
          System.out.println("Your answer is " + divanswer);
      }
        
      //Prompts the user if they want to run another operation through
      System.out.println("Run another operation? (Say Yes or No, Case Sensitive)");
      userResponse = ulator.nextLine();

        //If the user's response is yes, the program is repeated
      if(userResponse.equals("Yes")){
        loopCheck = true;

        //If the user's response is no, the program is ended. 
      } else if(userResponse.equals("No")) {
        loopCheck = false;
        System.out.println("Thank you for using the calculator.");
        break;
      }
    }
    //Closes the scanners
    calc.close();
    ulator.close();
  }  
}