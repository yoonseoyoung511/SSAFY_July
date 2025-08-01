

public class Array07_Q2_가장시끄러운자리는 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
        	{2,3,1,4},
        	{8,13,3,33},
        	{7,4,5,80},
        	{17,9,11,5}
        };
        
        int max = Integer.MIN_VALUE; //최댓값 초기화 방법 1. min_value

        for (int i = 0; i < arr.length; i++) { //4. 세로
			for (int j = 0; j < arr[i].length; j++) { //4. 가로
				int sum = arr[i][j]; //내꺼 + 상하좌우의 합
				if(i-1 >= 0)				sum += arr[i-1][j]; //상
				if(i+1 < arr.length)		sum += arr[i+1][j]; //하
				if(j-1 >= 0)				sum += arr[i][j-1]; //좌
				if(j+1 < arr[i].length)		sum += arr[i][j+1]; //우
				
				System.out.printf("%3d ", sum);

				// 최댓값 구하기
				if (max < sum) {
					max = sum;
				}
			}
			System.out.println();			
		}
        
        System.out.println("최대소음 : " + max);
	}
}
