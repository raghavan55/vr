package string;

public class FrequencyOfString {

	public static void main(String[] args) {
		
		 String str = "raghavan";  
	        //int[] freq = new int[str.length()];  
	        
	        //Convert the given string into character array without-toCharArray() 
	        char[] str1 = new char[str.length()];
	        for(int i =0; i <str1.length; i++)
	        {
	            str1[i] = str.charAt(i);
	        }            
	        for(int i = 0; i <str.length(); i++) 
	        {  int freq=1;
	           // freq[i] = 1;  
	            for(int j = i+1; j <str.length(); j++) 
	            {  
	                if(str1[i] == str1[j])
	                {  
	                    //freq[i]++;  
	                      freq++;
	                    //Set str1[j] to 0 to avoid printing visited character  
	                    str1[j] = '*';  
	                }  
	            }
	            if(str1[i]!='*')
	            {
	            	System.out.println(str1[i]+"="+freq);
	            }   
	        }            
	        //Displays the characters and their corresponding frequency  
	        
	       // for(int i = 0; i <freq.length; i++) 
	        //{  
	            //if(str1[i] != ' ' && str1[i] != '0')  
	                //System.out.println(str1[i] + "-" + freq[i]);  
	      //  }  
	}

}
