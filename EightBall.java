//Importing to handle the randomizer and scanners 
import java.util.Random;
import java.util.Scanner;

public class EightBall {
    public static void main(String[] args) {
        //First scanner to handle the user's question
        Scanner ateball = new Scanner(System.in);
        //Second scanner to handle the user's response if they want to shake again or not
        Scanner atebawl = new Scanner(System.in);

        //String to hold the user's question
        String userQuestion;
        //String to hold the user's response
        String userResponse;
        //Boolean variable to handle the loop
        boolean loopCheck = true;

        //Array which includes all the possible 8-Ball outputs
        String [] arr = {"It is certain.", "It is decidedly so.", "Without a doubt.", "Yes, definitely.", "You may rely on it.", "As I see it, yes.", "Most likely.", "Outlook good.", "Yes.", "Signs point to yes.", "reply hazy, try again.", "Ask again later.", "Better not tell you now.", "Cannot predict now.", "Concentrate and ask again.", "Don't count on it.", "My reply is no.", "My sources say no.", "Outlook not so good.", "Very doubtful."};
        
        //Selects a random output
        Random random = new Random();
        int select = random.nextInt(arr.length);

        //Loop with boolean variable to allow the user to ask multiple questions without having to run the program manually
        while (loopCheck) {
            //Prompts the user for a question
            System.out.println("A question you give and an answer I will provide!");
            userQuestion = ateball.nextLine();

            //Prints a random output after the user has entered a question
            System.out.println(arr[select]);

            //Prompts the user if they want to ask another question
            System.out.println("Shake the 8ball again? (Please use: (Yes, or No)");
            userResponse = atebawl.nextLine();

                //If the user's response is yes, the program is repeated
            if(userResponse.equals("Yes")) {
                loopCheck = true;
                System.out.println("Alright, shaking again…");

                //If the user's response is no, the program is ended
            } else if (userResponse.equals("No")){
                loopCheck = false;
                System.out.println("Okay, then put the 8ball back on the store shelf you got it from. >:( </3");
                break;
            } 
        }
        //Closes the scanners
        ateball.close();
        atebawl.close();
    }
}