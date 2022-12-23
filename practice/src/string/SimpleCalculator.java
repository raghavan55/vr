package string;

import java.util.Scanner;

public class SimpleCalculator {
static double add1(double a, double b) {
	  return a + b;
}
	 
static double sub(double a, double b) {
	  return a - b;
}
 static double mul(double a, double b) {
	  return a * b;
 }
	 
static double div(double a, double b) {
	  return a / b;
 }
	 
public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
     System.out.println("ENTER FIRST NUMBER");
     double a = sc.nextInt();
     System.out.println("ENTER SECOND NUMBER");
     double b = sc.nextInt();

     char d;
     boolean bo = true;
     while (bo) {
         System.out.println("SELECT OPERATION");
         char c = sc.next().charAt(0);
         if (c == '+') {
             a = add1(a, b);
             System.out.println(a);
         }
         if (c == '-') {
             a = sub(a, b);
             System.out.println(a);
         }
         if (c == '*') {
             a = mul(a, b);
             System.out.println(a);
         }
         if (c == '/') {
             a = div(a, b);
             System.out.println(a);
         }
         System.out.println("TO CONTINUE PRESS --Y--");
         System.out.println("TO EXIT PRESS --N--");
         d = sc.next().charAt(0);
         if (d == 'y') {
             System.out.println("ENTER NEXT NUMBER");
             b = sc.nextInt();
             bo = true;
         } else {
             System.out.println("THANK YOU");
             bo = false;
         }
     }
   }
}
