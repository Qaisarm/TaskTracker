
public class TaskTracker{
/*
 * @ showWlecomeMenu Prints the welcome Menu
 * 
 */

void showWelcomeMenu(int completedTasks, int tasksToComplete) {
    System.out.println("******************************");
    System.out.println();
    System.out.println("Welcome to TaskTracker: A To-do List Application ");
    System.out.println("Good Day :). You have " + completedTasks + " completed tasks!");
    System.out.println("You have " + tasksToComplete + " tasks to complete");
    System.out.println("******************************");
    System.out.println();
}
/*@ showMenu Prints the Option menu
 * 
 */
void showMenu() {
    System.out.println("*******************************");
    System.out.println("Please select one of the following options: ");
    System.out.println();
    System.out.println("Enter (1): To view the Task List");
    System.out.println("Enter (2): To add a new Task to Task List");
    System.out.println("Enter (3): To edit the Task List");
    System.out.println("Enter (4): To remove a Task from the Task List");
    System.out.println();
    System.out.println("Enter (9): To exit the TaskTracker Application");

    System.out.println("********************************");
}

}
