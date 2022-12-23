package loop;

public class Sample1 {
	void lcm(int n1, int n2) {
		int big = n1 > n2 ? n1 : n2;
		while (true) {
			if (big % n1 == 0 && big % n2 == 0) {
				System.out.println("LCM is " + big);
				break;
			}
			big = big + 1;
		}
	}
	int power(int n,int pow) {
		int result=1;
		while(pow>=1) {
			result=result*n;
			pow=pow-1;
		}
		return result;
	}
	void binary_decimal(int n) {
		int decimal=0,i=0;
		int rem=n%10;
		while(n>0) {
		int value=rem*power(2,i);
		decimal=decimal+value;
		n=n/10;
		i=i+1;
		}System.out.println("decimal value is "+decimal);
	}
	void decimal_binary(int decimal) {
		String binary="";
		while(decimal>0) {
			int rem=decimal%2;
			//binary=binary+rem;
			binary=rem+binary;
			decimal=decimal/2;
		}System.out.println("binary value is "+binary);
	}
	void fibonacci(int f,int s) {
		int t=0;
		while(f<=13) {
			t=f+s;
			System.out.print(f+" ");
			f=s;
			s=t;
		}
		System.out.println();
	}
	void fibonacci2(int f,int s) {
		while(f<=13) {
			
			System.out.print(f+" ");
			s=s+f;
			f=s-f;
		}
	}

	public static void main(String[] args) {
		Sample1 n = new Sample1();
		n.lcm(3, 10);
		n.power(2, 5);
		n.binary_decimal(111);
		n.decimal_binary(7);
		n.fibonacci(0, 1);
		n.fibonacci2(0, 1);
	}
}
