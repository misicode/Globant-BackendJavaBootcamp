package org.amincia._02JUnit.P104;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskTest {
    Task task;

    @Test
    @DisplayName("Create task without parameters")
    void createTaskWithoutParams() {
        task = new Task();
        task.setDescription("Tarea de prueba");

        assertEquals("Tarea de prueba", task.getDescription());
    }

    @Test
    @DisplayName("Create task with parameters")
    void createTaskWithParams() {
        task = new Task("Tarea de prueba");

        assertEquals("Tarea de prueba", task.getDescription());
    }

    @Test
    @DisplayName("Show task with description")
    void showTaskWithDescription() {
        task = new Task("Jugar con mi gata");

        assertEquals("Tarea: Jugar con mi gata", task.toString());
    }

    @Test
    @DisplayName("Show task without description")
    void showTaskWithoutDescription() {
        task = new Task();

        assertEquals("Tarea sin descripción", task.toString());
    }
}