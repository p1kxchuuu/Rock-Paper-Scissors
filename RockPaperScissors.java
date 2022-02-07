//Importing to handle the randomizer, scanners, and delays
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class RockPaperScissors {
    public static void main(String[] args) throws InterruptedException {
        //First scanner for the user's input when starting a game
        Scanner rock = new Scanner(System.in); //ITSABOUTDRIVEITSABOUTPOWERWESTAYHUNGRYWEDEVSDWAHRKJSHGSKDJG(im sorry lmao)
        //Second scanner to handle the user's inputs and scoring
        Scanner paper = new Scanner(System.in);
        //Third scanner to handle the loop
        Scanner scissors = new Scanner(System.in);

        //String to hold the user's response when asked to start a game
        String userAnswer;
        //String to manage the user's answers and score when the game is running
        String userGiven;
        //String to hold the loop prompt
        String userResponse;
        //Boolean variable to handle the loop
        boolean loopCheck = true;

        //Array to hold the outputs the program will give
        String [] game = {"Rock", "Paper", "Scissors"};
        Random randomizer = new Random();

        //Array to hold the outputs the program will give when a tie occurs
        String [] tiewords = {"Hax.", "I guess you could say you beat the system-?", "Bro stop copying", "haha twinsies lmao"};
        Random tie = new Random();

        //Array to hold the outputs the program will give when the user loses
        String [] losewords = {"L", "Touch grass", "u suck lol", "You're at the top of the bell curve", "why didnt you just casually read the future", "emotional damage"};
        Random loser = new Random();

        //Game start prompt
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Would you like to play a game?");
        userAnswer = rock.next();

        while(loopCheck) {
                //If the user's response is yes, the game will continue to run
            if(userAnswer.equals("Yes")) {

                    //Array selectors
                int select = randomizer.nextInt(game.length);
                int same = tie.nextInt(tiewords.length);
                int loss = loser.nextInt(losewords.length);

                    //Counts down the time for the user
                System.out.println("Okay, give me rock, paper, or scissors on count of three!");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Rock, (3)");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Paper, (2)");
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Scissors, (1)");
                TimeUnit.SECONDS.sleep(1);

                    //Prompts the user to give their input
                System.out.println("SHOOT! (Give your input)");
                userGiven = paper.nextLine();
                System.out.println("Bot says: " + game[select]);

                    //System gives rock
                if(select == 0) {
                        //If the user says paper, the win message is given
                    if(userGiven.equals("Paper")) {
                        System.out.println("You won!");
                        //If the user says rock, the tie message is given
                    } else if(userGiven.equals("Rock")) {
                        System.out.println("You tied for rock. " + tiewords[select]);
                        //If the user says scissors, the lose message is given
                    } else if(userGiven.equals("Scissors")) {
                        System.out.println(losewords[select] + " (In other words, you lost)");
                        //If anything else is inputted, the error message is given
                    } else {
                        System.out.println("That is an invalid answer, please try again.");
                    }

                    //System gives paper
                } else if(select == 1) {
                        //If the user says scissors, the win message is given
                    if(userGiven.equals("Scissors")) {
                        System.out.println("You won!");
                        //If the user says paper, the tie message is given
                    } else if(userGiven.equals("Paper")) {
                        System.out.println("You tied for paper. " + tiewords[select]);
                        //If the user says rock, the lose message is given
                    } else if(userGiven.equals("Rock")) {
                        System.out.println(losewords[select] + " (In other words, you lost)");
                        //If anything else is inputted, the error message is given
                    } else {
                        System.out.println("That is an invalid answer, please try again.");
                    }

                    //System gives scissors
                } else if(select == 2) {
                        //If the user says rock, the win message is given
                    if(userGiven.equals("Rock")) {
                        System.out.println("You won!");
                        //If the user says scissors, the tie message is given
                    } else if(userGiven.equals("Scissors")) {
                        System.out.println("You tied for scissors. " + tiewords[select]);
                        //If the user says paper, the lose message is given
                    } else if(userGiven.equals("Paper")) {
                        System.out.println(losewords[select] + " (In other words, you lost");
                        //If anything else is inputted, the error message is given
                    } else {
                        System.out.println("That is an invalid answer, please try again.");
                    }
                }

                //Asks the user if they want to play another game
                System.out.println("Do you want to play again?");
                userResponse = scissors.nextLine();

                    //If the user's response is yes, the program is repeated
                if(userResponse.equals("Yes")) {
                    loopCheck = true;

                    //If the user's response is no, the program is ended
                } else if(userResponse.equals("No")) {
                    System.out.println("Thank you for playing!");
                    loopCheck = false;
                }

                //If the user's response is no, the program is ended
            } else if(userAnswer.equals("No")) {
                System.out.println("Alright then… heartbrocken~~ </3");
                loopCheck = false;
                //If anything else is inputted, the program is ended
            } else {
                System.out.println("…I'm gonna assume you meant no.");
            }
        }

        //Closes the scanners
        rock.close();
        paper.close();
        scissors.close();

    }
}
