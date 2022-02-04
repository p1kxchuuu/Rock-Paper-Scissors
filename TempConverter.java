//Importing to handle the scanners 
import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        //First scanner to handle user inputs
        Scanner hot = new Scanner(System.in);
        //Second scanner to handle the user response if they want to run another conversion
        Scanner cold = new Scanner(System.in);

        //String to hold the temperature inputted by the user
        String temperatureType;
        //String to hold the loop prompt
        String userResponse;
        //Boolean variable to handle the loop
        boolean loopCheck = true;

        System.out.println("This program is able to convert Fahrenheit to Celsius, and vice versa.");

        while(loopCheck) {
            //Gives the user a prompt
            System.out.println("Fahrenheit or Celsius?");
            temperatureType = hot.next();

            //Runs the math if the user decides to convert fahrenheit to celsius
            if(temperatureType.equals("Fahrenheit")) {
                System.out.println("Give a temperature in Fahrenheit.");
                int fdegrees = hot.nextInt();
                int ftoc = fdegrees - 32;
                double math = ftoc / 1.8;

                //Gives final output
                System.out.println(fdegrees + "˚ Fahrenheit is equal to " + math + "˚ Celsius.");

            //Runs the math if the user decides to convert celsius to fahrenheit
            } else if(temperatureType.equals("Celsius")) {
                System.out.println("Give a temperature in Celsius.");
                int cdegrees = hot.nextInt();
                double ctof = cdegrees * 1.8;
                double maff = ctof + 32;

                //Gives final output
                System.out.println(cdegrees + "˚ Celsius is equal to " + maff + "˚ Fahrenheit.");

            //Gives the user an error message if something other than the given options is inputted
            } else {
                System.out.println("That input is invalid, please try again.");

            }

            //Asks the user if they want to run another conversion
            System.out.println("Would you like to convert a temperature again? (Yes/No)");
            userResponse = cold.nextLine();

            //If the user's response is yes, the program is repeated
            if(userResponse.equals("Yes")) {
                loopCheck = true;

            //If the user's response is no, the program is ended
            } else if(userResponse.equals("No")) {
                System.out.println("Until we meet again.");
                loopCheck = false;
            }
        }
        //Closes the scanners
        hot.close();
        cold.close();
    }
}