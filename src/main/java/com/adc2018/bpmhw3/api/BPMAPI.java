package com.adc2018.bpmhw3.api;


import com.adc2018.bpmhw3.api.entity.list.UserList;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Component
@FeignClient(url="${bpm.url}", name = "bpm")
public interface BPMAPI {

    @RequestMapping(method = RequestMethod.GET, value = "/User")
    public UserList getAllUser();

}
