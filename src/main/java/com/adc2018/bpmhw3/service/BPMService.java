package com.adc2018.bpmhw3.service;

import com.adc2018.bpmhw3.api.entity.FriendMap;
import com.adc2018.bpmhw3.api.entity.list.RecommendList;

public interface BPMService {

    public FriendMap getFriendGraph(String uid);

    public RecommendList recommendFriend(String uid);
}
