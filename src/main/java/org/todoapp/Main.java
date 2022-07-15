package org.todoapp;

import org.todoapp.data.AppUserService;
import org.todoapp.data.PersonService;
import org.todoapp.model.AppUser;
import org.todoapp.model.Person;
import org.todoapp.model.TodoItem;
import org.todoapp.model.TodoItemTask;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.setFirstName("Jonas");
        p.setLastName("Eira");
        p.setEmail("jonas.eira@gmail.com");

        TodoItem td = new TodoItem();
        td.setCreator(p);
        td.setDeadLine(LocalDate.parse("2022-07-09"));
        td.setDone(true);
        td.setTitle("Interview with company.");
        td.setTaskDescription("Do personality test.");
        TodoItemTask tdTask = new TodoItemTask();
        tdTask.setTodoItem(td);
        AppUser usr = new AppUser();
        usr.setUserName("JonasEira");
        p.setCredentials(usr);
        System.out.println(tdTask);
        System.out.println(p + " " + p.getCredentials());
        AppUserService aus = new AppUserService();
        aus.persist(usr);
        System.out.println(aus.findAll());
        PersonService ps = new PersonService();
        ps.persist(p);
        System.out.println("ps.findAll() = " + ps.findAll());
    }
}