package com.adc2018.bpmhw3.api.entity;

import java.util.Set;

public class UserMap {

    private User user;
    private Set<User> friends;

    public static UserMap Factory(User user, Set<User> friends) {
        UserMap userMap = new UserMap();
        userMap.user = user;
        userMap.friends = friends;
        return userMap;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<User> getFriends() {
        return friends;
    }

    public void setFriends(Set<User> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "UserMap{" +
                "user=" + user +
                ", friends=" + friends +
                '}';
    }
}
