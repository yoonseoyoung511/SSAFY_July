//if-else if-else
public class Java05_조건문3 {
	public static void main(String[] args) {

		int score = 97;
		// 90점 이상 A
		// 80점 이상 90점 미만 B
		// 70점 이상 80점 미만 C
		// 그 외 F

		if (score >= 90) {
//			A
		} else {
			if (score >= 80) {
//				B
			} else {
				if (score >= 70) {
//					C
				} else {
//					F
				}
			}
		}

		if (score >= 90) {
//			A
		} else if (score >= 80) {
//				B
		} else if (score >= 70) {
//					C
		} else {
//					F
		}

		{
			int a = 5;
			int b = 3;
			int c = 7;

			// 최솟값을 출력
//		초기값 중요
//		- 비교하려는 값중 하나의 값으로 초기화 (5, 3, 7 중 하나)
//		- 타입의 범위 내에 가장 큰 값으로 초기화
//		int min = Integer.MAX_VALUE;

			int min = Integer.MAX_VALUE; // 최솟값을 저장할 변수
			if (min > a)
				min = a;
			if (min > b)
				min = b;
			if (min > c)
				min = c;

			System.out.println("최솟값은 " + min);
		}

		{
			int a = 5;
			int b = 3;
			int c = 7;

			// 최댓값을 출력
//			초기값 중요
//			- 비교하려는 값중 하나의 값으로 초기화 (5, 3, 7 중 하나)
//			- 타입의 범위 내에 가장 큰 값으로 초기화
//			int min = Integer.MAX_VALUE;

			int max = Integer.MIN_VALUE; // 최솟값을 저장할 변수
			if (max < a)
				max = a;
			if (max < b)
				max = b;
			if (max < c)
				max = c;

			System.out.println("최댓값은 " + max);
		}

//		내 답안
//		if (a < b && a < c) {
//			System.out.println(a);
//		} else if (b < c) {
//			System.out.println(b);
//		} else {
//			System.out.println(c);
//		}

	}
}
