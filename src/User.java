/**
 * Created by Wesley on 2/1/17.
 */
public class User {
    String name;
    String option;
    String location;

    void chooseName() throws Exception {
        System.out.println("What is your Name?");
        name = ATM.scanner.nextLine();

        /* When user just presses enter, program throws an exception. For anything else
        they type, it says Welcome, and then whatever they typed.
         */

        if (name.isEmpty()) {
            throw new Exception("Must enter name!");
        } else System.out.println("Welcome, " + name);

    }

    void chooseOption() throws Exception {
        System.out.println("WHAT WOULD YOU LIKE TO DO?");
        System.out.println("=>Press 1 to Check Balance");
        System.out.println("=>Press 2 to Withdraw Funds");
        System.out.println("=>Press 3 to Cancel");

        option = ATM.scanner.nextLine();

        switch (option) {
            case "1":
                System.out.println("Your balance is $100.00");
                break;
            case "2":
                System.out.println("How much money would you like to withdraw?");

                float amount = ATM.scannerfloat.nextFloat();

                if (amount > 100.00) {
                    System.out.println("Insufficient Funds.");
                } else {
                    System.out.println("Please take your money and beat it.");
                }
                break;
            case "3":
                System.out.println("Here's your ATM card back. Beat it.");
                break;
            default:
                throw new Exception("Invalid weapon!");

        }
    }

}