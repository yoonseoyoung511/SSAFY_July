import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {3,8,1,4,7}; //길이는 5~30, 값 0~1000
		
		System.out.println("회전 전 : " + Arrays.toString(arr));
		
		int temp = arr[4];
//		arr[4] = arr[3];
//		arr[3] = arr[2];
//		arr[2] = arr[1];
//		arr[1] = arr[0];		
//		arr[arr.length-1] = arr[arr.length-2];
//		아예 끄적끄적 위처럼 다 써보고 반복되는 부분만 코드 작성하는게 더 도움됨.
		for (int i = arr.length-1; i >= 1; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = temp;
		System.out.println("회전 후 : " + Arrays.toString(arr));	
		
//		야매 : 첫번째는 그냥 출력, 나머지만 반복
//		System.out.print("회전 후 : ");
//		System.out.print("[" + arr[arr.length-1] + ", ");
//		for (int i = 0; i < arr.length-1; i++) {
//			if(i == arr.length-2) {
//				System.out.print(arr[i]);
//			} else {
//				System.out.print(arr[i]+", ");
//			}
//		}
//		System.out.println("]");
	} //end of main
} //end of class

//ctrl + alt + 위아래 방향키 : 커서행 or 블럭행이 위아래방향으로 복사
