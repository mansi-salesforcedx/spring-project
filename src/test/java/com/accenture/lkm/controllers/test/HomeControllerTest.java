package com.accenture.lkm.controllers.test;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.controllers.Controller;

public class ControllerTest {

	private static Controller hc = null;
	
	
	@BeforeClass
	public static void setUp() {
		hc = new Controller(); 
	} 
	
	@Test 
	public void test() {
		Controller hc = new Controller();
		ModelAndView mv = hc.();
		assertEquals("View name does not match!", "index", mv.getViewName());
	}

	
	@Test 
	public void testTitle() {
		Controller hc = new Controller();
		ModelAndView mv = hc.();
		assertEquals("Title Missing!", "Accenture" , mv.getModelMap().get("title"));
	}

	
	@Test 
	public void testGreeting() {
		Controller hc = new Controller();
		ModelAndView mv = hc.();
		assertEquals("Greeting Missing!", "Welcome to Orchestrating with Jenkins Training!" , mv.getModelMap().get("greeting"));
	}
	
	@AfterClass
	public static void tearDown() {
		hc = null;
	}
	
}
