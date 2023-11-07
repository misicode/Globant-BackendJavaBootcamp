package com.misicode._02JUnit.Exercises.P104;

import java.util.ArrayList;

public class TaskManager {
    /**
     * This method adds tasks to the list.
     * @param tasks     list of tasks
     * @param task      task to add
     */
    public void addTask(ArrayList<Task> tasks, Task task) {
        if(task.getDescription() == null) {
            System.out.println("La tarea debe tener una descripción para ser agregada");
            return;
        }
        tasks.add(task);
    }

    /**
     * This method removes tasks to the list.
     * @param tasks     list of tasks
     * @param task      task to remove
     * @return          whether the task is removed or not
     */
    public boolean removeTask(ArrayList<Task> tasks, Task task) {
        return tasks.remove(task);
    }

    /**
     * This method shows the tasks in the list.
     * @param tasks     list of tasks
     */
    public String listTasks(ArrayList<Task> tasks) {
        StringBuilder list = new StringBuilder();

        if(tasks.isEmpty()) {
            return "La lista de tareas está vacía";
        }

        for(Task task: tasks) {
            list.append(task.toString()).append("\n");
        }

        return list.toString();
    }
}
