package string;
import java.util.Scanner;
public class Palindrome {
	

public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
String name=sc.next();
String rev="";	  
for(int i=name.length()-1;i>=0;i--) {
		 rev=rev+name.charAt(i);
}	   
if(name.equals(rev)) 
	System.out.println("PALINDROME");
else 
	System.out.println("NOT A PALINDROME");
}
}
