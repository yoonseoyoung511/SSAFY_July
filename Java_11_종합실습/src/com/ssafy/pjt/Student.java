package com.ssafy.pjt;

import java.io.Serializable;

public class Student implements Serializable, Comparable<Student>{
	
	private static final long serialVersionUID = 1L;
	private static int autoIncreasId = 1;
	private int studentID; //고유한 학번! -> 셀프로 등록하게 되면 ... 처리할 일이 조금 늘어날지도?
	private String name;
	private String major;
	private String track;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String major, String track) {
		super(); //Object의 기본생성자 호출
		this.studentID = autoIncreasId++;
		this.name = name;
		this.major = major;
		this.track = track;
	}
	public Student(int studentId, String name, String major, String track) {
		super(); //Object의 기본생성자 호출
		this.studentID = studentId++;
		this.name = name;
		this.major = major;
		this.track = track;
	}
//	설정자와 접근자
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", major=" + major + ", track=" + track + "]";
	}

	@Override
	public int compareTo(Student o) { //나와 얘 정렬
		//-로 해둬ㅕㅆ는데, 음수, 0, 양수일때 기억해놓기
		return this.studentID - o.studentID; //학번으로 정렬
	}
	
	
	
	
}
