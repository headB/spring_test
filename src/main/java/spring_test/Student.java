package spring_test;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.junit.Test;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Component
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
 public class Student {
	
	private String name;
	private String password;
	private Person person;
	
	@Test
	public void anotherMethod() {
		System.out.println("6677");
	}
	
	
	public void test02() {
		System.out.println("666666666");
	}
	
	
	@Test
	public void say() throws Exception {
		System.out.println("some things just like this!");
		
		//测试反射
		
		Object o1 = Person1.class.newInstance();
		
		
		for ( Method i1 : o1.getClass().getMethods()) {
			System.out.println(i1.getName());
		}
		//看到了,方法的调用的时候,他不会检查o1的数据类型是什么,他会试着强制运行的/
		//然后发现是可以直接运行的!>
		
		//尝试调用这个反射创建出来的对象的方法
		Method m1 = Person1.class.getMethod("test1",String.class);
		
		m1.invoke(o1,"I am the cctv!");
		System.out.println(m1.getName());;
		
	}
	
	@Test
	public void mainTest() {
		String[] str1 = {"asd","zxc","yui"};
		String[][] str2 = {str1,str1};
//		beTest("666",str1,str1,str1);
		System.out.println("cctvb");
		Person1.beTest("bnm","zxcvbnm");
	}
	

}

class Person1{
	
	public void test1(String message) {
		
		System.out.println(message);
		
	}
	
	public static void beTest(String message,String ... object) {
			
		//我发现了,就是当个参数的话,也是转换成为数组的!!!.
		System.out.println(object);
//		System.out.println();
//		for (String strings : object) {
//			System.out.println(strings);
////			for (String strings2 : strings) {
////				System.out.println(strings2);
////			}
//		}
		
	}
	
}