package tasktracker;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

/**
 *
 * @author tmp-sda-1182
 */
public class DataWriter {

    private String fileName = "";

    public DataWriter(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @param toDoTaskList
     */
    public void writeToFile(List<ToDoTaskList> toDoTaskList) {

        try {

            try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
                for (ToDoTaskList task : toDoTaskList) {
                    outStream.writeObject(task);
                }
            }
        } catch (FileNotFoundException nfe) {
            System.out.print(nfe.getMessage() + "File not found");
        } catch (IOException ioe) {
            System.out.print(ioe.getMessage());
        }

    }

}
