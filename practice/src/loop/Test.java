package loop;

public class Test {
	void print5() {
		for(int n=5;n<100;n+=10) {
			System.out.print(n+" ");
			if(n==45) {
				//print();
				for(int n1=50;n1<60;n1++) {
					System.out.print(n1+" ");
				}
			} 
		}
	}
	void print() {
		for(int n=50;n<60;n++) {
			System.out.print(n+" ");
		}
	}

	public static void main(String[] args) {
		Test t=new Test();
		t.print5();
		
		
		

	}

}
