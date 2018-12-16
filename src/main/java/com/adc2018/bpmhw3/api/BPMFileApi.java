package com.adc2018.bpmhw3.api;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient(url="${bpm.fileUrl}", name = "bpmFile")
public interface BPMFileApi {

    @RequestMapping(method = RequestMethod.GET, value = "/Topic/{id}", produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getTopicFileById(@PathVariable("id") String id);

}
