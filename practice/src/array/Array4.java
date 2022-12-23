package array;

public class Array4 {
	void first_nonrepeate() {
		char name[] = { 'v', 'e', 'e', 'r', 'a' };

		for (int i = 0; i < name.length; i++) {
			char ch = name[i];

			int count = 0;
			for (int j = 0; j < name.length; j++) {
				if (name[j] == ch) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println("first non-repeated char " + "= " + ch);
				break;
			}
		}
	}
void first_repeated() {
	char name[] = { 'd', 'a', 'v', 'i', 'd' };

	for (int i = 0; i < name.length; i++) {
		char ch = name[i];

		int count = 0;
		for (int j = 0; j < name.length; j++) {
			if (name[j] == ch) {
				count++;
			}
		}
		if (count>=2) {
			System.out.println("first repeated char " + "= " + ch);
			break;
		}
	}
}
void sum_of_10() {
	int a[] = { 5, 10, 0, 5, 8, 2, 3 };

	int i = 0;
	for (i = 0; i < a.length; i++) {
		int n = a[i];
		for (int j = i + 1; j < a.length; j++) {
			if (n + a[j] == 10) {
				System.out.println(n + " " + a[j]);
			}
		}
	}System.out.println();
}
void bubble_sorting() {
	int a[] = { 10, 8, 6, 4 };
	for (int i = 1; i < a.length; i++) {
		for (int j = 0; j < a.length - i; j++) {
			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
				
			}

		}
	}
		for (int k = 0; k < a.length; k++) {
			System.out.print(a[k] + " ");
		
	}System.out.println();
}
void binary_search(int key) {
	int a[] = { 5, 8, 9, 12, 15 };
	
	int min = 0;
	int max = a.length - 1;
	while (min<=max){
		int mid = (min + max) / 2;
		if (key == a[mid]) {
			System.out.println(key+" present at " + mid);
			break;
		} 
		else if (key <a[mid]) {
			max = mid - 1;
		}
		else {
				min = mid + 1;
		}
		if(min>max) {
			System.out.println("Given number is not present");
		}
  	}
}
	public static void main(String[] args) {
		Array4 a=new Array4();
		//a.first_nonrepeate();
		//a.first_repeated();
		//a.sum_of_10();
		//a.bubble_sorting();
		a.binary_search(12);
	}

}
