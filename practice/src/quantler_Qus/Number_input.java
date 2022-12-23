package quantler_Qus;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Number_input {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		try (Scanner sc = new Scanner(System.in)) {
			String input;
			int a = 0;
			do {
				input = sc.next();
				try {
					a = Integer.parseInt(input);
					al.add(a);
				} catch (Exception e) {
				}
				;
			} while (input.equals("q") == false);
		}
		TreeSet<Integer> ts = new TreeSet<Integer>(al);
		System.out.println(ts);
	}

}