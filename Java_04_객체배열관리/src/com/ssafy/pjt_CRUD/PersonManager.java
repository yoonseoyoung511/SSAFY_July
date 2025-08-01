package com.ssafy.pjt_CRUD;

import java.util.Arrays;

//딱 1개만 만들어지도록 -> 싱글턴 패턴 적용하자
public class PersonManager {
	final int MAX_SIZE = 10; //final : 상수 취급. 더이상 변화 없음. (스네이크_케이스 관례)
	int size = 0; //이것의 용도는?
	private Person[] arr = new Person[100];
	
	
	//1번 : 외부에서 생성하지 못하도록 막아야 한다!
	private PersonManager() {
	}
	
	//2번 : 외부에서 생성하지 못하니 내가 생성해서 가지고 있자
	//4번 : 얘네도 미리 메모리에 올려두자! (static 붙이기)
	private static PersonManager manager = new PersonManager();
	
	//3번 : 내가 만든 Manager를 외부에서 쓸 수 있게 해줘잉!! (접근자)
	//3-1번 : 근데 외부에서 인스턴스 만들 수 없음
	// 		-> static 키워드를 통해 미리 메모리에 올리자!
	public static PersonManager getManager() {
		return manager;
	}
	
	//추가 (1:void, 2:성공여부)
	//
	public void addPerson(Person p) {
		//조건을 걸어! 우리의 최대 관리 범위를 넘어가지 않게
		//직접 100이라는 값 보다는..
		if(size < MAX_SIZE ) {
//			arr[size++] = p; //한 줄로도 가능.
			arr[size] = p;
			size++;	
			System.out.println("잘 들어갔어요~");
		} else {
			System.out.println("더 이상 사람을 관리할 수 없다!");
		}			
//		아래로 표현도 가능
//		if(size < MAX_SIZE ) {
//			arr[size++] = p;
//			return;	
//		} else {
//			System.out.println("더 이상 사람을 관리할 수 없다!");
//		}			
	}
	
	//조회(2가지)
	//2-1 전체조회 (심플 굿? -> ㄴㄴ 곤란함. 100개 null값까지 다나옴.)
//	public Person[] getAll() {
//		return arr;
//	}
	public Person[] getAll() {
		Person[] tmp = new Person[size];
		for (int i = 0; i < size; i++) {
			tmp[i] = arr[i];
		}
		return tmp;
		
//		Person[] tmp2 = Arrays.copyOf(arr, size);
//		
//		return tmp2;
	}
	
	//2-2 상세조회(검색!) -> 선택지 2개! 고유한 것 검색 -> 결과는 1개!
//	public Person[]
	public Person search(String name) {
		for(int i = 0 ; i<size ; i++) {
			Person tmp = arr[i];
			if(tmp.getName().equals(name)) {
//			if(name.equals(tmp.getName()) {
				return tmp;
			}			
		}
		return null; //if에 안 걸려서 빨간 줄 드는 거 없애기. 남는 값 처리
	}
	

	
	
	//수정 (잘 수정됐는지 유무 체크)
//	private String name; //고유 식별자로 사용하기로 함

	public boolean update(Person p) {
		for (int i = 0; i < size; i++) {
			if(arr[i].getName().equals(p.getName())) {
				//1번째 방식 갈아끼기
				arr[i] = p;
				
				//2번째 방식 정보만 빼서 수정하기!
//				arr[i].setHungry(p.isHungry());
				return true;
			}			
		}
		return false;
	}
	
	
	//삭제 -> 여러개 삭제 ! / 1개만 삭제할수도 있다
	public void remove(String name) {
	//1. 앞으로 밀착
		
	//2. 순서 중요치 않다면 맨뒤에 친구 잡아다가 빈자리로 쏙
	for(int i = 0; i<size; i++) {
		if (arr[i].getName().equals(name)) {
			arr[i] = arr[--size];
//			size-=1;
	
		}
	}
	System.out.println(Arrays.toString(arr));
	}	
}
