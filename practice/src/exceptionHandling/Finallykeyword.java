package exceptionHandling;

public class Finallykeyword {

public static void main(String[] args) {
    int  n=100;
	try{
	    System.out.println(n/0);
	    System.out.println("try block");
    }
    catch(Exception ee){
    	System.out.println("catch");
    }
    finally{
    	System.out.println("finally");
    }
  }
}