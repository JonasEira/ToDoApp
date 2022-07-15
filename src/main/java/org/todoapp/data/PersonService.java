package org.todoapp.data;

import org.todoapp.model.Person;
import org.todoapp.sequencers.PersonIdSequencer;

import java.util.Collection;
import java.util.HashMap;

public class PersonService implements PersonDAO {


    private HashMap<Integer, Person> personMap;

    public PersonService() {
        personMap = new HashMap<>();
    }

    @Override
    public void persist(Person p) {
        personMap.put(p.getId(),p);
    }

    @Override
    public Person findById(int id) {
        return personMap.get(id);
    }

    @Override
    public Person findByEmail(String email) {
        for(Person p : personMap.values()){
            if(p.getEmail().equals(email)){
                return p;
            }
        }
        return null;
    }

    @Override
    public Collection<Person> findAll() {
        return personMap.values();
    }

    @Override
    public void remove(int id) {
        personMap.remove(id);
    }
}
