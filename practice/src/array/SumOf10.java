package array;

public class SumOf10 {
	

public static void main(String[] args) {
        int[]ar= {3,5,-4,8,11,1,-1,6};
        
    	int ar2[]=new int[2];
		for(int i=0;i<ar.length-1;i++) {
			for(int j=i;i<ar.length-1;j++) {
				if(ar[j]+ar[j+1]==10) {
					ar2[0]=ar[j];
					ar2[1]=ar[j+1];
				}
		    }
		}
		for(int k=0;k<ar2.length;k++) {
			System.out.println(ar2[k]);
		}
	}
}
