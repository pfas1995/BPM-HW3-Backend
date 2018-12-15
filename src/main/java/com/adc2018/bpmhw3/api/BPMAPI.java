package com.adc2018.bpmhw3.api;


import com.adc2018.bpmhw3.api.entity.Friend;
import com.adc2018.bpmhw3.api.entity.Topic;
import com.adc2018.bpmhw3.api.entity.User;
import com.adc2018.bpmhw3.api.entity.list.FriendList;
import com.adc2018.bpmhw3.api.entity.list.TopicList;
import com.adc2018.bpmhw3.api.entity.list.UserList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 *  api调用实现
 *  url: baseUrl 在 resources 中定义 bpm.url
 *  name: FeignClient 的名称
 */
@Component
@FeignClient(url="${bpm.url}", name = "bpm")
public interface BPMAPI {


    /** User 请求 **/

    /**
     * 依据 ID 获取 user
     * @param id
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/User/{id}")
    public User getUserById(@PathVariable("id") String id);

    /**
     * 查询 user
     * @param qeuryMap
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, value = "/User")
    public UserList getUserByQuery(@RequestParam Map<String, Object> qeuryMap);

    /**
     *  put user
     * @param id
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.PUT, value = "/User/{id}")
    public User putUser(@PathVariable("id") String id, @RequestBody User user);

    /**
     *  post user
     * @param user
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, value = "/User")
    public User postUser(@RequestBody User user);


    /** Topic 请求 **/
    @RequestMapping(method = RequestMethod.GET, value = "/Topic/{id}")
    public Topic getTopicById(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.GET, value = "/Topic")
    public TopicList queryTopic(@RequestParam Map<String, Object> queryMap);

    @RequestMapping(method = RequestMethod.PUT, value = "/Topic/{id}")
    public Topic putTopic(@PathVariable("id") String id, @RequestBody Topic topic);

    @RequestMapping(method = RequestMethod.POST, value = "/Topic")
    public Topic postTopic(@RequestBody Topic topic);

    @RequestMapping(method = RequestMethod.POST, value = "/Topic/{id}")
    public Friend postFileToTopic(@RequestParam("file") MultipartFile file);



    /** friend 请求 **/
    @RequestMapping(method = RequestMethod.GET, value = "/Friend/{id}")
    public Friend getFriendById(@PathVariable("id") String id);

    @RequestMapping(method = RequestMethod.GET, value = "/Friend")
    public FriendList queryFriend(@RequestParam Map<String, Object> queryMap);

    @RequestMapping(method = RequestMethod.PUT, value = "/Friend/{id}")
    public Friend putFriend(@PathVariable("id") String id, @RequestBody Friend Friend);

    @RequestMapping(method = RequestMethod.POST, value = "/Friend")
    public Friend postFriend(@RequestBody Friend Friend);

    
}
