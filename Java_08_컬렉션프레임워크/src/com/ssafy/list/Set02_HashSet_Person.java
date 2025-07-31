package com.ssafy.list;

import java.util.Set;
import java.util.HashSet;
import java.util.Objects;

class Person {
	String name;
	int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		//이름만 비교
		return this.name.equals(((Person)obj).name);
		
//		//전체 나이까지 비교
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Person other = (Person) obj;
//		return age == other.age && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}	
}



public class Set02_HashSet_Person {
public static void main(String[] args) {
	
	Set<Person> names = new HashSet<>();
	names.add(new Person("강진석", 29));
	names.add(new Person("양띵균", 40));
	names.add(new Person("양명균", 45));
	names.add(new Person("양명균", 45)); //equals해도 양명균 2명 들어감 -> hashcode가 중요.
	//equals랑 hashcode는 같이 와야 함.
	
	for(Person p : names) {
		System.out.println(p);
	}
	
//	번외
//	String str1 = "Hi";
//	String str2 = "Hi";
//	String str3 = new String("Hi"); //1,2는 같은 친구 가리킴, 3은 다른 친구 가리키고 있음!
//	
//	str1.equals(str3);
	
	
	
	
	
}
}
