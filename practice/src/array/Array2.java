package array;

public class Array2 {
void LinearSearch(int mark)
{
	int[]marks= {67,80,85,90,55};
	          // 0  1  2  3  4
	boolean present=false;
for(int i=0;i<marks.length;i++) {
	if(mark==marks[i])
	{
		present=true;
		System.out.println("yes found at index "+i);
		break;
	}
}
if(present==false) {
	System.out.println("searched number is not found");
}
}

void duplicate_count(int n) {
int value[]= {10,20,10,30,40,10,50};
	            // 0  1  2  3  4  5  6
int count=0;
for(int i=0;i<value.length;i++) {
if(value[i]==n) {
	count++;
}
	
}
System.out.println(n+" is present "+count+ " times");
		
}

void big2value() {
int []marks= {65,90,73,72};
int big1=Integer.MIN_VALUE;
int big2=Integer.MIN_VALUE;
for(int i=0;i<marks.length;i++)
{
	if(marks[i]>big2) {
		big2=big1;
		big1=marks[i];
	}
	else if(marks[i]>big2) {
		big2=marks[i];
	}
}
System.out.println("biggest two values are "+big1+" and "+big2);
}

void small2value() {
int []marks= {65,90,73,72};
            // 0  1  3  4
int small1=Integer.MAX_VALUE;
int small2=Integer.MAX_VALUE;
for(int i=0;i<marks.length;i++)
{
	if(marks[i]<small2) {
		small2=small1;
		small1=marks[i];
	}
	else if(marks[i]<small2) {
		small2=marks[i];
	}
}
System.out.println("smallest two values are "+small1+" and "+small2);
}
void duplicate_reverse() {
int a[]= {10,20,30,40};
	     //0  1  2  3
int b[]=new int[a.length];
int i=0 ,j=a.length-1;
while(i<a.length) {
	b[i]=a[j];
	i++;
	j--;
}
for(i=0;i<b.length;i++) {
	System.out.print(b[i]+" ");
}System.out.println();
}
void Odd_value() {
int []ar= {10,12,15,17,19,20,21};
         // 0  1  2  3  4  5  6
int total=0,count=0;
for(int i=0;i<ar.length;i++) {
	if(ar[i]%2==1) { 
	total=total+ar[i];
	count++;
	}	
}
System.out.println("TOTAL OF ODD VALUE= "+total);
System.out.println("COUNT OF ODD VALUE= "+count);
}
void copy_oddValues(){
int[] ar = {10,12,15,17,19,20,21}; 
           //0  1  2 3   4  5  6

int count = 0; 
for(int i=0; i<ar.length; i++)
{
if(ar[i]%2==1)
{
count++;
}
}
int[] b = new int[count];
int j = 0; 
for(int i=0; i<ar.length; i++)
{
if(ar[i]%2==1)
{
b[j] = ar[i]; 
j++;
}
} 
for(j=0; j<b.length; j++)
{
 System.out.print(b[j]+ " ");
}System.out.println();
}


void copy_oddIndex() {
	int[] ar = {10,20,30,40,50,60}; 
              // 0  1  2  3  4  5
int len = ar.length/2; 
int[] br=new int[len]; 
int j=0; 
for(int i=1; i<ar.length; i+=2)
{
br[j] = ar[i]; 
j++; 
}
for(j=0; j<br.length; j++)
{ System.out.print(br[j] + " "); 
}
System.out.println();
}

void copy_evenIndex() {
	int[] ar = {10,20,30,40,50,60}; 
             // 0  1  2  3  4  5
int len = ar.length/2; 
int[] br=new int[len]; 
int j=0; 
for(int i=0; i<ar.length; i+=2)
{
br[j] = ar[i]; 
j++; 
}
for(j=0; j<br.length; j++)
{ 
System.out.print(br[j] + " ");
}System.out.println();
} 

int[] left_move(int[] ar) {
	for(int i=0; i<ar.length;i++)
	{
	System.out.print(ar[i] + " "); 
	}
	System.out.println();
	int temp = ar[0];
	for(int i=0; i<ar.length-1;i++)
	{
	ar[i] = ar[i+1]; //ar[0] = 20 
	}
	ar[3] = temp;

	for(int i=0; i<ar.length;i++)
	{
	System.out.print(ar[i] + " "); 
	}
	return ar; //20 30 40 10 
			
}

public static void main(String[] args) {
	Array2 a=new Array2();
	a.LinearSearch(70);
	a.duplicate_count(10);
	a.big2value();
    a.small2value();
    a.duplicate_reverse();
    a.Odd_value();
    a.copy_oddValues();
    a.copy_oddIndex();
    a.copy_evenIndex();
    int[] ar = {10,20,30,40}; 
    int[] br=a.left_move(ar);
}

}
