package Test05_객체직렬화;

import java.io.Serializable;

//객체직렬화를 위해서는 ...
public class Person implements Serializable{
	/**
	 * 테스트를 위해서 .. 이론상.
	 */
//	private static final long serialVersionUID = 10000000000L;
	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	
	public Person() {
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
