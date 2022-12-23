package string;

public class Vowels {

public static void main(String[] args) {
String name="abinesh";
 int count=0;
 for(int i=0;i<name.length();i++) {
    char ch=name.charAt(i);
	switch(ch) {
	case 'a':
	case 'e':
	case 'i': 
	case 'o':
	case 'u':
	   count++;	    		
	System.out.println("vowels in the name is " + ch);
	}
 }
 System.out.println("count of the String=" +count);
}
}
