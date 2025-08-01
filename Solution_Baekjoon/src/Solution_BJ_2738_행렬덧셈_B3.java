import java.util.Scanner;

public class Solution_BJ_2738_행렬덧셈_B3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 행렬 크기
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] arr1 = new int[n][m];
		int[][] arr2 = new int[n][m];
		int[][] arrSum = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}

		// 출력
		for (int i = 0; i < n ; i++) {
			for (int j = 0; j < m ; j++) {
				System.out.printf("%d ", arr1[i][j] + arr2[i][j]);
			}
			System.out.println();
		}
	}
}
