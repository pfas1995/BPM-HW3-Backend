package com.adc2018.bpmhw3.service.impl;

import com.adc2018.bpmhw3.api.BPMAPI;
import com.adc2018.bpmhw3.api.entity.*;
import com.adc2018.bpmhw3.api.entity.list.FriendList;
import com.adc2018.bpmhw3.api.entity.list.RecommendList;
import com.adc2018.bpmhw3.service.BPMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class BPMServiceImpl implements BPMService {

    private static final Logger logger = LoggerFactory.getLogger(BPMServiceImpl.class);
    @Autowired
    BPMAPI api = null;


    private List<User> friendToUser(List<Friend> friends) {
        List<User> users = new ArrayList<>();
        for(Friend friend : friends) {
            users.add(friend.getUserCard().getUser());
        }
        return users;
    }

    /**
     * 获取用户的关系图，层次为2
     * @param uid
     * @return
     */
    @Override
    public FriendMap getFriendGraph(String uid) {
        FriendGraph friendGraph = new FriendGraph();
        User user = api.getUserById(uid);
        friendGraph.setUser(user);
        List<User> level1 = new ArrayList<>();
        List<List<User>> level2 = new ArrayList<>();

        Map<String, Object> queryMap = new HashMap<>();
        queryMap.put("Friend.user.id", uid);
        FriendList friendList = api.queryFriend(queryMap);
        List<Friend> firstLevel = friendList.getFriends();

        level1 = friendToUser(firstLevel);
        for(User user1 : level1) {
            queryMap.put("Friend.user.id", user1.getId());
            friendList = api.queryFriend(queryMap);
            level2.add(friendToUser(friendList.getFriends()));
        }

        friendGraph.setLevel1(level1);
        friendGraph.setLevel2(level2);
        FriendMap friendMap = friendGraph.friendMap();
        return friendMap;
    }

    @Override
    public RecommendList recommendFriend(String uid) {
        FriendMap friendMap = this.getFriendGraph(uid);
        return friendMap.recommend();
    }
}
