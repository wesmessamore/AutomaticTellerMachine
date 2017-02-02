/**
 * Created Feb 1, 2017 by Wes Messamore for Day 3 Homework Assignment at The Iron Yard
 * This is a simple program for an ATM that greets user, displays balance, and tells user if they
 * attempt to withdraw more than their account balance.
 */

import java.util.Scanner;

public class ATM {
    static Scanner scanner = new Scanner(System.in);
    static Scanner scannerfloat = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        System.out.println("Thank You for using Java Bank!");

        User user = new User();

        user.chooseName();
        user.chooseOption();


    }


}