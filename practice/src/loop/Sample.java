package loop;

public class Sample {
	void add_n_number(int n) {
		int sum = 0, day = 1;
		while (day <= n) {
			sum = sum + day;
			day = day + 1;
		}
		System.out.println("1.SUM OF n NUMBERS ="+sum);
	}
	void split(int n)
	{
		System.out.println("2.split ");
		while(n>0)
		{
			System.out.println(n%10);
			n=n/10;
		}
	}
	void count_digit(int n)
	{
		int count=0;
		while(n>0)
		{
			//System.out.println(n%10);
			count=count+1;
			n=n/10;
			
		}
		System.out.println("3.COUNT OF DIGIT="+count);
	}
	
	public static void main(String[] args) {
		Sample a = new Sample();
		a.add_n_number(10);
		a.split(1234);
		a.count_digit(54321);

	}

}
