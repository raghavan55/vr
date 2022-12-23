package array;

import java.util.LinkedList;

import packCollection.CollectionDemo;

public class LinkedListdemo {

	public static void main(String[] args) {
		LinkedList al = new LinkedList(); 
		 al.add(10); 
		 al.add(5.5f);
		 al.add(true); 
		 al.add(1234);
		 al.add(10.3); 
		 al.add('c'); 
		 al.add("Siva");
		 Mobiles m1 = new Mobiles("vivo"); 
		 CollectionDemo cd = new CollectionDemo(); 
		 al.add(cd);
		 al.add(m1);
		 //al.add(al);
		 System.out.println(al);
		 LinkedList al2 = new LinkedList(); 
		 System.out.println(al2);
		 al2.add("idli"); 
		 al2.add("dosai");
		 //al2.add(1,"pongal"); 
		 //al2.remove("idli"); 
		 System.out.println(al2);
		 System.out.println(al2.remove(1));
		 System.out.println(al2);
		 //al2.remove("pongal"); 
		 System.out.println(al2);
		 //al2.remove(0);
		 //al2.addAll(1,al); 
		 System.out.println(al2);
		 System.out.println(al2.get(0)); 
		 System.out.println(al2);
		 //al2.clear();
		 //al2.removeAll(al); 
		 //al2.retainAll(al);
		 System.out.println(al2);
		 System.out.println(al2.contains("idli")); 
		 
		 //Object[] o = al2.toArray(); 
		// List al3 = al2.subList(3, 5); 
		// System.out.println(al3);

	}
    
}
