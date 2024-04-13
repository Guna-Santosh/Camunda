package com.example.workflow.servicetask;

import org.camunda.bpm.engine.RuntimeService;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceTaskDemo1 implements JavaDelegate
{
	Logger log=LoggerFactory.getLogger(ServiceTaskDemo1.class);
	@Override
	public void execute(DelegateExecution execution) throws Exception 
	{
		log.info("Runnig Service Class in Java");
		execution.setVariable("servicevar", "servicevalue");
		
		log.info(execution.getCurrentActivityId());
	}

}
