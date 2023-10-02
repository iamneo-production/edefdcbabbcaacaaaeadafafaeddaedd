package com.examly.springapp.ioc;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@AutoConfigureMockMvc
class ApplicationTests {

	@Autowired
	private  MockMvc mockMvc ;

	@Test
	void test_case1 () {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Get bean by name
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
        // Assert that the bean is not null
        assertNotNull(obj);
	}

	@Test
	void test_case2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // Get bean by name
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

		assertEquals("Hello World!",obj.getMessage());
		
	}
}










