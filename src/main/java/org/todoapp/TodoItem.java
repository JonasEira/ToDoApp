package org.todoapp;

import java.time.LocalDate;

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

    public String toString() {
        return "TodoItemTask{" + "id=" + id + ", creator=" + creator + ", title='" + title
                + '\'' + ", deadLine=" + deadLine + ", taskDescription='" + taskDescription
                + '\'' + ", done=" + done
                + '}';
    }

}
