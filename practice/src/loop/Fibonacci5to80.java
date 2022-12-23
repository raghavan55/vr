package loop;

public class Fibonacci5to80 {
	void fib() {
		int num1=-1,num2=1,num3=0;
		
		while(num3<80)	{
			num3=num1+num2;
			if(num3>=5 && num3<=80)
				
			System.out.print(num3+" ");
			num1=num2;
			num2=num3;
	
			}
		
	}
	
public static void main(String[] args) {
	Fibonacci5to80 f=new Fibonacci5to80();
	f.fib();
	

 }
}
