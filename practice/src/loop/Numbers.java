package loop;

public class Numbers {

	void amstrong(int n1) {
		//sum of digit(pow=n)=n
		int n2=n1;
		int amst=0;
		while(n1>0) {
			int rem=n1%10;
			int pow=rem*rem*rem;
			amst=amst+pow;
			n1=n1/10;
		}
		if(n2==amst) {
			System.out.println(n2+" is AMSTRONG NUMBER ");
		}
		else {
			System.out.println(n2+" is not a AMSTRONG NUMBER");
		}
	}
	void neon(int n) {
		//sum of square digit=n
		
		int sq=n*n,sq1=sq;
		int sum=0;
		while(sq>0) {
			int rem=sq%10;
			sum=sum+rem;
			sq=sq/10;
		}
		if(sq1==n)
		{
			System.out.println(n+" is a NEON NUMBER");
		}
		else {
			System.out.println(n+" is not a NEON NUMBER");
		}
	}
	void spy_num(int n) {
		//spy(sum of digit=product of digit)
		int sum=0,product=1;
		while(n>0) {
			int rem=n%10;
			sum=sum+rem;
			product=product*rem;
			n=n/10;
		}
		if(sum==product) {
			System.out.println("SPY NUMBER");
		}
		else {
			System.out.println("NOT A SPY NUMBER");
		}
	}
	void square_root(int n)
	{
		int div=2;
		while(div<n) {
			if(n/div==div) {
				System.out.println("square root of "+n+" is "+div);
			    break;
			}
			div=div+1;	
		}
	}
	void smallest_divisor(int n) {
		int div=2;
		while(div<n)
		{
			if(n%div==0) {
				System.out.println("Smallest divisior of "+n+" is "+div);
				break;
			}
			div=div+1;
		}
		
	}
	void perfect_num(int n) {
		int div=1,sum=0;
		while(div<n) {
			if(n%div==0) {
				sum=sum+div;
			}
			div=div+1;
		}
		if(sum==n) {
			System.out.println(n+" is a PERFECT NUMBER");
		}else {
			System.out.println(n+" is NOT A PERFECT NUMBER");
		}
		
	}
	
	public static void main(String[] args) {
		Numbers N = new Numbers();
		N.amstrong(153);
		N.neon(9);
		N.spy_num(132);
		N.square_root(9);
		N.smallest_divisor(15);
		N.perfect_num(6);
	
	}
}
