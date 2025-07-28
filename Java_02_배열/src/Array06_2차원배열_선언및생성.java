import java.util.Arrays;

public class Array06_2차원배열_선언및생성 {
	public static void main(String[] args) {
		// 선언
		int[][] arr1;
		int[] arr2[];
		int arr3[][];

		// 초기화

		int[][] arr4 = new int[2][3]; // 행 : 2, 열 : 3
		// 1차원 배열 2개, 크기는 각각 3칸
		System.out.println(Arrays.toString(arr4[0]));
		System.out.println(arr4[0][0]);

		// 2차원 배열 출력
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4.length; j++) {
				System.out.println(arr4[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------------");
		for (int[] a : arr4) {
			System.out.println(Arrays.toString(a));
		}
		System.out.println("---------------------");
		System.out.println(Arrays.deepToString(arr4)); //2차원배열 출력 : deepToString

		/////////////////////////////////
		// 1차원 배열의 개수만 지정하고, 크기를 지정하지 않을 수 있다!
		// 배열 개수는 꼭 써야 됨
		int[][] arr5 = new int[5][]; // 크기 지정하지 않았으면 전부 null로 채워져있음
		System.out.println(Arrays.deepToString(arr5));

		arr5[0] = new int[] { 1, 2, 3 };
		System.out.println(Arrays.deepToString(arr5));

		int[][] arr6 = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		System.out.println(Arrays.deepToString(arr6));
		
		int[] arr7 = new int[0]; //가능함. 0 이상 가능. 0도 되는 것.
		System.out.println(Arrays.toString(arr7));
//		근데 이거 왜 써요? -> null 써야되는 경우에 null 대신에 format 맞춰야 되는 경우에 종종 사용.
		
		
		

	}
}
