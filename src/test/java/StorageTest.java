import Task.Task;
import Utilities.Storage;
import Utilities.TaskList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StorageTest {
    @Test
    public void loadTest() throws Exception {
        ArrayList<Task>testTask = new ArrayList<>();
        testTask.add(new ToDo(" read book"));
        testTask.add(new Event(" party /at 04/07/2019 2359"));

        assertEquals(new TaskList(testTask).printForOutput(),
                new TaskList(new Storage("TestOutput.txt").load()).printForOutput());
    }
}
