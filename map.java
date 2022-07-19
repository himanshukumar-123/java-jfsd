import java.util.*;
//import java.lang.Integer;
public class map {

	public static void main(String[] args) {
		// map
		
	//HashMap<Integer,String> tr;
		//Hashmap
		HashMap<Long,String> hm=new HashMap<Long,String>();      
	      hm.put((long)1,"Tim");    
	      hm.put((long)2,"Mary");    
	      hm.put((long)3,"Catie");   
	       
	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Long,String> ht=new Hashtable<Long,String>();  
	      
	      ht.put((long) 4,"Ales");  
	      ht.put((long)5,"Rosy");  
	      ht.put((long)6,"Jack");  
	      ht.put((long)7,"John");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Long,String> map=new TreeMap<Long,String>();    
	      map.put((long)8,"Annie");    
	      map.put((long)9,"Carlotte");    
	      map.put((long)10,"Catie");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

