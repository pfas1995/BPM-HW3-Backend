package com.adc2018.bpmhw3.controller;


import com.adc2018.bpmhw3.api.BPMAPI;
import com.adc2018.bpmhw3.api.BPMFileApi;
import com.adc2018.bpmhw3.api.FileUploadAPI;
import com.adc2018.bpmhw3.api.entity.*;
import com.adc2018.bpmhw3.api.entity.list.*;
import com.adc2018.bpmhw3.service.BPMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@RestController
@CrossOrigin
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(MainController.class);

    @Autowired
    BPMService bpmService = null;

    @Autowired
    BPMAPI bpmapi = null;

    @Autowired
    FileUploadAPI fileUploadAPI = null;

    @Autowired
    BPMFileApi bpmFileApi = null;

    /**
     * 依据 id 获取一个用户
     * @param id
     * @return
     */

    @GetMapping("/User/{id}")
    @ResponseBody
    public User getUserById(@PathVariable("id") String id) {
        return bpmapi.getUserById(id);
    }

    /**
     * user 查询
     * @param map
     * @return
     */
    @GetMapping("/User")
    @ResponseBody
    public UserList getUserByQuery(@RequestParam Map<String, Object> map) {
        return bpmapi.getUserByQuery(map);
    }


    /**
     *  put 一个 用户
     * @param id
     * @param user
     * @return
     */
    @PutMapping("/User/{id}")
    @ResponseBody
    public User updateUser(@PathVariable("id") String id, @RequestBody User user) {
        return bpmapi.putUser(id, user);
    }


    /**
     * post 一个 用户
     * @param user
     * @return
     */
    @PostMapping("/User")
    @ResponseBody
    public User postUser(@RequestBody User user) {
        return bpmapi.postUser(user);
    }


    /**
     * 上传图片
     * @param map
     */
    @PostMapping(value = "/Uploadpic/{id}")
    @ResponseBody
    public String test(@PathVariable("id") String id, @RequestParam Map<String, MultipartFile> map) {
        //("file") MultipartFile file
        for(String s: map.keySet()) {
            return fileUploadAPI.postFileToTopic(id, map.get(s));
        }
        return "";

//        return fileUploadAPI.postFileToTopic(id, file);
    }


    /**
     * 获取图片
     * @param id
     * @return
     */
    @GetMapping(value = "/File/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    @ResponseBody
    public byte[] File(@PathVariable("id") String id) {
        return bpmFileApi.getTopicFileById(id);
    }

    @GetMapping(value = "/Friendmap/{id}")
    @ResponseBody
    public FriendMap friendMap(@PathVariable("id") String id) {
        return bpmService.getFriendGraph(id);
    }


    @GetMapping(value = "/Recommend/{id}")
    @ResponseBody
    public RecommendList recommendFriend(@PathVariable("id") String id) {
        return bpmService.recommendFriend(id);
    }


    /**
     * card 查询
     * @param map
     * @return
     */
    @GetMapping("/Card")
    @ResponseBody
    public CardList getCardByQuery(@RequestParam Map<String, Object> map) {
        return bpmapi.queryCard(map);
    }

    /**
     * post 一个 Card
     * @param card
     * @return
     */
    @PostMapping("/Card")
    @ResponseBody
    public Card postCard(@RequestBody Card card) {
        return bpmapi.postCard(card);
    }
    
    /**
     *  put 一个 Card
     * @param id
     * @param card
     * @return
     */
    @PutMapping("/Card/{id}")
    @ResponseBody
    public Card updateCard(@PathVariable("id") String id, @RequestBody Card card) {
        return bpmapi.putCard(id, card);
    }


    /**
     * UserCard 查询
     * @param map
     * @return
     */
    @GetMapping("/Usercard")
    @ResponseBody
    public UserCardList getUserCardByQuery(@RequestParam Map<String, Object> map) {
        return bpmapi.queryUserCard(map);
    }

    /**
     * post 一个 UserCard
     * @param usercard
     * @return
     */
    @PostMapping("/Usercard")
    @ResponseBody
    public UserCard postUsercard(@RequestBody UserCard usercard) {
        return bpmapi.postUserCard(usercard);
    }


    /**
     * post 一个 Topic
     * @param Topic
     * @return
     */
    @PostMapping("/Topic")
    @ResponseBody
    public Topic postTopic(@RequestBody Topic Topic) {
        return bpmapi.postTopic(Topic);
    }


    /**
     * Topic 查询
     * @param map
     * @return
     */
    @GetMapping("/Topic")
    @ResponseBody
    public TopicList getTopicByQuery(@RequestParam Map<String, Object> map) {
        return bpmapi.queryTopic(map);
    }


    /**
     * 依据 id 获取一个Topic
     * @param id
     * @return
     */
    @GetMapping("/Topic/{id}")
    @ResponseBody
    public Topic getTopicById(@PathVariable("id") String id) {
        return bpmapi.getTopicById(id);
    }

    /**
     * Friend 查询
     * @param map
     * @return
     */
    @GetMapping("/Friend")
    @ResponseBody
    public FriendList getFriendByQuery(@RequestParam Map<String, Object> map) {
        return bpmapi.queryFriend(map);
    }   
    
}
