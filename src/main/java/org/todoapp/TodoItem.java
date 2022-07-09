package org.todoapp;

import java.time.LocalDate;
import java.util.Objects;

public class TodoItem {
    int id;
    Person creator;
    String title;
    LocalDate deadLine;
    String taskDescription;
    boolean done;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }


    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }


    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }


    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue() {
        if (this.deadLine.isAfter(LocalDate.now())) {
            return true;
        } else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "TodoItem{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", deadLine=" + deadLine +
                ", taskDescription='" + taskDescription + '\'' +
                ", done=" + done +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoItem todoItem = (TodoItem) o;
        return id == todoItem.id && done == todoItem.done && Objects.equals(title, todoItem.title) && Objects.equals(deadLine, todoItem.deadLine) && Objects.equals(taskDescription, todoItem.taskDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, deadLine, taskDescription, done);
    }
}
