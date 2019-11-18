package ssm.mapper;

import java.util.List;

import spring_test.ssm.domain.User;

public interface UserMapper {
	
	
	
	public List<User> query(String username);

}
