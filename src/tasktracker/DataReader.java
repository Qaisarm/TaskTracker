/**
 * This class @ DataReader reads the data from file (fileName)
 * 
 * 
 * 
 */
package tasktracker;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Qaisar Mukhtar
 * @version 2018-04-02
 */
public class DataReader {

    private final String fileName;

    /**
     *
     * @param fileName intakes the file
     */
    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @return the taskList
     */
    public List<ToDoTaskList> readFromFile() {

        List<ToDoTaskList> taskList = new ArrayList<>();

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            Object record = inputStream.readObject();
            ToDoTaskList task = (ToDoTaskList) record;
            while (record != null) {
                taskList.add(task);
                task = (ToDoTaskList) inputStream.readObject();
            }
            inputStream.close();
            
        } catch (FileNotFoundException ef) {
            System.out.print(ef.getMessage() + "File not found");
        } catch (IOException e) {
            System.out.print(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.print(e.getMessage() + "class not found");
        }

        return taskList;
    }

}
