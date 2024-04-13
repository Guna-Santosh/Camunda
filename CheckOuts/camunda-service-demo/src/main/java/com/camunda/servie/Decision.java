//package com.camunda.servie;
//
//import org.camunda.bpm.engine.delegate.DelegateExecution;
//import org.camunda.bpm.engine.delegate.ExecutionListener;
//import org.camunda.bpm.engine.delegate.Expression;
//import org.camunda.bpm.engine.delegate.JavaDelegate;
//
//public class Decision implements JavaDelegate {
//
//	Expression id1;
//	// JavaDelegate
//	@Override
//	public void execute(DelegateExecution execution) throws Exception {
//		String wish = (String) execution.getVariableLocal("id1");
//		System.out.println("====>>>"+ wish);
//		
//	}
//	
//	//ExecutionListener
////	@Override
////	public void notify(DelegateExecution execution) throws Exception {
////		
////		String wish = (String) id1.getValue(execution);
////		System.out.println("====>>>"+ wish);
////	}
//
//}
