package com.adc2018.bpmhw3.api.entity;

import java.util.*;

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


    public FriendMap friendMap() {
        FriendMap friendMap = new FriendMap();
        Map<User, Set<User>> map = new HashMap<>();
        friendMap.setRoot(user);
        Set<User> set = null;
        for(User u: level1) {
             set = map.getOrDefault(user, new HashSet<>());
             set.add(u);
             map.put(user, set);
             set = map.getOrDefault(u, new HashSet<>());
             set.add(user);
             map.put(u, set);
        }
        for(int i = 0; i < level1.size(); i++) {
            User key = level1.get(i);
            List<User> list = level2.get(i);
            for(User u : list) {
                set = map.getOrDefault(key, new HashSet<>());
                set.add(u);
                map.put(key, set);
                set = map.getOrDefault(u, new HashSet<>());
                set.add(key);
                map.put(u, set);
            }
        }
        friendMap.setMap(map);
        return friendMap;
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
