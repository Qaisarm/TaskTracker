package tasktracker;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author tmp-sda-1182
 */
public class ToDoTaskCollection {

    private final List<ToDoTaskList> taskList;
    private final UserInput userInput;
    DataWriter dataWriter;
    DataReader dataReader;

    public ToDoTaskCollection() {
        taskList = new ArrayList<>();
        userInput = new UserInput();
        dataWriter = new DataWriter("Qaisar.txt");
        dataReader = new DataReader("Qaisar.txt");
    }

    /**
     * Adds a new Task To the Task List
     */
    public void addNewTask() {
        String taskName = getInputTaskName();
        Date dueDate = getInputDueDate();
        String projectTitle = getInputProjectName();
        ToDoTaskList t = new ToDoTaskList(taskName, dueDate, projectTitle);
        taskList.add(t);
    }

    public List<ToDoTaskList> getTaskList() {
        return taskList;

    }

    /**
     * Edits the Task Name, and Project Name
     *
     * @param searchTaskName, to search the Task by Name
     */
    public void editTask(String searchTaskName) {
        if (taskList != null) {
            Iterator<ToDoTaskList> it = taskList.iterator();
            boolean isUppdated = false;
            while (it.hasNext()) {
                ToDoTaskList t = it.next();
                if (t.getTaskList().equalsIgnoreCase(searchTaskName)) {
                    String title = getInputTaskName();
                    t.setList(title);
                    Date date = getInputDueDate();
                    t.setDueDate(date);
                    String projectName = getInputProjectName();
                    t.setProjectName(projectName);
                    isUppdated = true;
                }
            }
            if (isUppdated == false) {
                System.out.println("Item not found!");
            }
        }
    }

    /**
     * Change the Status of Task
     *
     * @param searchTaskName
     */
    public void markAsDone(String searchTaskName) {
        if (taskList != null) {
            Iterator<ToDoTaskList> it = taskList.iterator();
            boolean isUppdated = false;
            while (it.hasNext()) {
                ToDoTaskList t = it.next();
                if (t.getTaskList().equalsIgnoreCase(searchTaskName)) {
                    t.setStatusDone();
                    isUppdated = true;
                    System.out.println("Task Status uppdated .......");
                }
            }
            if (isUppdated == false) {
                System.out.println("Item not found!");
            }
        }
    }

    private String getInputMsg(String outputText) {
        System.out.println("Please enter " + outputText);
        return userInput.getInput();
    }

    /**
     * Gets the Task Name from the user
     *
     * @return Task Name
     */
    public String getInputTaskName() {
        return getInputMsg("Add to Task List");
    }

    /**
     * Gets the project title from the user
     *
     * @return Project title
     */
    public String getInputProjectName() {
        return getInputMsg("Project Name ");
    }

    /**
     * Gets the due date from the user and parse it to date formate
     *
     * @return Due date in String formate
     */
    public Date getInputDueDate() {
        Date date = new Date();
        boolean isParsed = false;
        while (isParsed == false) {
            String dateStr = getInputMsg("Due Date in DD/MM/YYYY format");

            try {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy");
                date = formatter.parse(dateStr);
                isParsed = true;

            } catch (ParseException pe) {
                System.out.print(pe.getMessage());
            }
        }
        return date;
    }

    /**
     * Filter The Task List by project
     *
     * @param projectTitle to filter the tasks by Project Name
     */
    public void filterByProject(String projectTitle) {
        taskList.stream()
                .filter(s -> projectTitle.equals(s.getProjectName()))
                .forEach(s -> System.out.println(s.toString()));
    }

    /**
     * Filters the Task List by Task Name
     *
     * @param taskName to filter the task Name
     * @return List of tasks
     */
    public List<ToDoTaskList> filteredByTaskTitle(String taskName) {
        List<ToDoTaskList> result = taskList.stream()
                .filter(t -> taskName.equals(t.getTaskList()))
                .collect(Collectors.toList());
        return result;
    }

    /**
     * List out the Completed tasks
     *
     * @return List of tasks
     */
    public List<ToDoTaskList> getCompletedTasks() {
        return taskList.stream()
                .filter(t -> t.getStatus() == true)
                .collect(Collectors.toList());
    }

    /**
     * return the list the UnCompleted tasks
     *
     * @return List of tasks
     */
    public List<ToDoTaskList> getUnCompletedTasks() {
        return taskList.stream()
                .filter(t -> t.getStatus() == false)
                .collect(Collectors.toList());

    }

    /**
     * Counts the no of completed task and returns the no. of them
     *
     * @return no of complected tasks
     */
    public int numberOfCompletedTasks() {
        return getCompletedTasks().size();
    }

    /**
     * Counts the no of uncompleted tasks
     *
     * @return no of complected tasks
     */
    public int numberOfUnCompletedTasks() {
        return getUnCompletedTasks().size();
    }

    /**
     * Sorts the tasks according to the due date and returns the list
     *
     * @return the sorted array
     */
    public List<ToDoTaskList> sortByDate() {
        return taskList.stream()
                .sorted(Comparator.comparing(ToDoTaskList::getDueDate))
                .collect(Collectors.toList());
    }

    /**
     * Sorts the task by project Name  and returns the Task list
     *
     * @return the list of sorted tasks
     */
    public List<ToDoTaskList> sortByProject() {
        return taskList.stream()
                .sorted((a, b) -> a.getProjectName().compareToIgnoreCase(b.getProjectName()))
                .collect(Collectors.toList());
    }

    /**
     * Sorts the task by Task Name and returns the list of sorted
     * tasks
     *
     * @return the list of sorted tasks
     */
    public List<ToDoTaskList> sortByTaskName() {
        return taskList.stream()
                .sorted((a, b) -> a.getTaskList().compareToIgnoreCase(b.getTaskList()))
                .collect(Collectors.toList());
    }

    /**
     * Removes the task from the list and searched by title
     *
     * @param input the title of the task to be deleted
     */
    public void removeTask(String input) {
        boolean isFound = false;
        Iterator<ToDoTaskList> it = taskList.iterator();
        while (it.hasNext()) {
            if (it.next().getTaskList().equals(input)) {
                it.remove();
                System.out.println("Tasl List Deleted......");
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("Task List does not exist");
        }
    }

    /**
     * Writes list to the file
     */
    public void writeFile() {
        dataWriter.writeToFile(taskList);
    }

    /**
     * reads the file from the list
     */
    public void readFile() {
        List<ToDoTaskList> outTaskList = dataReader.readFromFile();
        outTaskList.forEach((t) -> {
            taskList.add(t);
        });
    }

}
