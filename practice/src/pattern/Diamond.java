package pattern;

public class Diamond {

	public static void main(String[] args) {
		for(int row=1;row<=5;row++) {
			for(int gap=1;gap<=5-row;gap++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int row=1;row<=5;row++) {
			for(int gap=1;gap<row;gap++) {
				System.out.print(" ");
			}
			for(int col=row;col<=5;col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
