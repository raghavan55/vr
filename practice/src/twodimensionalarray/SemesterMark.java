package twodimensionalarray;
import java.util.Scanner;
public class SemesterMark {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int [][]sem=new int[6][];
		    int sub=6;
		    float percent=0;
		    int highest=0;
		    int[]mark=new int[sub];
		    
		    
		    for(int r=0;r<sem.length;r++) {
		     
		    for(int c=0;c<mark.length;c++) {
		      System.out.println("marks of sub"+(c+1));
		      mark[c]=sc.nextInt();
		      
		      percent=percent+mark[c]/sub;
		      if(mark[c]>highest) {
		       highest=mark[c];
		      }
		      
		     }
		     System.out.println("percentage of sem "+(r+1)+"= "+percent);
		     System.out.println("highest mark ="+highest);
		    }	 

	   
	}

}
