package com.example.workflow.servicetask;

import org.camunda.bpm.engine.RuntimeService;
import org.springframework.stereotype.Service;

@Service
public class MessageStartEvent {

	
	RuntimeService ob;
	public void startEvent() {
		ob.createMessageCorrelation("msg-s-1")
		.setVariable(null, ob)
		.setVariable(null, ob).correlate();
	}
}
