//Importing to handle the scanners
import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        //First scanner to handle the currency inputted by the user
        Scanner currency = new Scanner(System.in);
        //Second scanner to handle the user's response if they want to run another conversion
        Scanner converter = new Scanner(System.in);

        //String to hold the currency inputted
        String currencyType;
        //String to hold the loop prompt
        String userResponse;
        //Int variable to hold the amount of currency inputted by the user
        int amount;
        //Boolean variable to handle the loop
        boolean loopCheck = true;

        System.out.println("This program converts USD to the currencies listed below.");

        while(loopCheck) {
            //Prompts the user for an amount of USD
            System.out.println("Please input an amount of money in USD.");
            amount = currency.nextInt();

            //Gives the user a list of possible currencies to input
            System.out.println("Please input one of the currencies shown: Australian, Canadian, Euro[European], Franc[Swiss], Hong Kong, Krona[Sweden], Krone[Norway], Lira[Turkey], New Zealand, Peso[Mexican], Pound[Great Britain], Rand[South Africa], Real[Brazil], Ruble[Russian], Rupee[Indian], Singapore, Taiwan, Won[South Korean], Yen[Japanese], Yuan[Chinese], Zloty[Poland]");
            currencyType = currency.next();

            //If and else if statements to give the correct conversion based on the user input
            if(currencyType.equals("Australian")) {
                double australian = amount * 1.40;
                System.out.println(amount + " USD is equal to " + australian + " Australian dollar(s).");

            } else if(currencyType.equals("Canadian")) {
                double canadian = amount * 1.27;
                System.out.println(amount + " USD is equal to " + canadian + " Canadian dollar(s).");

            } else if(currencyType.equals("Euro")) {
                double euro = amount * 0.89;
                System.out.println(amount + " USD is equal to " + euro + " Euro(s).");

            } else if(currencyType.equals("Hong Kong")) {
                double hongkong = amount * 7.80;
                System.out.println(amount + " USD is equal to " + hongkong + " Hong Kong dollar(s).");

            } else if(currencyType.equals("Krona")) {
                double krona = amount * 9.21;
                System.out.println(amount + " USD is equal to " + krona + " Swedish krona.");

            } else if(currencyType.equals("Krone")) {
                double krone = amount * 8.82;
                System.out.println(amount + " USD is equal to " + krone + " Norwegian krone.");

            } else if(currencyType.equals("Lira")) {
                double lira = amount * 13.48;
                System.out.println(amount + " USD is equal to " + lira + " Turkish lira.");

            } else if(currencyType.equals("New Zealand")) {
                double newzealand = amount * 1.51;
                System.out.println(amount + " USD is equal to " + newzealand + " New Zealand dollar(s).");

            } else if(currencyType.equals("Peso")) {
                double peso = amount * 20.57;
                System.out.println(amount + " USD is equal to " + peso + " Mexican peso(s).");

            } else if(currencyType.equals("Pound")) {
                double pound = amount * 0.74;
                System.out.println(amount + " USD is equal to " + pound + " British pound sterling(s).");

            } else if(currencyType.equals("Rand")) {
                double rand = amount * 15.36;
                System.out.println(amount + " USD is equal to " + rand + " South African rand(s).");

            } else if(currencyType.equals("Real")) {
                double real = amount * 5.26;
                System.out.println(amount + " USD is equal to " + real + " Brazilian real(s).");

            } else if(currencyType.equals("Ruble")) {
                double ruble = amount * 76.34;
                System.out.println(amount + " USD is equal to " + ruble + " Russian ruble(s).");

            } else if(currencyType.equals("Rupee")) {
                double rupee = amount * 75.03;
                System.out.println(amount + " USD is equal to " + rupee + " Indian rupee(s).");

            } else if(currencyType.equals("Singapore")) {
                double singapore = amount * 1.35;
                System.out.println(amount + " USD is equal to " + singapore + " Singaporean dollar(s).");

            } else if(currencyType.equals("Taiwan")) {
                double taiwan = amount * 27.77;
                System.out.println(amount + " USD is equal to " + taiwan + " New Taiwan dollars.");

            } else if(currencyType.equals("Won")) {
                double won = amount * 1200.32;
                System.out.println(amount + " USD is equal to " + won + " South Korean won.");

            } else if(currencyType.equals("Yen")) {
                double yen = amount * 114.65;
                System.out.println(amount + " USD is equal to " + yen + " Japanese yen.");

            } else if(currencyType.equals("Yuan")) {
                double yuan = amount * 6.36;
                System.out.println(amount + " USD is equal to " + yuan + " Chinese yuan.");

            } else if(currencyType.equals("Zloty")) {
                double zloty = amount * 4.02;
                System.out.println(amount + " USD is equal to " + zloty + " Polish zloty.");
            }

            //Prompts the user to run another conversion
            System.out.println("Run another conversion? (Please use: Yes/No)");
            userResponse = converter.nextLine();

            //If the user's response is yes, the program is repeated
            if(userResponse.equals("Yes")) {
                loopCheck = true;

            //If the user's response is no, the program is ended
            } else if(userResponse.equals("No")) {
                System.out.println("Thank you for using our services.");
                loopCheck = false;
            }
        }
        //Closes the scanners
        currency.close();
        converter.close();
    }
}