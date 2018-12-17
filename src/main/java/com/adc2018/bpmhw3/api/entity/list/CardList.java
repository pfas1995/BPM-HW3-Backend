package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.Card;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class CardList {
    @JsonProperty("Card")
    private List<Card> cards;


    public List<Card> getCards() {
        if(cards == null) {
            cards = new ArrayList<>();
        }
        return cards;
    }

    public void setCards(List<Card> Cards) {
        this.cards = Cards;
    }


    @Override
    public String toString() {
        return "CardList{" +
                "Cards=" + cards +
                '}';
    }
}
