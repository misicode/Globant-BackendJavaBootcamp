package org.amincia._02JUnit.P104;

public class Task {
    private String description;

    public Task() {}

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        if(description == null) {
            return "Tarea sin descripción";
        }
        return "Tarea: " + description;
    }
}
