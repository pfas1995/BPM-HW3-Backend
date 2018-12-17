package com.adc2018.bpmhw3.controller;


import com.adc2018.bpmhw3.api.BPMAPI;
import com.adc2018.bpmhw3.api.BPMFileApi;
import com.adc2018.bpmhw3.api.entity.FriendMap;
import com.adc2018.bpmhw3.api.entity.User;
import com.adc2018.bpmhw3.api.entity.list.RecommendList;
import com.adc2018.bpmhw3.api.entity.list.UserList;
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
    public User postBody(@RequestBody User user) {
        return bpmapi.postUser(user);
    }


    /**
     * 上传图片
     * @param file
     */
    @PostMapping("/Test/{id}")
    @ResponseBody
    public String test(@PathVariable("id") String id, @RequestParam("file") MultipartFile file) {
        return bpmapi.postFileToTopic(id, file);
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



}
