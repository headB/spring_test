package spring_test.ssm.domain;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Component
public class User {

	private int id;
	private String username;
	private String password;
	
}
