package pattern;

public class pattern {
public static void main(String[] args) {	
for (int row =1; row<=7; row++) {
	for(int col=1;col<=7;col++) {
		if(col==row || col+row==8)
		{
			System.out.print("*  ");
		}
		else
		{
			System.out.print("  ");
		}	
	}
   System.out.println();
   }	
  }
}
