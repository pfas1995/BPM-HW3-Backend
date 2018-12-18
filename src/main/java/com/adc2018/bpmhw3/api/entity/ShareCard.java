package com.adc2018.bpmhw3.api.entity;

public class ShareCard {

    private static final String TAG = "Sharecard";
    private User to_user;
    private Card cards;


    public static ShareCard Factory(User to_user, Card cards) {
        ShareCard shareCard = new ShareCard();
        shareCard.to_user = to_user;
        shareCard.cards = cards;
        return shareCard;
    }

    public static String getTAG() {
        return TAG;
    }

    public User getTo_user() {
        return to_user;
    }

    public void setTo_user(User to_user) {
        this.to_user = to_user;
    }

    public Card getCards() {
        return cards;
    }

    public void setCards(Card cards) {
        this.cards = cards;
    }
}
