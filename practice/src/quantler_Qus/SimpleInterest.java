package quantler_Qus;

import java.util.Scanner;

public class SimpleInterest {
	void cal_SI(double p, double n, double r) {
		double interest = (p * n * r) / 100;
		System.out.println("Interest = " + interest);
	}

	public static void main(String[] args) {
	try (Scanner sc = new Scanner(System.in)) {
		SimpleInterest si = new SimpleInterest();
		System.out.println("enter the principle(p)");
			 double p = sc.nextDouble();

		System.out.println("enter the year(n)");
			 double n = sc.nextDouble();
 
		System.out.println("enter the rate of interest(r)");
			 double r = sc.nextDouble();
		si.cal_SI(p, n, r);
	}
	}

}
