package com.example.workflow.messageprocess;

import java.util.logging.Logger;

import javax.inject.Named;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Named("logger")
public class LoggerDelegate implements JavaDelegate {

	private Logger log=Logger.getLogger(LoggerDelegate.class.getName());
	@Override
	public void execute(DelegateExecution execution) throws Exception {
		log.info("\n\n ...LoggerDelegate invoked by \n"
				+ "\n  ProcessDefinitionId = "+execution.getProcessDefinitionId()
				+ ",\n ActivtyId = "+execution.getCurrentActivityId()
				+ ",\n ActivtyName = "+execution.getCurrentActivityName()
				+ ",\n ProcessInstanceId = "+execution.getProcessInstanceId()
				+ ",\n ProcessBusinessKey = "+execution.getProcessBusinessKey()
				+ ",\n Id = "+execution.getId()
				+ "");
	}
	/*
	  C:\WINDOWS\system32>                          netstat -ano | findstr :8080 
	  TCP 0.0.0.0:8080 0.0.0.0:0  LISTENING 9164
	  TCP [::]:8080 [::]:0 LISTENING 9164
	  
	  C:\WINDOWS\system32>                          taskkill /F /PID 9164 
	  SUCCESS: The process with PID 9164 has been terminated.
	 */
}
