package com.unit.testing.annotation;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.unit.testing.annotation.JunitAnnotation;

public class TestAnnotationRunner {
	
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(JunitAnnotation.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }

}
