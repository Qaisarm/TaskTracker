package tasktracker;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tmp-sda-1178
 */
public class DataReader {

    private final String fileName;

    /**
     *
     * @param fileName
     */
    public DataReader(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     * @return
     */
    @SuppressWarnings("ConvertToTryWithResources")
    public List<ToDoTaskList> readFromFile() {

        List<ToDoTaskList> taskList = new ArrayList();

        try {
            ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(fileName));
            Object record = inStream.readObject();
            ToDoTaskList task = (ToDoTaskList) record;
            while (record != null) {
                taskList.add(task);
                task = (ToDoTaskList) inStream.readObject();

            }

            inStream.close();

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
