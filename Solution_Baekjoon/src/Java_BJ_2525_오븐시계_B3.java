import java.util.Scanner;

public class Java_BJ_2525_오븐시계_B3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int h = sc.nextInt();
	int m = sc.nextInt();
	int c = sc.nextInt(); //cookTime
	
	//m+c이 60보다 작음 -> m += cookTime
	//m+c이 60보다 큼 -> h += cookTime / m , m += cookTime%60
	//h>23 -> h %= 24
	
	if(m+c < 60) {
		m += c;
	} else {
		h += (m+c)/60;
		m = (m+c) % 60;
	}	
	
	if(h > 23) {
		h %= 24;
	}
	
	System.out.printf("%d %d", h, m);
		}
}
