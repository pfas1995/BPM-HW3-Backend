package com.adc2018.bpmhw3.api.entity;

public class Recommend {

    private User user;
    private Integer friendNum;


    public static Recommend Factory(User user, Integer friendNum) {
        Recommend recommend = new Recommend();
        recommend.user = user;
        recommend.friendNum = friendNum;
        return recommend;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getFriendNum() {
        return friendNum;
    }

    public void setFriendNum(Integer friendNum) {
        this.friendNum = friendNum;
    }

    @Override
    public String toString() {
        return "Recommend{" +
                "user=" + user +
                ", friendNum=" + friendNum +
                '}';
    }
}
