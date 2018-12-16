package com.adc2018.bpmhw3.api.entity;

import java.util.List;

public class FriendGraph {

    private static final String type = "Friendgraph";

    private User user;

    private List<User> level1;

    private List<List<User>> level2;

    public static String getType() {
        return type;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<User> getLevel1() {
        return level1;
    }

    public void setLevel1(List<User> level1) {
        this.level1 = level1;
    }

    public List<List<User>> getLevel2() {
        return level2;
    }

    public void setLevel2(List<List<User>> level2) {
        this.level2 = level2;
    }

    @Override
    public String toString() {
        return "FriendGraph{" +
                "user=" + user +
                ", level1=" + level1 +
                ", level2=" + level2 +
                '}';
    }
}
