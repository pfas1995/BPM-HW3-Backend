package com.adc2018.bpmhw3.api.entity;

import java.util.Map;
import java.util.Set;

public class FriendMap {

    private User root;
    private Map<User, Set<User>> map;

    public User getRoot() {
        return root;
    }

    public void setRoot(User root) {
        this.root = root;
    }

    public Map<User, Set<User>> getMap() {
        return map;
    }

    public void setMap(Map<User, Set<User>> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "FriendMap{" +
                "root=" + root +
                ", map=" + map +
                '}';
    }
}
