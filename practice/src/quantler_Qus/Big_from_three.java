package quantler_Qus;
import java.util.Scanner;
public class Big_from_three {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter n1");
			int n1=sc.nextInt();
			System.out.println("Enter n2");
			int n2=sc.nextInt();
			System.out.println("Enter n3");
			int n3=sc.nextInt();
			int big=(n1>n2)?(n1 >n3 ? n1:n3):(n2>n3 ? n2 :n3);
			System.out.println("big of three variable = "+big);
		}
	}

}
