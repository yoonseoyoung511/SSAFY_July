import java.util.Scanner;

public class Solution_BJ_25306_영수증_B4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int total = sc.nextInt();
		int num = sc.nextInt();
		int[][] arr = new int[num][2];
		int total_test = 0;

		// 장바구니
		for (int i = 0; i < num; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}

		// test
		for (int i = 0; i < num; i++) {
			total_test += arr[i][0] * arr[i][1];
		}

		if (total == total_test) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}
}
