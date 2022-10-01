package org.project;

import org.project.Model.AunthenticatedUser;
import org.project.Model.UserCredentials;
import org.project.Services.ConsoleService;

import java.util.Arrays;

public class LuckyNumbers {

    private AunthenticatedUser currentUser;
    ConsoleService consoleService = new ConsoleService();
    static Pick3 pick3 = new Pick3();
    static Pick4 pick4 = new Pick4();
    static Pick5 pick5 = new Pick5();
    static Pick6 pick6 = new Pick6();
    static MegaMillions megaMillions = new MegaMillions();

    public static void main(String[] args) {
        LuckyNumbers luckyNumbers = new LuckyNumbers();
        luckyNumbers.run();
    }
    private void run() {
        consoleService.printGreeting();
        loginMenu();
    }
    private void loginMenu() {
        int menuSelection = -1;
        while (menuSelection != 0) {
            consoleService.printLoginMenu();
            menuSelection = consoleService.promptForMenuSelection("Please choose an option: ");
            if (menuSelection == 1) {
                System.out.println("Your Lucky Numbers:  ");
                System.out.println("Pick 3: " + Arrays.toString(pick3.generateThree()));
                System.out.println("Pick 4: " + Arrays.toString(pick4.generateFour()));
                System.out.println("Pick 5: " + Arrays.toString(pick5.generateFive()));
                System.out.println("Pick 6: " + Arrays.toString(pick6.generateSix()));
                System.out.println("Mega Millions: " + Arrays.toString(megaMillions.megaMillions()) + " Mega Ball: " + megaMillions.megaBall());
            } else if (menuSelection == 0) {
                break;
            }
        }
    }
//
//    private void handleRegister() {
//        System.out.println("Please register a new user account");
//        UserCredentials credentials = consoleService.promptForCredentials();
//        if (authenticationService.register(credentials)) {
//            System.out.println("Registration successful. You can now login.");
//        } else {
//            consoleService.printErrorMessage();
//        }
//    }


}