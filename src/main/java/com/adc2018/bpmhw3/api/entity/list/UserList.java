package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.User;
import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.List;

public class UserList {

    @JsonAlias("User")
    private List<User> user;

    public List<User> getUser() {
        return user;
    }

    public void setUser(List<User> user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "UserList{" +
                "user=" + user +
                '}';
    }
}
