/*
 * This class takes the user input.
 */
package tasktracker;

import java.util.Scanner;

public class UserInput {

    Scanner scanner;

    public String getInput() {
        scanner = new Scanner(System.in);
        String line = "";

        try {
            line = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return line;
    }

}
