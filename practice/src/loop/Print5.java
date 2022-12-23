package loop;

public class Print5 {

public static void main(String[] args) {
int a = 5;
for (int n = a; n <= 25; n += a) {
    System.out.print(n + " ");
    if (n == 25) {
    n = 0; 
	a--;
	}
  }
 }
}
