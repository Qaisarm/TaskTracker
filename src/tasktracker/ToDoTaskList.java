/*
 * This class is the part of the Todo application. To do application is a simple application that
 *allows user to add, remove and a edit a ToDoTaskList. Application receives input via console.
 *
 * This class is provides the ToDoTaskList object that stores information of ToDoTaskList. 
 */
package tasktracker;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author qaisarm
 */
public class ToDoTaskList{

    private String taskList;
    private Date dueDate;
    private String projectName;
    private boolean isDone;

    /**
     * Constructor for class ToDoTaskList
     *
     * @param project- Name of the project that task belongs to
     * @param date - the date object that contain the due date of the task
     */
    public ToDoTaskList(String List, Date date, String project) {

        this.taskList = List;
        this.dueDate = date;
        this.projectName = project;
        this.isDone = false;

    }

    /**
     * Return the <code> Title </code> of the task
     *
     * @return task title
     */
    public String getTaskList() {
        return this.taskList;
    }

    /**
     * Returns the due date
     *
     * @return due date
     */
    public Date getDueDate() {
        return this.dueDate;

    }

    public String getProjectName() {
        return this.projectName;
    }

    public boolean getStatus() {
        return this.isDone;

    }

    /**
     * Sets the new value to the list
     *
     * @param list string list
     */
    public void setList(String list) {
        this.taskList = list;
    }

    /**
     * Sets the new date
     *
     * @param date object date
     */
    public void setDueDate(Date date) {
        this.dueDate = date;
    }

    public void setProjectName(String project) {
        projectName = project;
    }

    public void setStatusDone() {
        this.isDone = true;
    }

    public void setStatusNotDone() {
        this.isDone = false;

    }

    private String printStatus() {
        if (isDone == true) {
            return "Done";
        } else {
            return "InProgress";
        }
    }

    String formatOutputDate() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yyyy");
        String date = simpleDateFormat.format(getDueDate());
        return date;
    }

    @Override
    /**
     * Override the String method, representing the string representation of
     * Task object
     *
     * @return the string representation of Task object
     */
    public String toString() {

        return String.format("%-30s%-30s%-20s%-20s", "Project Name: " + projectName, "Task List: " + taskList, "DueDate: "
                + formatOutputDate(), " Status:  " + printStatus());
    }

}
