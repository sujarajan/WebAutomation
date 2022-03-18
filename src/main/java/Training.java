import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Training {


	public static void main(String[] args) {
		
		
// 		String input="This is Suja This is Gowri This is is This This is is";
// 		
// 		 String[] words = input.split(" ");
//         
//         
//         Map<String,Integer> map = new HashMap<String,Integer>();
//         
//         for (String s: words) {
//        	 
//        	 if(map.containsKey(s)) {
//        		 map.put(s, map.get(s)+1);
//        	 }
//        	 else
//        		 map.put(s, 1);
//         }
//         
//         System.out.println(map);
//         int value =0;
//         String Key="";
//         LinkedHashSet <String> aa=new LinkedHashSet<String>();
//         for(Map.Entry<String, Integer> m:map.entrySet()) {
//        	 
//        	 if(m.getValue()>=value) {
//        		 value=m.getValue();	
//        	 }	 
//         }
//         System.out.println(value);
//         System.out.println("---");
//         for (String s: words) {
//        	 System.out.println(map.get(s));
////	        	 if(map.get(s)==value);
////	        	 System.out.println(map.get(s));
//    	 }	
		
		
		
	//object sorting
		
		Comparator<Student> com=new Comparator<Student>() 
		{

			public int compare(Student o1, Student o2) {
				int i=o1.name.compareTo(o2.name);
					return i;
				
			}
			
			
		};
		
		
		List <Student> lis=new ArrayList<Student>();
		
		Student a= new Student("BKumar", 20);
		Student b= new Student("QKumar", 40);
		Student c= new Student("AKumar", 18);
		Student d= new Student("BKumar", 20);
		
		lis.add(a);
		lis.add(b);
		lis.add(c);
		lis.add(d);
		
		for(Student s:lis) {
			System.out.println(s);
		}
		
		Collections.sort(lis, com);
		
		System.out.println("--------------------------------------");
		
		for(Student s1:lis) {
			System.out.println(s1);
		}
		
		System.out.println(a==b);
if(a.hashCode()==b.hashCode())
			System.out.println(a.equals(b));
else
	System.out.println("Not equals");

System.out.println("======================");
	Set<Student> set=new HashSet<Student>();
	
	set.add(a);
	set.add(b);
	set.add(c);
	set.add(d);
	
	for(Student s:set) {
	
	System.out.println(s);
	
	}
	
	System.out.println("======================");
	List <Integer> l=new ArrayList<Integer>();
	
	l.add(1);
	
	l.add(2);
	l.add(3);
	
	l.add(4);
	l.add(5);
	l.add(6);
	l.add(7);
	l.add(8);
	l.add(9);
	l.add(10);
	l.add(11);
	
	System.out.println(l.size());
	for(Integer i:l) {
		System.out.print(i +" ");
	}
	l.remove(5);
	System.out.println();
	System.out.println(l.size());
	for(Integer i:l) {
		System.out.print(i +" ");
	}
	
	}
         
	
		
	}

		
	
	

