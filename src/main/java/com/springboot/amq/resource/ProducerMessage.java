package com.springboot.amq.resource;

import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/publish")
public class ProducerMessage {
	
	@Autowired
	public JmsTemplate jmsTemplate;
	
	@Autowired
	Queue queue;
	
	@GetMapping("/{message}")
	public String publish(@PathVariable ("message") String message) {
		jmsTemplate.convertAndSend(queue, message);
		return "Message Published"+message;
	}

}
