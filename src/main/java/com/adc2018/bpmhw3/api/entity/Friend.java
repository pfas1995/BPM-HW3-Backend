package com.adc2018.bpmhw3.api.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Friend {

    private static final String type = "Friend";

    private String id;
    private User user;

    @JsonProperty("usercard")
    private UserCard userCard;
    private Long create_time;


    public static String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserCard getUserCard() {
        return userCard;
    }

    public void setUserCard(UserCard userCard) {
        this.userCard = userCard;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "Friend{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", userCard=" + userCard +
                ", create_time=" + create_time +
                '}';
    }
}
