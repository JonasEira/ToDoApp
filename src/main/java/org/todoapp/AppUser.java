package org.todoapp;

import java.util.Objects;

public class AppUser {
    private String userName;
    private String passWord;
    private AppRole role;
    public AppUser(){
        this.setUserName("defaultName");
        this.setPassWord("defaultPassword");
        this.setRole(AppRole.ROLE_APP_USER);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return userName.equals(appUser.userName) && role == appUser.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, role);
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public AppRole getRole() {
        return role;
    }

    public void setRole(AppRole role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "AppUser{" +
                "userName='" + userName + '\'' +
                ", role=" + role +
                '}';
    }
}
