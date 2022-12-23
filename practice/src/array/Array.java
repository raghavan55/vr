package array;

public class Array {
void print1() {
	int mark[]= {76,78,80,85,90};
	for(int i=0;i<mark.length;i++)
	{
		System.out.print(mark[i]+" ");
	}System.out.println();
}
void reverse() {
	int mark[]= {76,78,80,85,90};
	for(int i=mark.length-1;i>0;i--)
	{
		System.out.print(mark[i]+" ");
	}System.out.println();
}
void even_index() {
int mark[]= {10,12,13,14,15,16,17,18,19,20};
		   // 0  1  2  3  4  5  6  7  8  9
		   //print index :0 2 4 6 8
for(int i=0;i<mark.length;i+=2) {
	System.out.print(mark[i]+" ");
	}System.out.println();
}
void odd_index() {
int mark[]= {10,12,13,14,15,16,17,18,19,20};
    // 0  1  2  3  4  5  6  7  8  9
    //print index :1 3 5 7 9
for(int i=1;i<mark.length;i+=2) {
System.out.print(mark[i]+" ");
}System.out.println();
}	

void total() {
int []marks= {91,95,96,97,89};
int total=0;
for(int i=0;i<marks.length;i++){
	total=total+marks[i];
}System.out.println("Total marks = "+total);
}
void highest_mark() {
	int []marks= {91,95,96,97,89};
	int highest=0;
	for(int i=0;i<marks.length;i++){
	if(marks[i]>highest) {
		highest=marks[i];
	}
	}
	System.out.println("highest mark = "+highest);	
}

void lowest_mark() {
	int []marks= {91,95,96,97,89};
	int lowest=marks[0];
	for(int i=1;i<marks.length;i++){
	if(marks[i]<lowest) {
		lowest=marks[i];
	}
	}System.out.println("lowest mark ="+lowest);
}
void temperature() {
	int[]temp= {-4,-7,-5,-8,-12};
	int high=Integer.MIN_VALUE;
	int low=Integer.MAX_VALUE;
	for(int i=0;i<temp.length;i++){
		if(temp[i]>high) {
			high=temp[i];
		}
		if(temp[i]<low) {
			low=temp[i];
		}
	}System.out.println("high temperature= "+high);
	System.out.println("lowest temperature="+low);

}
public static void main(String[] args) {
	Array a=new Array();
		  a.print1();
		  a.reverse();
          a.even_index();
		  a.odd_index();
		  a.total();
		  a.highest_mark();
		  a.lowest_mark();
		  a.temperature();
	}

}
