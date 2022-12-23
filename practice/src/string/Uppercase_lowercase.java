package string;

public class Uppercase_lowercase {
	void upper_case() {
	   //toUpperCase()method
		String name="raghavan";
		for(int i=0;i<name.length();i++) {
			char ch=name.charAt(i);
			System.out.print((char)(ch-32));
		}System.out.println();
	}
    void lower_case() {
       //toLowerCase() method
    	String name="RAGHAVAN";
    	for(int i=0;i<name.length();i++) {
    		char ch=name.charAt(i);
    		System.out.print((char)(ch+32));
    	}

    }
public static void main(String[] args) {
	Uppercase_lowercase a= new Uppercase_lowercase();
	a.upper_case(); //toUpperCase()method
	a.lower_case(); //toLowerCase() method

	}

}
