import java.util.Arrays;

public class Array01_배열의선언및생성 {

	public static void main(String[] args) {
		// 배열을 선언
		int[] arr1; // 권장
		int arr2[]; // 비권장

		// 배열을 초기화
		int[] arr3 = new int[10];
		String[] arr4 = new String[5];
		
		System.out.println(Arrays.toString(arr3)); // 배열에 있는 내용 출력. int는 0으로 초기화
		System.out.println(Arrays.toString(arr4)); // String은 null로 초기화
		// . : "가지고 있는" 의미
		
		// 길이를 직접 명시할 수 없음!
		int[] arr5 = new int[] {1,2,3,4,5};
		System.out.println(Arrays.toString(arr5));
		
		
		String[] arr6 = {"손지민", "신윤수", "유현진"}; //선언과 동시에 이루어질 때만 가능!
		System.out.println(Arrays.toString(arr6));
		
		arr6 = new String[] {"권인범", "우수연", "김민재"};
//		arr7 = {"이", "안", "박"}; // 재할당 불가능
		
		//음수 인덱스 안 됩니다!
//		System.out.println(arr6[10]); //java.lang.ArrayIndexOutOfBoundsException 발생
		
		
	}

}
