package com.springboot.amq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
	
	@JmsListener(destination = "local.queue")
	public void consume(String message) {
		System.out.println(" Received Message : "+message);
	}

}
