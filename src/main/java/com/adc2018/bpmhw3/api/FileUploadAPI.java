package com.adc2018.bpmhw3.api;


import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@Component
@FeignClient(url="${bpm.url}", name = "fileUpload", configuration = FileUploadAPI.FeignMultipartSupportConfig.class)
public interface FileUploadAPI {


    @RequestMapping(method = RequestMethod.POST, value = "/Topic/{id}", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE},
            consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String postFileToTopic(@PathVariable("id") String id, @RequestPart("file") MultipartFile file);

        class FeignMultipartSupportConfig {


            @Bean
            public Encoder multipartFormEncoder() {
                return new SpringFormEncoder();
            }

            @Bean
            public feign.Logger.Level multipartLoggerLevel() {
                return feign.Logger.Level.FULL;
            }
        }

}
