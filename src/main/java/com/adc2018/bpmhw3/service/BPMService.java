package com.adc2018.bpmhw3.service;

import com.adc2018.bpmhw3.api.entity.FriendMap;

public interface BPMService {

    public FriendMap getFriendGraph(String uid);
}
