package com.adc2018.bpmhw3.api.entity;

import org.springframework.web.multipart.MultipartFile;

public class File {

    private static final String type = "file";

    private MultipartFile file;


    public static String getType() {
        return type;
    }

    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }
}
