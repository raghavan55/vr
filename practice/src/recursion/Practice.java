package recursion;

public class Practice {
    void reverse(int n) {
    	if(n>0)	
    	{  int rev=n%10;
    		System.out.print(rev);
    	    n=n/10;
    		reverse(n);
    	}
    }
    
    void PrimeNo(int n,int div) {
    	int count=0;
    	if(div<=n) {
    	    if(n%div==0) 
    	    {
			count++;
			}
    	    div++;
    	  PrimeNo(n,div); 
    	}
    	
   
    	
    }
	
	public static void main(String[] args) {
		Practice P=new Practice();
				P.reverse(12345);
                P.PrimeNo(4,2);
	
	}
}
