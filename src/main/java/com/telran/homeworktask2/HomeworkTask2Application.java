package com.telran.homeworktask2;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class HomeworkTask2Application {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("scopes.xml");
		Person person = (Person) applicationContext.getBean("personPrototype");
		Person personNext = (Person) applicationContext.getBean("personPrototype");
		Person personNextNext = (Person) applicationContext.getBean("personPrototype");
		Person personNextNextNext = (Person) applicationContext.getBean("personPrototype");
	}
}
