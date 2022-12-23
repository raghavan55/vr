package quantler_Qus;

public class FindAlphabets {

	public static void main(String[] args) {
		String s = "14g837k19m";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				count++;
			}
		}
		System.out.println("count of alphabets= " + count);
	}

}
