package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.ShareCard;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class ShareCardList {

    @JsonProperty("Sharecard")
    List<ShareCard> shareCards;

    public List<ShareCard> getShareCards() {
        if(shareCards == null) {
            shareCards = new ArrayList<>();
        }
        return shareCards;
    }

    public void setShareCards(List<ShareCard> shareCards) {
        this.shareCards = shareCards;
    }

    @Override
    public String toString() {
        return "ShareCardList{" +
                "shareCards=" + shareCards +
                '}';
    }
}
