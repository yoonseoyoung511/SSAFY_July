package com.ssafy.pjt;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

//싱글턴패턴으로 수정해보자!
public class StudentManagerImpl implements StudentManager {

	//학생들 목록을 관리하자!
	//1. 배열(고정된 길이)
	//2. 리스트(동적 길이)
	//2-1. ArrayList	: 장/단 (조회에 좋음)
	//2-2. LinkedList	: 장/단 (추가/삭제에 좋음)
	private List<Student> studentList = new ArrayList<>();
	
	private File file = new File("data/student.txt");
	private static final String DELIM = "\t";  //구분자. 탭키
	
	
	//나라도 생성하자. 2
	private static StudentManager manager; // = new StudentManagerImpl(); 위 or 아래에서 생성 다 가능.
	
	//외부에서 생성할 수 없게 됨 1
	private StudentManagerImpl() {
		loadData();
	}
	
	//가져다 쓰세요! 3
	public static StudentManager getManager() {
		if(manager == null) {
			manager = new StudentManagerImpl();
		}		
 		return manager;
	}
	
	@Override
	public boolean add(Student student) {
		//배열이었다면 ...
		//size의 자리에 넣고 size++; 길이를 벗어나지 않았는지 체크
		//100명 정도만 관리할래!
		if(studentList.size() > 100) {
			System.out.println("더이상 기억할 수 없어요!");
			return false;
		}
		////////////////////////////////////
		//추후 고려 포인트 : student 객체는 완벽한가? -> 믿어야 함.
		//유효성 검사 : 모든 필드가 완벽히 작성되어 있는지. 유효한지 체크

		studentList.add(student); //길이 확인하지 않아도 괜찮나? -> 괜찮음.
		return true;
	}

	@Override
	public List<Student> getAll() {
		//배열로 했다면..
		//실제 있는 크기만큼 -> 새로운 배열 생성하고 복사해서 반환!
		return studentList;
	}

	@Override
	public Student getStudent(int studentId) {
		for (int i = 0; i < studentList.size(); i++) {
			Student tmp = studentList.get(i);
			if(tmp.getStudentID() == studentId) {
				return tmp;
			}
		}
		
		for(Student st : studentList) {
			if(st.getStudentID() == studentId)
				return st;
		}
		
		return null;
	}
	//해당 코드는 일치해야만 가져온다
	//
	@Override
	public List<Student> searchName(String name) {
		List<Student> tmp = new ArrayList<>();
		for(Student st : studentList) {
			if(st.getName().equals(name)) {
				tmp.add(st);
			}
		}
//		if(tmp.size() == 0) return null;
		return tmp;
	}

	@Override
	public void update(Student student) throws StudentNotFoundException {
		//student 인스턴스가 가지고 있는 인간을 가지고 와야 한다.
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).getStudentID() == student.getStudentID()) {
				studentList.set(i, student);
				return;
			}
		}
		throw new StudentNotFoundException(student.getStudentID());
	}

	@Override
	public boolean delete(int studentId) {
//		for (int i = 0; i < studentList.size(); i++) {
			//일치하면 지워 ! -> 여러개 지울 때는 거꾸로.
			//하나 지울때 상관없지만, 여러개 지울 때는 거꾸로 도는 경우가 많다
			
		for (int i = studentList.size()-1; i >= 0; i--) {
			if (studentList.get(i).getStudentID() == studentId) {
				studentList.remove(i);
				return true;
			}
		}
		return false;			
	}

	@Override
	public void saveData() {
		//저장을 한다! -> 프로그램에서 파일로 내보내는 것!
		//죄다 문자야 -> Reader써도 될지도? FileReader 가능
		try(BufferedWriter bw = new BufferedWriter (new OutputStreamWriter(new FileOutputStream(file))) ) {
			for(Student st : studentList) {
				bw.write(st.getStudentID()+ DELIM+st.getName() + DELIM + st.getTrack() + DELIM + st.getMajor());
				bw.newLine();
			}
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public void loadData() {
		if(file.exists()) {
			try(BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)));) {
				String line;
				
				while((line = br.readLine()) != null) { //null 아닐때까지 한줄씩 읽겠다
					//라인을 쪼갤건데, 탭키로 구분됨. & 반환타입이 문자열 배열임. ->임시배열 하나 만듦
					String[] tmp = line.split(DELIM);
					if(tmp.length != 4) continue; //이상한 데이터니까 버리자
					int studentId = Integer.parseInt(tmp[0]); //문자열 -> 정수
					String name = tmp[1];
					String track = tmp[2];
					String major = tmp[3];

					studentList.add(new Student(studentId, name,major,track ));
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
	}
	
	//코드 작성할건데! 인터페이스에 없는 코드 막 써도 문제는 없지만, 아쉬움
//	public void save(), load()해도 다른 곳에서 접근할 수가 없음. 
	
	
	
	
}
