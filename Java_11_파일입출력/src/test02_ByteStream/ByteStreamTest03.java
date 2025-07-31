package test02_ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamTest03 {
	public static void main(String[] args) {

		// try with resources : 통로가 try문 끝나면 알아서 close() 호출되도
		try (FileInputStream fis = new FileInputStream("cat.jpg");
				FileOutputStream fos = new FileOutputStream("cat-copy3.jpg");) {
			int b; // byte를 담을 손
			byte[] buffer = new byte[100]; // 바구니
			while ((b = fis.read(buffer)) != -1) {
//				System.out.println(b);
				fos.write(buffer, 0, b); // 손보다 바구니로 하는게 실행이 훨 빠름
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일없음 이슈");
		} catch (IOException e) {
			System.out.println("통로 이슈");
		}
	}
}
