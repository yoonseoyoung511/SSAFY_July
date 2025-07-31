
public class Test3 {
	public static void main(String[] args) {
		int[] arr = { 10, 1, 3, 5, 4, 6, 8, 9, 2, 7 }; // 길이 5 이상 50, 0~1000, 값 중복X

		int maxCnt = 0;
		int cnt = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i - 1] > arr[i]) { // 내려감, 연속 증가구간 끝남
				cnt = 1;
			} else { // arr[i-1] < arr[i], 연속 증가구간, cnt++
				cnt++;
			}
			if (maxCnt < cnt) {
				maxCnt = cnt;
			}
		}
		System.out.println(maxCnt);
	}// end of main
}//end of class

