package com.springboot;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.assignment.AddNumbers;
import com.springboot.services.PaymentServiceImpl;

@SpringBootTest
class ApplicationTests {
	
	@Autowired
	PaymentServiceImpl service;
	
	@Autowired
	AddNumbers addNumbers;
	
	@Test
	public void testDependencyInejction() {
	
		assertNotNull(service.getDao());
	}
	
	@Test
	public void testSum() {
		assertEquals(11, addNumbers.add(5, 6));
	}

}
