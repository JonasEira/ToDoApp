package org.todoapp.data;

import org.todoapp.model.AppUser;

import java.util.Collection;

public interface AppUserDAO {
    public void persist(AppUser user);
    public AppUser findByUsername(String userName);
    public Collection<AppUser> findAll();
    public void remove(String userName);
}
