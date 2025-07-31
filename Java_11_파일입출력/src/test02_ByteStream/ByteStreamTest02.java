package test02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest02 {
	public static void main(String[] args) {

		// try with resources : 통로가 try문 끝나면 알아서 close() 호출되도록
		try (FileInputStream fis = new FileInputStream("cat.jpg");
				FileOutputStream fos = new FileOutputStream("cat-copy2.jpg");) {
			int b; // byte를 담을 손
			while ((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 이슈");
		} catch (IOException e) {
			System.out.println("통로 이슈");
		}
	}
}
