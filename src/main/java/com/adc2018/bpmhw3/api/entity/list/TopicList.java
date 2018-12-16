package com.adc2018.bpmhw3.api.entity.list;

import com.adc2018.bpmhw3.api.entity.Topic;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class TopicList {

    @JsonProperty("Topic")
    private List<Topic> topics;

    public List<Topic> getTopics() {
        if(topics == null) {
            topics = new ArrayList<>();
        }
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return "TopicList{" +
                "topics=" + topics +
                '}';
    }
}
