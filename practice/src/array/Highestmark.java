package array;

public class Highestmark {

	public static void main(String[] args) {
 int[][] a = { { 1, 2 }, 
		       { 3, 4 } }; 
 int[][] b = { { 6, 7 }, 
		       { 8, 9 } };
int result[][] = new int[2][2];
for (int r = 0; r < result.length; r++) 
  {
  for (int c = 0; c < a.length; c++)
  {
	  result[r][c] = a[r][c] + b[r][c];
	  System.out.print(result[r][c] + " ");
  }
	  System.out.println(); } 
  }  
}