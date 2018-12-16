package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.User;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class UserList {

    @JsonAlias("User")
    @JsonProperty("User")
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
