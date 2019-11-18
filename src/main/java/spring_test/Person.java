package spring_test;


import org.junit.Test;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@Setter
@ToString
public class Person {
	
	private String name;
	private int age;
	
	@Test
	public void test123() {
		System.out.println("six!six!");
	}
	
	
	@Test
	public void test1231() {
		System.out.println("seven!seven!seven!");
	}
	
	@Test
	public void test12311() {
		System.out.println("eight!eight!eight!");
	}

}
