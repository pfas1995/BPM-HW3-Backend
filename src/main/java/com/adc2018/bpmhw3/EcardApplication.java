package com.adc2018.bpmhw3;

import com.adc2018.bpmhw3.service.BPMService;
import com.adc2018.bpmhw3.service.impl.BPMServiceImpl;
import com.sun.glass.ui.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableFeignClients("com.adc2018.bpmhw3.api")
public class EcardApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(EcardApplication.class, args);
		BPMService service = ctx.getBean(BPMServiceImpl.class);
		service.getAllUser();
	}

}
