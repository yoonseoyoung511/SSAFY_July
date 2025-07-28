import java.util.Scanner;

public class Java_01_기본문법_2016_Lv2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int a = sc.nextInt();

		
		while(a != 0) {
			for (int i = 1; i <= 9; i++) {
				System.out.println(a + " * " + i + " = " + a * i);
			}
				System.out.println("다음 숫자 입력 : ");
				a = sc.nextInt();
			}
		
		if(a == 0) {
			System.out.println("프로그램 종료");
		}

	}
}
