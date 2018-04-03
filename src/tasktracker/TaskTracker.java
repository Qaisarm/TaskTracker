package tasktracker;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author tmp-sda-1182
 */
public class TaskTracker {

    ToDoTaskCollection taskCollection;
    Scanner scanner;
    int UserInput;
	private Scanner input;

    public TaskTracker() {
        scanner = new Scanner(System.in);
        taskCollection = new ToDoTaskCollection();
        taskCollection.readFile();
    }

    /*
 * @ showWlecomeMenu Prints the welcome Menu
 * 
     */

    public void MainMenu() {
        System.out.println("******************************");
        System.out.println();
        System.out.println("Welcome to TaskTracker: A To-do List Application ");
        System.out.println("Good Day :).");
        System.out.println("You have " + taskCollection.numberOfCompletedTasks() + " completed Tasks!");
        System.out.println("You have " + taskCollection.numberOfUnCompletedTasks() + " Tasks still to complete");
        System.out.println("******************************");
    }

    public void WelcomeMenu() {
        System.out.println();
        System.out.println("*******************************");
        System.out.println("Please select one of the following options: ");
        System.out.println();
        System.out.println("Enter (1): To view the Task List");
        System.out.println("Enter (2): To add a new Task to Task List");
        System.out.println("Enter (3): To edit the Task List");
        System.out.println("Enter (4): To remove a Task from the Task List");
        System.out.println();
        System.out.println("Enter (0): To exit the TaskTracker Application");

        System.out.println("********************************");
    }

    /**
     *
     */
    public void optionMenu() {
        Boolean exit = false;
        while (!exit) {
            WelcomeMenu();
            input = new Scanner(System.in);
            String userInput = input.nextLine();

            switch (userInput) {
                case "1":
                    showTaskList();
                    break;
                case "2":
                    taskCollection.addNewTask();
                    break;

                case "3":
                    editTask();
                    break;

                case "4":
                    removeTask();
                    break;
                case "0":
                    taskCollection.writeFile();
                    System.out.println(" Tasks are Saved: Exiting the System");

                    exit = true;
                    break;
                default:
                    System.out.println("Don't recognize the input: Please insert a valid option Number (1-4)");

            }
        }
    }

    private void showTaskList() {
        System.out.println("************************************");
        System.out.println("Enter (1) to View Task List By Date ");
        System.out.println("or");
        System.out.println("Enter (2) to View Task List By Project Name");
        System.out.println("************************************");
        int showTaskInput = readInt();

        switch (showTaskInput) {
            case 1:
                List<ToDoTaskList> result = taskCollection.sortByDate();
                result.stream().forEach(
                        (task -> System.out.println(task)));
                break;

            case 2:
                List<ToDoTaskList> sortResult = taskCollection.sortByProject();
                sortResult.stream().forEach(task -> System.out.println(task));
                break;

            default:
                System.out.print("Please enter the correct no.");
        }
    }

    private void editTask() {
        System.out.println("**************************'");
        System.out.println("Enter (1) to Edit the Task List.");
        System.out.println("'");
        System.out.println("Enter (2) to Mark the Task as done.");
        System.out.println("**************************'");

        int editTaskInput = readInt();

        switch (editTaskInput) {
            case 1:
                printTaskList();
                String searchTitle = readString("To Edit the Task List, Please enter the desired task Name");
                taskCollection.editTask(searchTitle);
                break;

            case 2:
                printTaskList();
                String searchStatus = readString("To change status of Task, Please enter the Task Name");
                taskCollection.markAsDone(searchStatus);
                break;
            default:
                System.out.print("Please enter the correct Task name.");
        }
    }

    private void removeTask() {
        List<ToDoTaskList> result = taskCollection.sortByDate();
        result.stream().forEach((t -> System.out.println(t)));
        taskCollection.removeTask(readString("To Remove the Task List, Please enter the Task Name"));
    }

    private void printTaskList() {
        System.out.println("Here is your Lists of Tasks");
        List<ToDoTaskList> sortResult = taskCollection.sortByTaskName();
        sortResult.stream().forEach((task -> {
            System.out.println(task);
        }));
    }

    /**
     *
     * @param outputText
     * @return
     */
    int readInt(String outputText) {
        if (outputText != null) {
            System.out.println(outputText);
        }
        while (true) {
            try {
                return scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Please enter an Integer ");
                scanner.next();
            }
        }
    }

    int readInt() {
        return readInt(null);
    }

    /**
     *
     * @param outputText
     * @return
     */
    String readString(String outputText) {
        if (outputText != null) {
            System.out.println(outputText);
        }
        return scanner.next();
    }

    String readString() {
        return readString(null);
    }

}
