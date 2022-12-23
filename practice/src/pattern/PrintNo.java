package pattern;

public class PrintNo {
	void print1(int n) {
		for(int col=1;col<=n;col++) {
			System.out.print(col+" ");
			if(col%5==0) {
				System.out.println();
			}
		}System.out.println();
	}
	
	void print2(int n) {
		for(int col=1;col<=10;col+=2) {
			System.out.print(col+" ");
			if(col==9) {
				col=0;
			}
		}System.out.println();
	}
	
	void print3(int n) {
		for(int row=1;row<=n;row++) {
		   for(int col=5;col>=1;col--) {
			    System.out.print(col+" ");
		   }
		   System.out.println();
		}
	}
	void print4(int n) {
		for (int row = 1; row <= n; row++) {

			for (int col = 1; col <= 5; col++) {

				System.out.print(row + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	void print5(int n){
		for (int row =1; row<=5; row++) {
			
			for (int col = 1; col <= 5; col++) {
               
				System.out.print(n + " ");
			}
			n--;
			System.out.println();
		}System.out.println();
	}
	
	void print6(int n) {
		for (int row =1; row<=n; row+=2) {
			
			for (int col = 1; col <= 5; col++) {

				System.out.print(row + " ");
			}
			
			System.out.println();
		}System.out.println();
	}
	void print7() {
		for (int row =5; row>=1; row--) {
		for (int col = 1; col <= row; col++) 
		{
			System.out.print( col+ " ");
		}
		System.out.println();
	}System.out.println();
	}
	void print8() {
		for (int row =1; row<=5; row++) {
			for (int col = 5; col >=row; col--) 
			{
				System.out.print( col+ " ");
			}
			System.out.println();
		}System.out.println();
	}
	void print9() {
		for (int row =1; row<=5; row++) {
			for (int col = 5; col >=row; col--) 
			{
				System.out.print( row+ " ");
			}
			System.out.println();
		}System.out.println();
	}
	void print10() {
		for (int row =5; row>=1; row--) {
			for (int col = 1; col <=row; col++) 
			{
				System.out.print( row+ " ");
			}
			System.out.println();
		}
	}
	void print11()
	{
		for (int row =1; row<=5; row++) {
			for (int col = 1; col <=row; col++) 
			{
				System.out.print( row+ " ");
			}
			System.out.println();
		}System.out.println();
	}
	void print12() {
		for (int row =1; row<=5; row++) {
			for (int col = 1; col <=row; col++) 
			{
				System.out.print( col+ " ");
			}
	
			System.out.println();
		}System.out.println();
	}
	void print13() {
		for (int row =5; row>=1; row--) {
			for (int col =5 ; col >=row; col--) 
			{
				System.out.print( col+ " ");
			}
			System.out.println();
		}System.out.println();
	}
	void print14() {
		for (int row =5; row>=1; row--) {
			for (int col =5 ; col >=row; col--) 
			{
				System.out.print( row+ " ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		PrintNo N=new PrintNo();
		N.print1(15);
		N.print2(10);
		N.print3(3);
		N.print4(3);
		N.print5(5);
		N.print6(9);
		N.print7();
		N.print8();
		N.print9();
		N.print10();
		N.print11();
		N.print12();
		N.print13();
		N.print14();

	}

}
