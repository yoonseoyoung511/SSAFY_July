import java.util.Scanner;

public class Java_BJ_2480_주사위세개_B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] num = new int[3];
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;
		int tmp = 0;
		int result = 0;

		if (num[0] == num[1] && num[1] == num[2]) {
			result = 10000 + num[0] * 1000;
		} else if (num[0] != num[1] && num[1] != num[2] && num[2] != num[0]) {
			// 다 다름 -> 가장 큰 눈 구하기
			for (int i = 0; i < 3; i++) {
				if (num[i] > max) {
					max = num[i];
				}
			}
			result = max * 100;
		} else {
			//2개 같음 -> 같은 눈 구하기
			if(num[0] == num[1] || num[0] == num[2]) {
				tmp = num[0];
			} else {
				tmp = num[2];
			}
			result = 1000 + tmp * 100;
		}
		System.out.println(result);
	}
}
