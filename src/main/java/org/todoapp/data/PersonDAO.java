package org.todoapp.data;

import org.todoapp.model.Person;

import java.util.Collection;

public interface PersonDAO {
    void persist(Person p);
    Person findById(int id);
    Person findByEmail(String email);
    Collection<Person> findAll();
    void remove(int id);
}
