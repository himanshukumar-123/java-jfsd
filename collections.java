import java.util.*;
import java.util.Vector;

public class collections {

	public static void main(String[] args) {
		//creating arraylist
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");//
	      city.add("Delhi");    	   
	      System.out.println(city);  
	      
	      Vector<Integer> in = new Vector<>();  
	        //Add elements in the vector  
	        in.add(100);  
	        in.add(200);  
	        in.add(300);  
	        in.add(200);  
	        in.add(400);  
	        in.add(500);  
	        in.add(600);  
	        in.add(700);
		
		//creating vector
	    /*  System.out.println("\n");
	      System.out.println("Vector");
	      Vector<int> vec = new Vector<>();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);*/
		
		//creating linkedlist
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(103);  
	       set.add(102);
	       set.add(104);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(11);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);	       
	       System.out.println(set2);
	      	} 
	      }  
	}

