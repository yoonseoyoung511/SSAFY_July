import java.util.Scanner;

public class Solution_BJ_2566_최댓값_B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[][] arr = new int[9][9];

		// 입력
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// 최댓값
		int max = Integer.MIN_VALUE;
		int a = 0;
		int b = 0;

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (arr[i][j] > max) {
					max = arr[i][j];
					a = i + 1;
					b = j + 1;
				}
			}
		}
		System.out.printf("%d\n%d %d", max, a, b);
	}
}
