package string;

public class CountOfString {
void count_of_no(String name) {
	
int count=0;
for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch>='0' && ch<='9') {
		count++;	
	}
}
System.out.println("number count =:"+count);
}


void count_of_char(String name) {
	
int count=0;
for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch>='a' && ch<='z') {
		count++;	
	}
}
System.out.println("CHARACTER COUNT OF STRING  "+name+" is:"+count);
}

void count_of_spcl_char(String name) {
	
int count=0;
for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if((ch>'a' && ch<='z'&& ch>='0' && ch<='9')) {
		
	}
	else {
		count++;
	}
}
System.out.println("Special character count :"+count);
}



public static void main(String[] args) {
CountOfString N=new CountOfString();
N.count_of_no("veera6758");
N.count_of_char("raghavan3103");
N.count_of_spcl_char("veera00pdkt@gmail.com");
		
	}

}
