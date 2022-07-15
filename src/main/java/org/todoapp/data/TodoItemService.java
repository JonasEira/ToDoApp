package org.todoapp.data;

import org.todoapp.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class TodoItemService implements TodoItemDAO{

    ArrayList<TodoItem> todoItems;

    public TodoItemService() {
        todoItems = new ArrayList<>();
    }

    @Override
    public void persist(TodoItem todo) {
        todoItems.add(todo);
    }

    @Override
    public TodoItem findById(int id) {

        for(TodoItem td : todoItems){
            if(td.getId() == id){
                return td;
            }
        }

        return null;

    }

    @Override
    public Collection<TodoItem> findAll() {
        return todoItems;
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        ArrayList<TodoItem> foundItems = new ArrayList<>();
        for(TodoItem td : todoItems){
            if(td.isDone() == done){
                foundItems.add(td);
            }
        }
        return foundItems;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        ArrayList<TodoItem> foundItems = new ArrayList<>();
        for(TodoItem td : todoItems){
            if(td.getTitle().toLowerCase().contains(title.toLowerCase())){
                foundItems.add(td);
            }
        }
        return foundItems;
    }

    @Override
    public Collection<TodoItem> findByPersonId(int personId) {
        ArrayList<TodoItem> foundItems = new ArrayList<>();
        for(TodoItem td : todoItems){
            if(td.getCreator().getId() == personId){
                foundItems.add(td);
            }
        }
        return foundItems;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate date) {
        ArrayList<TodoItem> foundItems = new ArrayList<>();
        for(TodoItem td : todoItems){
            if(td.getDeadLine().isBefore(date)){
                foundItems.add(td);
            }
        }
        return foundItems;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate date) {
        ArrayList<TodoItem> foundItems = new ArrayList<>();
        for(TodoItem td : todoItems){
            if(td.getDeadLine().isAfter(date)){
                foundItems.add(td);
            }
        }
        return foundItems;
    }

    @Override
    public void remove(int id) {
        int toRemove = -1;
        for (int i = 0; i < todoItems.size(); i++) {
            if(todoItems.get(i).getId() == id);
                toRemove = i;
        }
        if(toRemove > -1){
            todoItems.remove(toRemove);
        }
    }
}
