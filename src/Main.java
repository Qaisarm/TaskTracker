import java.io.*;
import java.util.Scanner;
/**
 *  This class is the main class of the "TaskTracker" To-do List Application. 
 *  This is a simple Version of TaskTracker application.
 * 
 *  In this version user can View, Add, and Remove the tasks from the file.
 *  
 *  This main class allows user to switch between different options
 *   to Create and edit the file.
 * 
 * @author  Qaisar Mukhtar
 * @version 2018.03.16
 */
public class Main {
	public static void main (String[] args) throws IOException  {

    TaskTracker welcomeMenu = new TaskTracker();
    welcomeMenu.showWelcomeMenu(2,2);
    TaskTracker mainWelcome = new TaskTracker();    
    Task task = new Task();
    Boolean exit=false;
    while (!exit){
    mainWelcome.showMenu();
    Scanner input = new Scanner (System.in);
      String userInput = input.nextLine();

      switch (userInput) {
        case "1":
        	task.showList();
        break;
        case "2":
        	task.addTask();
        break;

        case "3":
        System.out.println("(3) to edit task");
        break;

        case "4":
        	task.removeTask(input);
        break;
        case "9":
        System.out.println(" Tasks are Saved: Exiting the System");
        exit=true;
        break;
        default:
        System.out.println("Don't recognize the input: Please insert a valid option");

      }
    }
  }



}
