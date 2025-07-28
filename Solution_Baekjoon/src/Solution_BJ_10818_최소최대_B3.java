import java.util.Iterator;
import java.util.Scanner;

public class Solution_BJ_10818_최소최대_B3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num = sc.nextInt();
	int[] arr = new int[num];
	for (int i = 0; i < arr.length; i++) {
		arr[i] = sc.nextInt();		
	}
	
	int tmp = Integer.MIN_VALUE;
	int min = 0;
	int max = 0;
	
	for (int i = 0; i < arr.length; i++) {
		if(arr[i] > tmp) {
			max = arr[i];
		}		
	}
	
	System.out.println(max);
	
}
}
