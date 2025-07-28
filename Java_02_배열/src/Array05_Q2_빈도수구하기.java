
import java.util.Arrays;
import java.util.Iterator;

public class Array05_Q2_빈도수구하기 {
	public static void main(String[] args) {
		// 0부터 9까지의 숫자 불러주세요~~
		int[] arr = { 3, 7, 2, 5, 2, 5, 1, 2, 3, 4, 9 };

		int[] cnt = new int[10]; // 0~9까지 총 10개 숫자가 몇번 사용되었는지 카운트할 변수
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			cnt[arr[i]]++;
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] != 0) {
				System.out.println(i + "가 나온 횟수 : " + cnt[i]);
			}

		}

	}
}
