//package com.camunda.servie;
//
//import org.camunda.bpm.engine.RuntimeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//
//import com.camunda.dto.Employee;
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//@Service
//public class serviceTask {
//
//	@Autowired
//	RuntimeService runTimeService;
//	
//	public void startProcess(String msg) {
//		runTimeService.createMessageCorrelation("startRestEvent2")
//        .setVariable("name", msg)
//        .correlate();	
//		System.out.println("success");
//	}
//	
//	
//	public void startProcess2(Employee employee) throws Exception {
//		ObjectMapper obj = new ObjectMapper();
//		String json = obj.writeValueAsString(employee);
//		runTimeService.createMessageCorrelation("startEventObj")
//		.setVariable("name", employee.getEmpName())
//        .setVariable("payLoadJson", json)
//        .correlate();	
//		System.out.println("success");
//	}
//
//}
