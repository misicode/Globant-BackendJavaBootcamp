package JUnit.P104;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class TaskManagerTest {
    ArrayList<Task> tasks;
    Task task;
    TaskManager taskManager;

    @BeforeEach
    void initTaskManagerTest() {
        tasks = new ArrayList<>();
        tasks.add(new Task("Jugar con mi gata"));
        tasks.add(new Task("Limpiar mi cuarto"));
        tasks.add(new Task("Terminar mi proyecto"));
        taskManager = new TaskManager();
    }

    @Test
    @DisplayName("Add a valid task")
    void verifyAddValidTask() {
        int size = tasks.size();

        task = new Task("Ordenar mi escritorio");
        taskManager.addTask(tasks, task);

        assertEquals(size + 1, tasks.size());
        assertEquals(task, tasks.get(tasks.size() - 1));
    }

    @Test
    @DisplayName("Add a invalid task")
    void verifyAddInvalidTask() {
        int size = tasks.size();

        task = new Task();
        taskManager.addTask(tasks, task);

        assertEquals(size, tasks.size());
    }

    @Test
    @DisplayName("Remove a valid task")
    void verifyRemoveValidTask() {
        task = new Task("Ordenar mi escritorio");
        taskManager.addTask(tasks, task);

        int size = tasks.size();
        boolean isRemove = taskManager.removeTask(tasks, task);

        assertEquals(size - 1, tasks.size());
        assertTrue(isRemove);
    }

    @Test
    @DisplayName("Remove a invalid task")
    void verifyRemoveInvalidTask() {
        task = new Task("Ordenar mi escritorio");
        int size = tasks.size();
        boolean isRemove = taskManager.removeTask(tasks, task);

        assertEquals(size, tasks.size());
        assertFalse(isRemove);
    }

    @Test
    @DisplayName("Show the tasks from an list")
    void verifyShowTasks() {
        String taskList = taskManager.listTasks(tasks);

        assertEquals("Tarea: Jugar con mi gata\n" +
                "Tarea: Limpiar mi cuarto\n" +
                "Tarea: Terminar mi proyecto\n", taskList);
    }

    @Test
    @DisplayName("Show the tasks from an empty list")
    void verifyShowTasksEmptyList() {
        tasks = new ArrayList<>();
        String taskList = taskManager.listTasks(tasks);

        assertEquals("La lista de tareas está vacía", taskList);
    }
}