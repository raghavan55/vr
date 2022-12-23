package array;
public class AscendingOrder {

	public static void main(String[] args) {
	   int []ar= {10,20,30,40};
       boolean b=true;
        for(int i=0;i<ar.length-1;i++)
        {
			if(ar[i]>ar[i+1]) {
        		b=false;
        		break;
        		
        	}	
        }
        if(b==false) {
        	System.out.println("Not in ascending order");
        }
        else {
        	System.out.println("given array is in ascending order");
        }
        
	}

	

}
