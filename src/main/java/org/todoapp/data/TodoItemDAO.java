package org.todoapp.data;

import org.todoapp.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;

public interface TodoItemDAO {
     void persist(TodoItem todo);
     TodoItem findById(int id);
     Collection<TodoItem> findAll();
     Collection<TodoItem> findAllByDoneStatus(boolean done);
     Collection<TodoItem> findByTitleContains(String title);
     Collection<TodoItem> findByPersonId(int personId);
     Collection<TodoItem> findByDeadlineBefore(LocalDate date);
     Collection<TodoItem> findByDeadlineAfter(LocalDate date);
     void remove(int id);
}
