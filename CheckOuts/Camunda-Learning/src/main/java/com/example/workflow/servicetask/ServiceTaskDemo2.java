package com.example.workflow.servicetask;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import camundafeel.javax.el.Expression;

public class ServiceTaskDemo2 implements ExecutionListener {

	Logger logob=LoggerFactory.getLogger(ServiceTaskDemo2.class);
	Expression inj1;
	 
	@Override
	public void notify(DelegateExecution execution) throws Exception 
	{

	}

}
