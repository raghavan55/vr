package packCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

import array.Mobiles;
import array.MyComparator;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionDemo cd=new CollectionDemo();
	     // cd.learn_list();
		 //cd.learn_LinkedList();
	     //cd.learn_HashSets();
	     // cd.LinkedHashsets();
	     //cd.learn_treeSet();
		 //cd.logicProblem2();
		 //cd.logic_problem3();
		 //cd.logic_problem4();
		 //cd.learn_Map();
		cd.learn_interface();
		
	}	
	private void learn_interface() {
		// TODO Auto-generated method stub
	     ArrayList al = new ArrayList(); 
		 Mobiles m1 = new Mobiles("Vivo",15000);
		 Mobiles m2 = new Mobiles("Oppo",18000);
		 Mobiles m3 = new Mobiles("Apple",45000);
			al.add(m1);
			al.add(m2);
			al.add(m3);
			System.out.println(al);
			MyComparator mc = new MyComparator();
			 Collections.sort(al,mc);
			 System.out.println(al);	
	}
	private void learn_Map() {
		 // TODO Auto-generated method stub
		 HashMap menu = new HashMap();
		 menu.put("Vadai", 10);
		 menu.put("Idli", 20);
		 menu.put("Pongal", 30);
		 menu.put("Dosai", 40);
		 menu.put("Vadai", 8);
		 System.out.println(menu);
		 System.out.println(menu.containsKey("Dosai")); 
		 System.out.println(menu.containsValue(8)); 
		 System.out.println(menu.keySet());
		 System.out.println(menu.values());
		 System.out.println(menu.entrySet());
		 
		 
		}
	private void logic_problem4() {
		 // TODO Auto-generated method stub
		 ArrayList al = new ArrayList(); 
		 al.add("Raja"); 
		 al.add("Rani");
		 al.add(true);
		 al.add(5.4f);
		 al.add(123);
		 al.add('c');
		 al.add(234); 
		 Iterator it = al.iterator(); 
		 boolean present =  it.hasNext(); 
		 while(present==true)
		 {
		  Object o = it.next();
		  if(o.equals(123))
		  {
		   it.remove();
		  }
		  System.out.println(o);
		  present =  it.hasNext(); 
		 }
		 System.out.println(al);
		 /*
		  * for(Object o:al) { try { Integer i = (Integer) o; System.out.println(i); }
		  * catch(ClassCastException cce) {
		  * 
		  * }
		  * 
		  * }
		  */
		 
		}

	private void logic_problem3() {
		 // TODO Auto-generated method stub
		 ArrayList al = new ArrayList(); 
		 al.add(10);
		 al.add(20);
		 al.add(30);
		 al.add(40);
		 al.add(50);
		 
		for(Object o: al)
		{
		 Integer i = (Integer)o; 
		 if(i%20==0)
		 System.out.println(o);
		}
		 
		}

	private void logicProblem2() {
		// TODO Auto-generated method stub
	ArrayList<Integer> marks = new ArrayList<Integer>(); 
	                   marks.add(10); 
		 //marks.add("manikandan");
	Scanner sc = new Scanner(System.in); 
		 System.out.println("Press 'y' to continue");
		 String input = sc.next(); 
		 while(input.equals("y"))
		 {
		  System.out.println("Enter Mark");
		  int mark = sc.nextInt(); 
		      marks.add(mark); 
		     System.out.println("Press 'y' to continue");
		     input = sc.next(); 
		 }
	}
	private void learn_treeSet() {
		// TODO Auto-generated method stub
		TreeSet al = new TreeSet(); 
		 al.add(10); 
		 al.add(5.5f);
		 al.add(true); 
		 al.add(1234);
		 al.add(10.3); 
		 al.add(1234); 
		 al.add('c'); 
		 al.add("Siva");
		 Mobiles m1 = new Mobiles("vivo"); 
		 CollectionDemo cd = new CollectionDemo(); 
		 al.add(cd);
		 al.add(m1);
		 //al.add(al);
		 System.out.println(al);
		 TreeSet al2 = new TreeSet(); 
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
		 //System.out.println(al2.get(0)); 
		 System.out.println(al2);
		 //al2.clear();
		 //al2.removeAll(al); 
		 //al2.retainAll(al);
		 System.out.println(al2);
		 System.out.println(al2.contains("idli")); 
		 
		 //Object[] o = al2.toArray(); 
		 //List al3 = al2.subList(3, 5); 
		 //System.out.println(al3);
	}

	private void LinkedHassets() {
		// TODO Auto-generated method stub
		LinkedHashSet al = new LinkedHashSet(); 
		 al.add(10); 
		 al.add(5.5f);
		 al.add(true); 
		 al.add(1234);
		 al.add(10.3); 
		 al.add(1234); 
		 al.add('c'); 
		 al.add("Siva");
		 Mobiles m1 = new Mobiles("vivo"); 
		 CollectionDemo cd = new CollectionDemo(); 
		 al.add(cd);
		 al.add(m1);
		 //al.add(al);
		 System.out.println(al);
		 LinkedHashSet al2 = new LinkedHashSet(); 
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
		 //System.out.println(al2.get(0)); 
		 System.out.println(al2);
		 //al2.clear();
		 //al2.removeAll(al); 
		 //al2.retainAll(al);
		 System.out.println(al2);
		 System.out.println(al2.contains("idli")); 
		 
		 //Object[] o = al2.toArray(); 
		 //List al3 = al2.subList(3, 5); 
		 //System.out.println(al3);
	}

	private void learn_LinkedList() {
		// TODO Auto-generated method stub
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
		 
		 Object[] o = al2.toArray(); 
		 List al3 = al2.subList(3, 5); 
		 System.out.println(al3);
	}

	private void learn_HashSets() {
		HashSet al = new HashSet(); 
		 al.add(10); 
		 al.add(5.5f);
		 al.add(true); 
		 al.add(1234);
		 al.add(10.3); 
		 al.add('c'); //al.add(1234);
		 al.add("Siva");
		 Mobiles m1 = new Mobiles("vivo"); 
		 CollectionDemo cd = new CollectionDemo(); 
		 al.add(cd);
		 al.add(m1);
		 //al.add(al);
		 System.out.println(al);
		 HashSet al2 = new HashSet(); 
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
		 //System.out.println(al2.get(0)); 
		 System.out.println(al2);
		 //al2.clear();
		 //al2.removeAll(al); 
		 //al2.retainAll(al);
		 System.out.println(al2);
		 System.out.println(al2.contains("idli")); 
		 
		// Object[] o = al2.toArray(); 
		 //List al3 = al2.subList(3, 5); 
		 //System.out.println(al3);
	}
	private void learn_list() {
		// TODO Auto-generated method stub
	ArrayList al=new ArrayList();
		al.add(10);
		al.add(5.5f);
		al.add(1234);
		al.add('c');
		al.add("Siva");
		CollectionDemo cd=new CollectionDemo();
		al.add(cd);
		al.add(al);
		System.out.println(al);
		ArrayList al2=new ArrayList();
		System.out.println(al2);
		al2.add("idli");
		al2.add("biriyani");
		al2.add("parotta");
		al2.add(1,"pongal");
		
		System.out.println(al2);
		//al2.remove("idli"); //or
		//al2.remove(1);//index
		//System.out.println(al2);
		al2.addAll(al);//print with insection order
		
		al.addAll(al2);
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al2.get(3));
		//al2.clear();
		System.out.println(al2);
		//al2.removeAll(al);System.out.println(al2);
		System.out.println(al2.retainAll(al));	
		
		System.out.println(al2.contains("biriyani"));
		//array list ot array only in object array
		Object []o=al2.toArray();
		//System.out.println(al2.size());
		//List al3 =al2.subList(3, 5);
  }
}