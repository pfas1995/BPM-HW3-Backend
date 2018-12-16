package com.adc2018.bpmhw3.api.entity;


public class Topic {
    private static final String type = "topic";


    private String id;
    private String text;
    private String user_id;
    private String create_time;
    private String image;

    public static String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id='" + id + '\'' +
                ", text='" + text + '\'' +
                ", user_id='" + user_id + '\'' +
                ", create_time='" + create_time + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
