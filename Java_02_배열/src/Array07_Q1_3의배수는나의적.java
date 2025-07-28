import java.util.Arrays;

public class Array07_Q1_3의배수는나의적 {

	public static void main(String[] args) {

	    int[][] grid = { //[5][5]
	                      {2, 3, 1, 4, 7},
	                      {8, 13, 3, 33, 1},
	                      {7, 4, 5, 80, 12},
	                      {17, 9, 11, 5, 4},
	                      {4, 5, 91, 27, 7}
	    };
	    
	    System.out.println(grid.length + "행"); //5. 세로
	    System.out.println(grid[0].length + "열"); //5. 가로
	    for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if(grid[i][j] % 3 == 0) {
					grid[i][j] = 0;
				} 
				System.out.printf("%2d ", grid[i][j]);
			}			
			System.out.println();
	    }
	    
	}

}
