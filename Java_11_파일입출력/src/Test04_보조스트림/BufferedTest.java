package Test04_보조스트림;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedTest {
	public static void main(String[] args) {
		method1();
		method2();
	}

	// 그냥 (입출력)
	public static void method1() {
		try (FileReader reader = new FileReader("big_input.txt");
				FileWriter writer = new FileWriter("big_input_copy3.txt");) {

			long start = System.nanoTime();
			int c; // 문자 전달 손

			while ((c = reader.read()) != -1) {
				System.out.println(c);
				writer.write(c);
			}
			
			long end = System.nanoTime();
			System.out.println("노드스트림만 : " +(end-start));
			
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 이슈");
		} catch (IOException e) {
			System.out.println("통로 이슈");
		}
	}

	// 보조 (입출력)
	public static void method2() {
		// chaining. reader에다가 buffer 붙여서 나간다~
		try (BufferedReader br = new BufferedReader(new FileReader("big_input.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("big_input_copy4.txt"));
				){
			long start = System.nanoTime();
			String line;
			while ((line = br.readLine()) != null) { //한줄 읽었는데 null이 아닐 때
				bw.write(line);
				bw.newLine(); //줄바꿈
			}
			long end = System.nanoTime();
			System.out.println("보조스트림 추가 : " +(end-start));
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 이슈");
		} catch (IOException e) {
			System.out.println("통로 이슈");
		}
	}

}
