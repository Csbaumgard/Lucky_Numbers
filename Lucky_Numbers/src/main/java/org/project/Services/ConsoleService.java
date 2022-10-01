package org.project.Services;

import org.project.Model.UserCredentials;

import java.util.Scanner;

public class ConsoleService {
    Scanner scanner = new Scanner(System.in);

    public void printGreeting() {
        System.out.println("*******************");
        System.out.println("** Lucky Numbers **");
        System.out.println("*******************");
    }

    public void printLoginMenu() {
        System.out.println();
        System.out.println("1: Lucky Numbers");
        System.out.println("0: Exit");
        System.out.println();
    }

    public int promptForMenuSelection(String prompt) {
        int menuSelection;
        System.out.print(prompt);
        try {
            menuSelection = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            menuSelection = -1;
        }
        return menuSelection;
    }

    public UserCredentials promptForCredentials() {
        String username = promptForString("Username: ");
        String password = promptForString("Password: ");
        return new UserCredentials(username, password);
    }

    private String promptForString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }
}
