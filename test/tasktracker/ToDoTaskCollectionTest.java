/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasktracker;

import java.util.Date;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tmp-sda-1182
 */
public class ToDoTaskCollectionTest {
    
    public ToDoTaskCollectionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addNewTask method, of class ToDoTaskCollection.
     */
    @Test
    public void testAddNewTask() {
        System.out.println("addNewTask");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.addNewTask();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskList method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetTaskList() {
        System.out.println("getTaskList");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.getTaskList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editTask method, of class ToDoTaskCollection.
     */
    @Test
    public void testEditTask() {
        System.out.println("editTask");
        String searchTaskName = "";
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.editTask(searchTaskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of markAsDone method, of class ToDoTaskCollection.
     */
    @Test
    public void testMarkAsDone() {
        System.out.println("markAsDone");
        String searchTaskName = "";
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.markAsDone(searchTaskName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputTaskName method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetInputTaskName() {
        System.out.println("getInputTaskName");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        String expResult = "";
        String result = instance.getInputTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputProjectName method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetInputProjectName() {
        System.out.println("getInputProjectName");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        String expResult = "";
        String result = instance.getInputProjectName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInputDueDate method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetInputDueDate() {
        System.out.println("getInputDueDate");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        Date expResult = null;
        Date result = instance.getInputDueDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filterByProject method, of class ToDoTaskCollection.
     */
    @Test
    public void testFilterByProject() {
        System.out.println("filterByProject");
        String projectName = "";
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.filterByProject(projectName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of filteredByTaskName method, of class ToDoTaskCollection.
     */
    @Test
    public void testfilteredByTaskName() {
        System.out.println("filteredByTaskName");
        String taskName = "";
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.filteredByTaskName(taskName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCompletedTasks method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetCompletedTasks() {
        System.out.println("getCompletedTasks");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.getCompletedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUnCompletedTasks method, of class ToDoTaskCollection.
     */
    @Test
    public void testGetUnCompletedTasks() {
        System.out.println("getUnCompletedTasks");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.getUnCompletedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberOfCompletedTasks method, of class ToDoTaskCollection.
     */
    @Test
    public void testNumberOfCompletedTasks() {
        System.out.println("numberOfCompletedTasks");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        int expResult = 0;
        int result = instance.numberOfCompletedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of numberOfUnCompletedTasks method, of class ToDoTaskCollection.
     */
    @Test
    public void testNumberOfUnCompletedTasks() {
        System.out.println("numberOfUnCompletedTasks");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        int expResult = 0;
        int result = instance.numberOfUnCompletedTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByDate method, of class ToDoTaskCollection.
     */
    @Test
    public void testSortByDate() {
        System.out.println("sortByDate");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.sortByDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByProject method, of class ToDoTaskCollection.
     */
    @Test
    public void testSortByProject() {
        System.out.println("sortByProject");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.sortByProject();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sortByTaskName method, of class ToDoTaskCollection.
     */
    @Test
    public void testSortByTaskName() {
        System.out.println("sortByTaskName");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        List<ToDoTaskList> expResult = null;
        List<ToDoTaskList> result = instance.sortByTaskName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeTask method, of class ToDoTaskCollection.
     */
    @Test
    public void testRemoveTask() {
        System.out.println("removeTask");
        String input = "";
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.removeTask(input);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of writeFile method, of class ToDoTaskCollection.
     */
    @Test
    public void testWriteFile() {
        System.out.println("writeFile");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.writeFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of readFile method, of class ToDoTaskCollection.
     */
    @Test
    public void testReadFile() {
        System.out.println("readFile");
        ToDoTaskCollection instance = new ToDoTaskCollection();
        instance.readFile();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
