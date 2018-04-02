
package tasktracker;

import java.util.Date;
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
public class ToDoTaskListTest {
    
    public ToDoTaskListTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception{
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception{
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getTaskList method, of class ToDoTaskList.
     */
    @Test
    public void testGetTaskList() {
        Date date= new Date();
        ToDoTaskList instance = new ToDoTaskList ("My New Project", date, "project");
        String expResult = "My New Project";
        String result = instance.getTaskList();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getProjectName method, of class ToDoTaskList.
     */
    @Test
    public void testGetProjectName() {
        System.out.println("getProjectName");
        Date date= new Date();
        ToDoTaskList instance = new ToDoTaskList ("", date, "New Project");
        String expResult = "New Project";
        String result = instance.getProjectName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class ToDoTaskList.
     */
    @Test
    public void testGetStatus() {
         Date date= new Date();
        ToDoTaskList instance = new ToDoTaskList ("", date, "");
        boolean expResult = false;
        boolean result = instance.getStatus();
        assertEquals(expResult, result);
    }

}
