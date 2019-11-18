package cn._520su;

import org.springframework.stereotype.Component;

import lombok.ToString;

@Component(value = "hahaha")
@ToString
public class IndependentClass {
	
	private Integer i1;
	private String username;
	private String address;

}
