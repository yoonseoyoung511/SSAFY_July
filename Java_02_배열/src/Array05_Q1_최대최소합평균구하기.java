
public class Array05_Q1_최대최소합평균구하기 {
	public static void main(String[] args) {
		int[] nums = { 64, 50, 30, 22, 11, 44 };
		
		// 최대값 : 배열 중 아주 작은 값으로 초기화시켜야 함.
		// 배열에 음수 등장할 수 있으니 0으로 초기화해선 안 됨.
		int max = 0; //양수 가정
		int max2 = Integer.MIN_VALUE; //int가 가진 가장 작은 값. -21억 어쩌구
		int max3 = nums[0]; // 그냥 0번째 값으로 설정
		
		for (int i = 0; i < nums.length; i++) {
			//비교구문
			if (max2 < nums[i]) {
				max2 = nums[i];
			}
		}
		System.out.println("최대값 : " + max2);
		
	}
}
