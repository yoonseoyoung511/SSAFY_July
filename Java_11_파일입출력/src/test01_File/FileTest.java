package test01_File;

import java.io.File;

public class FileTest {
	public static void main(String[] args) {
//	File 클래스 : 파일 & 폴더(디렉토리) 관리하기 위한 클래스
//		new File한다고 해서 만드는 게 아니고, 사용할 수 있게끔 메모리 상에 올려만 놓는다.
		File file = new File("C:\\SSAFY\\workspace-1java\\Java_11_파일입출력\\cat.jpg");

		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());

		System.out.println(file.isAbsolute());
		System.out.println(file.getAbsolutePath()); // 절대 경로를 반환

//		File src = new File("src"); //src를 생성한 것 X. 인스턴스를 생성한 것.
		
		File folder = new File("folder"); //이름이 folder인 디렉토리 생성 X. 사용할 수 있게 메모리 상에 올려만 놓음.
		System.out.println(folder.exists());
		folder.mkdir(); //디렉토리 만들어짐.
		System.out.println(folder.exists());
		
		//파일 생성할수도 있고, 폴더 생성하고 관리할 수도 있다.
	}
}
