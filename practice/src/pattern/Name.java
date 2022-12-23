package pattern;

public class Name {
void V() {
for(int row=1;row<=5;row++) 
{
	for(int col=1;col<=9;col++) 
	{
		if(row==col || row+col==10) {
			System.out.print("* ");}
		else {
		    System.out.print(" ");
		}
	}
	System.out.println();
}System.out.println();
}
void E() {
for(int row=1;row<=5;row++) 
{
	for(int col=1;col<=5;col++) 
	{
		if(col==1 ||row==1 ||row==3 ||row==5) {
		    System.out.print("* ");}
		else {
				 System.out.print("  ");
	    }
    }
	System.out.println();
}System.out.println();
}
	
void R() {
for(int row=1;row<=7;row++) 
{
	for(int col=1;col<=5;col++) 
	{
		if(col==1 ||row==1||row==3||(col==5&&row==2)||(col==2&&row==4)||(col==3&&row==5)||(col==4&&row==6)||(col==5&&row==7)){
				 System.out.print("* ");}
		else {
				 System.out.print("  ");
		}
	}
	System.out.println();
}System.out.println();
}
void A() {
for(int row=5;row>=1;row--) 
{
	for(int col=9;col>=1;col--) 
	{
		if(row==col || row+col==10 ||(row==3&&col==4 )||(row==3&&col==5)||(row==3&&col==6)) {
				 System.out.print("*");}
		else {
				 System.out.print(" ");
		}
	}
	System.out.println();
}System.out.println();
}
	
void G() {
for(int row=1;row<=5;row++) 
 {
	for(int col=1;col<=5;col++) 
	{
		if(col==1||row==1||row==5||(row==3 &&col==3)||(row==3&&col==4)||(row==3&&col==5)||(row==4&&col==5)) {
			  System.out.print("* ");}
		else { 
			  System.out.print("  ");
		}
	}
	System.out.println();
}
System.out.println();	
}
void H() {
for(int row=1;row<=5;row++) 
{
    for(int col=1;col<=5;col++) 
	{
	    if(row==3||col==1||col==5) {
			System.out.print("* ");}
		else {
			System.out.print("  ");
		}
	}
	System.out.println();
}System.out.println();     
}
void N() {
for(int row=1;row<=5;row++) 
{
	for(int col=1;col<=5;col++) 
	{
		if(row==col ||col==1||col==5) {
			System.out.print("* ");}
		else {
			System.out.print("  ");
		}
	}
	System.out.println();
}
  System.out.println();  	
}
	public static void main(String[] args) {
		Name n=new Name();
		n.V();
		n.E();
		n.E();
		n.R();
		n.A();
		
		n.R();
		n.A();
		n.G();
		n.H();
		n.A();
		n.V();
		n.A();
		n.N();
		
	}
}
