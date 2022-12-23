package array;

public class Array3 {
void  even_index() {
int a[] = { 2, 30, 12, 40, 25, 65 }; 
// 0  1   2   3   4   5  
int len = a.length/2 ;

int b[] = new int[len];
int j = 0;
for (int i = 0; i < a.length; i +=2) {
b[j] = a[i];
j++;

}
for(j=0;j<b.length;j++) {
System.out.println(b[j] + " ");
 }
}
void add_array() {
int[] a = {1,2,3,4,5,6};
        // 0 1 2 3 4 5 
int[] b = {1,2,3,4}; 
        // 0 1 2 3
int big = a.length>b.length?a.length: b.length;
int small = a.length<b.length?a.length: b.length;
int[] c = new int[big]; 
for(int i=0; i<small; i++){
c[i] = a[i] + b[i]; }

//c[4] = a[4]; c[5] = a[5]; 
for(int i=small; i<big; i++){
c[i] = a[i]; }

for(int i=0; i<c.length; i++)
{
System.out.print(c[i] + " "); 
}
System.out.println();
}

void concordination() {
	int []a= {10,20,30};
    //0  1  2
int []b= {40,50,60,70};
    //0  1  2  3
int c[]=new int[a.length+b.length];
for(int i=0;i<a.length;i++) {
  c[i]=a[i];
 }
 int j=0;
 for(int i=a.length;i<c.length;i++) {
  c[i]=b[j];
  j++;
 }
 for(int i=0;i<c.length;i++) {
  System.out.print(c[i]+ " ");
 }
	
}
void place_no_last_index() {
	int[] ar = {10,20,30,40,50};
//  0   1  2  3  4
int num = 1234; 
int len = ar.length; 
ar[len-1] = num; 
for(int i=0;i<ar.length;i++) {
System.out.println(ar[i]);
}

}

	public static void main(String[] args) {
		Array3 a=new  Array3();
		a.even_index();
		a.add_array();
		a.concordination();
		a.place_no_last_index();
		
	}

}
