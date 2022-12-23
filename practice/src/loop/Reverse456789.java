package loop;

public class Reverse456789 {
	          //t0:896745
	void rev(int n) {
		int sum=0;
		while(n>0) {
			int rem=n%100;
			sum=sum*100+rem;
			n=n/100;
		}
		System.out.print("reverse value="+sum);
	}

	public static void main(String[] args) {
		Reverse456789 a=new Reverse456789();
		a.rev(456789);
		

	}

}
