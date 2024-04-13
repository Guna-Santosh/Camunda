//package com.camunda.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.camunda.dto.Employee;
//import com.camunda.servie.serviceTask;
//
//@RestController
//public class camundaController {
//	
//	@Autowired
//	private serviceTask service;
//	
//	@RequestMapping(value = "/inputValue", method = RequestMethod.POST)
//	public void startProcess(@RequestBody String msg) {
//		System.out.println(msg);
//		service.startProcess(msg);
//	}
//	
//	@RequestMapping(value = "/getconnector/{name}", method = RequestMethod.GET)
//    public String getConnector(@PathVariable String name) {
//		System.out.println(name);
//        return name;
//    }
//	
//	@RequestMapping(value = "/inputValue2", method = RequestMethod.POST)
//	public void startProcess2(@RequestBody Employee employee) throws Exception  {
//		System.out.println(employee);
//		service.startProcess2(employee);
//	}
//	
//	@RequestMapping(value = "/postConnector", method = RequestMethod.POST)
//    public String postConnector(@RequestBody Employee employee) {
//		System.out.println(employee);
//        return "Employee obj posted success";
//    }
//	
//}
