package org.todoapp.dao;

import org.todoapp.model.AppUser;

import java.util.Collection;
import java.util.HashMap;

public class AppUserService implements AppUserDAO{

    private final HashMap<String, AppUser> userMap;

    public AppUserService() {
        userMap = new HashMap<String, AppUser>();
    }

    @Override
    public void persist(AppUser user) {
        userMap.put(user.getUserName(), user);
    }

    @Override
    public AppUser findByUsername(String userName) {
        return userMap.get(userName);
    }

    @Override
    public Collection<AppUser> findAll() {
        return (Collection<AppUser>) userMap;
    }

    @Override
    public void remove(String userName) {
        userMap.remove(userName);
    }
}
