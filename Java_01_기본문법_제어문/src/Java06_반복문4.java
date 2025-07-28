import java.util.Iterator;

public class Java06_반복문4 {
	public static void main(String[] args) {
		// break : 가장 가까운 반복문 or switch문을 하나만 빠져나간다
		// continue: 가장 가까운 반복문의 다음 차수로 넘어간다

		// 다음은 무슨 의미? (짝수 단만 출력하겠다)
		for (int i = 2; i <= 9; i++) {
			if (i % 2 == 1)
				continue; // 홀수면 그만하고 다음 차수 넘어가서 계속 반복
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
		}

        // 다음은 무슨 의미? (5단까지만 출력하겠다)
        for (int i = 2; i <= 9; i++) {
            if (i > 5)
                break; // 반복문 탈출해서 나가버림
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

        // 다음은 무슨 의미? (각 단의 5번째 줄까지 출력하겠다)
        for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                if (j > 5)
                    break;
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }

        // 다음은 무슨 의미? (2단의 5번째 줄까지 출력하고 멈춤)
        out: for (int i = 2; i <= 9; i++) { //out = 라벨. switch ~ case 할 때 다 라벨붙는거임
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                if (j > 5)
                    break out; // 원래 가장 가까운 반복문 빠져나가는건데, 라벨이 붙은 반복문을 빠져나감.
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
        
        // 다음은 무슨 의미? (각 단의 5번째 줄까지 출력하고 멈춤)
        out: for (int i = 2; i <= 9; i++) {
            System.out.println(i + "단");
            for (int j = 1; j <= 9; j++) {
                if (j > 5)
                   continue out; // out 반복문 다음 차수로 넘어감.
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
        }
        
/*        
       
*        
**        
***
****
*****

*/
       {
	       String s = "*";
	       for (int i = 0; i < 5; i++) {
	    	   for (int j = 0; j < i+1; j++) {
				System.out.print(s);		
			}
			System.out.println();
	       }
       }

       System.out.println("--------------");
/*        
*****
****
***
**
*
*/
       {
	       String s = "*";
	       for (int i = 0; i < 5; i++) {
	    	   for (int j = 5; j > i; j--) {
				System.out.print(s);		
			}
			System.out.println();
	       }
       }
       
       System.out.println("--------------");
       

/*
	*
   **     
  ***      
 ****       
*****
 ****
  ***
   **
    *
*/
       {
	       String s = "*";
	       String n = " ";
	       
	       for (int i = 0; i < 5; i++) {	
	    	   for (int j = 5; j > i; j--) { // 공백 5->1로 줄어들기 반복
					System.out.print(n);					
				}
	    	   for (int k = 0; k < i+1; k++) {	// 별    		  
	    		   System.out.print(s);				
				}
	    	   System.out.println();
	       }   	
	       
	       for (int i = 0; i < 5; i++) {	
	    	   for (int j = 0; j < i+2; j++) { // 공백 5->1로 줄어들기 반복
					System.out.print(n);					
				}
	    	   for (int k = 4; k > i; k--) {	// 별    		  
	    		   System.out.print(s);				
				}
	    	   System.out.println();
	       }
	       
	       
//	       for (int i = 0; i < 5; i++) {
//	    	   for (int j = 0; j < i; j++) {
//				String s1 = args[j];
//				
//			}
//	    	   
//	    	   
//			System.out.println();
//			}
	       
	       
//	       for (int i = 0; i < 5; i++) {		    	       	       	
//	    	   for (int j = 5; j > i; j--) {
//				System.out.print(n);	
//			} 	  
//	    	   for (int k = 0; k < i-j; k++) {
//					System.out.print(s);				
//				}
	       
//	       for (int j = 5; j > i; j--) { // 공백 5->1로 줄어들기 반복
//				System.out.print(n);					
//			}
	    	   	
	    	      
			System.out.println();
	       }
       }
       
       
/*        
a
bc
def
ghij
klmno
     
*/
	
}
