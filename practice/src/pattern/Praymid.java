package pattern;

public class Praymid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int row = 3; row >= 1; row--) {
			for (int gap = row; gap <3; gap++) {
				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print((row*3)+ " ");
			}
			System.out.println();
		}
	}
}
