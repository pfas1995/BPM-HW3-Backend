package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.UserCard;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class UserCardList {
    @JsonProperty("Usercard")
    private List<UserCard> usercards;


    public List<UserCard> getUserCards() {
        if(usercards == null) {
            usercards = new ArrayList<>();
        }
        return usercards;
    }

    public void setUserCards(List<UserCard> UserCards) {
        this.usercards = UserCards;
    }


    @Override
    public String toString() {
        return "UserCardList{" +
                "UserCards=" + usercards +
                '}';
    }
}
