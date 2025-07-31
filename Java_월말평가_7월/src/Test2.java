import java.util.Iterator;

public class Test2 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }; // 3이상 10이하, 0~1000입니다. 값 중복 허용
//	int N = arr.length; //자바에선 이렇게 쓸 필요 없음. 더 빠르진 않음.
		print("전", arr);
		
		int[][] arr2 = new int[arr.length][arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr2[j][arr.length - i - 1] = arr[i][j];
			}
		}
		print("후", arr2);
	} //end of main
	/** 매개변수 arr 2차원 배열 출력 s : 전/후*/
	public static void print(String s, int[][] a) {
		System.out.println("회전 "+s+" 배열");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
