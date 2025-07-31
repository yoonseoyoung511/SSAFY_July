package Test03_CharacterStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamTest02 {
public static void main(String[] args) {

	
	//try with resources : 통로가 try문 끝나면 알아서 close() 호출되도
	try(FileReader reader = new FileReader("big_input.txt");
			FileWriter writer = new FileWriter("big_input_copy1.txt");	){
		
		int c; //문자 전달 손
		char[] buffer = new char[100]; //바구니 차례

		while((c=reader.read(buffer)) != -1) {
			System.out.println(c);
			writer.write(buffer,0,c);
		}
		
	} catch(FileNotFoundException e) {
		System.out.println("파일없음 이슈");
	} catch (IOException e) {
		System.out.println("통로 이슈");
	} 
	
	//통로를 닫아야 한다 -> 우리 쪼꼬미는 어차피 기능이 별로 없어서.. 멈춤
}
}
