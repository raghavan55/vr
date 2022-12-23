package loop;

public class Count {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
		int div = 2;
		int count = 0;
		int small = n1 < n2 ? n1 : n2;
		while (div <= small) {
			if (n1 % div == 0 && n2 % div == 0) {
				System.out.println(div);
				count = count + 1;
			}
			div = div + 1;
		}
		System.out.println(count);

	}

}
