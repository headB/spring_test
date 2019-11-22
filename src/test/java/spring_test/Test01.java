package spring_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn._520su.IndependentClass;
import spring_test.ssm.domain.User;
import ssm.mapper.UserMapper;


@RunWith(SpringJUnit4ClassRunner.class)  //杨龙说的,就是,现在需要手动启动容器了. 估计是之前的都是自动加载的缘故,所以没看到什么时候加载了容器.其实感觉就是,重复创建容器,就是new 了多个对象,所以就是浪费了性能,
@ContextConfiguration("classpath:applicationContext.xml")

public class Test01 {
	
	@Autowired
	private Student student;
	@Autowired
	private User user;
	@Autowired
	@Qualifier(value = "hahaha")
	private IndependentClass iClass1;
	//我的记得这个位置是可以预加载 Spring容器的.
	
	
	
	//尝试注入mybatis的连接
	@Autowired
	private SqlSessionFactory ssf1;
	
	//尝试一下霸王硬上弓
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void main2() {
		
//		User s2 = new User();
//		s2.setUsername("lizhixuan is best");
//		s2.setPassword("kumanxuan123!");
//		
//		userMapper.saveUser(s2);
		
		User s2 = new User();
		s2.setId(44);
		s2.setUsername("lizhixuan is best");
		s2.setPassword("kumanxuan123!");
		
		userMapper.saveUser1(s2);
		
		
	}
	
	@Test
	public  void main1() {
		
		System.out.println("this test is for the  user -> "+user);
		
		System.out.println("this test is for the  iClass -> "+iClass1);
		
		System.out.println(student);
		
		System.out.println(ssf1);
		
		List<User> userList = new ArrayList<>();
		
		UserMapper u1 = ssf1.openSession().getMapper(UserMapper.class);
		userList = u1.query("kumanxuan");
		System.out.println(userList);
		
		//Mapper真的可以很方便的啦!>
		List<User> u2 = userMapper.query("tiramisu");
		
		System.out.println(u2);
		
	}

}
