
package tasktracker;
import java.io.IOException;

/**
 *  This class is the main class of the "TaskTracker" A To-do List Application. 
 *  This is a simple Version of WelcomeMenu application.
 
  In this version user can View, Add, and Remove the tasks from the file.
  
  This class allows user to switch between different options
   to Create and edit the file.
 * 
 * @author  Qaisar Mukhtar
 * @version 2018.04.01
 */
public class Main {

    /**
     *
     * @param args
     * @throws IOException
     */
    public static void main (String[] args) throws IOException  {
        TaskTracker toDoApp = new TaskTracker ();
        toDoApp.MainMenu();
        toDoApp.optionMenu();
    }
    
}
