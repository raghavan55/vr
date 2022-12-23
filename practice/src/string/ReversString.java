package string;

public class ReversString {
void reverse(String name) {
	String rev="";
for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	
    }
System.out.println(rev);
	}

public static void main(String[] args) {
	ReversString s=new ReversString();
	String n="raghav";
	s.reverse(n);
	}

}
