package com.adc2018.bpmhw3.service.impl;

import com.adc2018.bpmhw3.api.BPMAPI;
import com.adc2018.bpmhw3.service.BPMService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BPMServiceImpl implements BPMService {

    private static final Logger logger = LoggerFactory.getLogger(BPMServiceImpl.class);
    @Autowired
    BPMAPI api = null;
}
