package com.adc2018.bpmhw3.api.entity;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.stereotype.Component;

@Component
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {

    private static final String type = "user";

    private String id;


    private String user_name;

    @JsonProperty("user_pwd")
    private String user_passwd;
    private String role;

    public static String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_passwd() {
        return user_passwd;
    }

    public void setUser_passwd(String user_passwd) {
        this.user_passwd = user_passwd;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_passwd='" + user_passwd + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
