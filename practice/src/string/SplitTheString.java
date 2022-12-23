package string;


public class SplitTheString {

public static void main(String[] args) {
	String name="raghav bharath siva maneesh suguntha";
	String key=" ";
		
	int count=1;
	for(int i=0;i<name.length();i++) {
		if (name.charAt(i)==key.charAt(0)) {
		    count++;
		 }
	}
	String b[]=new String[count];	
	String Temp="";
	int j=0;
	for(int i=0;i<name.length();i++) {
		if(name.charAt(i)==key.charAt(0)) {
		  b[j]=Temp;
		  Temp="";
		  j++;
		  continue;
		  }
	Temp=Temp+name.charAt(i);
	}
	b[j]=Temp;
		
	for (int i=0;i<b.length;i++) {
		System.out.println(b[i]);
	}
		
  }
}
