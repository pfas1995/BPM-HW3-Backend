package com.adc2018.bpmhw3.api.entity;

public class UserCard {

    private static final String type = "usercard";

    private String id;
    private User user;
    private Card card;
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

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", card=" + card +
                ", create_time=" + create_time +
                '}';
    }
}
