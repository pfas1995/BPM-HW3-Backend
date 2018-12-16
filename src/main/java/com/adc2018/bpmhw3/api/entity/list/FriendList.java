package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.Friend;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class FriendList {

    @JsonProperty("Friend")
    private List<Friend> friends;


    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }


    @Override
    public String toString() {
        return "FriendList{" +
                "friends=" + friends +
                '}';
    }
}
