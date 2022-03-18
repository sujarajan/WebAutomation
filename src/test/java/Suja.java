//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.Map;
//import java.util.Scanner;
//
// public class Suja {
// 
// 	public static void main(String[] args) {
// 		
// 		
//  		
//   //------convert array to String----
//  		String[] s= {"Suja", "Test", "Add", "Two"};
//  		String value="";
//  			
//  		for (String i:s)
//  		{
//  			value=value+i;		
//  		}
//  		System.out.println(value);
//  		
//   //----Equals of string
//  		String a="hellO";
//  		String b="HEllO";
//  		System.out.println(a.equalsIgnoreCase(b));
//  		
//  // --------Remove Duplicate characters String "HelloHelloJavaJava"
//  		
//  		String st="HelloHelloJavaJava";
//  		LinkedHashSet<Character> hasset=new LinkedHashSet<Character>();
//  		
//  		for(int i=0;i<st.length();i++) {
//  			hasset.add(st.charAt(i));
//  		}
//  		
//  		for(Character i :hasset) {
//  		System.out.print(i);
//  		}
//  		System.out.println();
//  		
//   ----find duplicates
//  		
//  		String str01="HelloHelloJavaJava";
//  		char[] chararr=str01.toCharArray();
//  		LinkedHashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
//  		for(char c :chararr)
//  		if(map.containsKey(c))
//  		{
//  			map.put(c, map.get(c)+1);
//  		}
//  		
//  		else
//  		{
//  			map.put(c, 1);
//  		}
//  		
//  		System.out.println(map);
//  
//   ----Anagram
//  		
//  		String f = "Army";
//  		 String se = "mary";
//  		 
//  		char[] ch=f.toLowerCase().toCharArray();
//  		char[] ch1=se.toLowerCase().toCharArray();
//  		Arrays.sort(ch);
//  		Arrays.sort(ch1);
//  	if (Arrays.equals(ch, ch1))
//  	{
//  		System.out.println("Yes");}
//  	
//   ---Reverse String
//  	String ne1="Visnu";
//  	int coun=ne1.length();
//  	for(int i=coun-1;i>=0;i--) {
//  		System.out.print(ne1.charAt(i));
//  	}
//  	System.out.println();
//  	
//   ---	Count the occurance of cahracter
//  	String d="Madam";
//  	int count1=0;
//  	char r='a';
//  	for(int i=d.length()-1;i>=0;i--) {
//  		
//  		if(d.charAt(i)==r)
//  			count1++;
//  	}
//  	
//  	System.out.println(count1);
// -- parse int	
//  		String in="1234";
//  		int in1=Integer.parseInt(in);
//  		
//  		System.out.println(in1);
//  		
//   - palindrome
//  		
//  		String pal="Madam";
//  		String pal2="";
//  		int pco=ne1.length();
//  		for(int i=pco-1;i>=0;i--) {
//  			pal2+=pal.charAt(i);
//  		}	
//  		if(pal.equalsIgnoreCase(pal2))
//  		System.out.println("Palindrom");
//		
// --Remove characters in String
//		
//	String rem1="Suganya";
//	String charrem="a";
//	
//			String rem2=rem1.replace(charrem, "");
//			System.out.println(rem2);
//			
//----number of words in String
//			
//			String ab="Hello This is Program New Word";
//			
//			String[] vch=ab.split(" ");
//			
//			System.out.println(vch.length);
//		
//---Reverse words in String
//			for(int i=vch.length-1;i>=0;i--) {
//				System.out.print(vch[i]);
//				System.out.print(" ");
//			}
//			System.out.println();
//
//---Swap 2 Strings
//			String s01="New";
//			String s02="Old";
//			
//			s01=s01+s02;
//			s02=s01.replaceAll(s02, "");
//			s01=s01.replaceAll(s02, "");
//			System.out.println(s01+" "+s02);
//		
//		
//- count duplicate words using hashmap
//			String sm="This is program to count words This is ";
//			String[] smar=sm.split(" ");
//			LinkedHashMap<String,Integer> lmap=new LinkedHashMap<String,Integer>();
//			for(String i : smar) {
//				if(lmap.containsKey(i))
//					lmap.put(i, lmap.get(i)+1);
//				
//			else
//				lmap.put(i,1);
//		
//			}	
//			System.out.println(lmap);
//			
//			System.out.println("-----");
//			
//-Iterate Hashmap
//			Iterator itr=lmap.entrySet().iterator();
//			while(itr.hasNext())
//			System.out.println(itr.next());
//			System.out.println("-----");
//			for(Map.Entry<String, Integer> i : lmap.entrySet()) {
//				
//				System.out.println(i);
//			}
//			
//Prime
//			System.out.println("Enter number");
//			Scanner scanin=new Scanner(System.in);
//			int value1=scanin.nextInt();
//			int count2 = 0;
//			for(int i=2;i<value1/2;i++)
//			{
//				if(value1%i==0)
//				{
//					count2++;
//				}
//			}
//			if(count2==0)
//				System.out.println(value1+ " "+"is a prime number");
//			else
//			System.out.println("Not Prime");
//			
//finbo
//			int h=0;
//			int u=1;
//			System.out.println(h);
//			System.out.println(u);
//			for(int i=0;i<10;i++) {
//				u=h+u;
//				h=u-h;
//				
//				System.out.println(u);
//			}
//		
//Array sorting
//			
//			int[] ar= {1,44,4,6,2,0};
//			int tem=0;
//		for(int i=0;i<ar.length;i++) {
//			for(int j=i+1;j<ar.length;j++) {
//				if(ar[i]>ar[j]) {
//					tem=ar[i];
//					ar[i]=ar[j];
//					ar[j]=tem;
//				}
//			}
//			System.out.println(ar[i]);
//		}
//		
//		
//
//	hacker
//		int n=15;
//		for(int i=1;i<=n;i++){
//	        
//			if(i%3==0 && i%5!=0){
//		        System.out.println("Fizz");
//		    }
//		     if(i%5==0 && i%3!=0){
//		        System.out.println("Buzz");
//		    }
//		     if(i%5==0 && i%3==0){
//		        System.out.println("FizzBuzz");
//		    }
//		     if(i%3!=0 && i%5!=0){
//		        System.out.println(i); 
//		     }
//		
//		
//		}
// 
//  most repeated word in String
// 		
// 		String input="This is Suja This is Gowri This is is This This";
// 		
// 		 String[] words = input.split(" ");
//         
//          adds all words into a map
//          we also check whether the word is already in map!
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
//         String q="";
//         List <String> l=new ArrayList<String>();
//         for(Map.Entry<String, Integer> m:map.entrySet()) {
//        	 
//        	 if(m.getValue()>=value) {
//        		 value=m.getValue();
//        		 q=m.getKey();
//        		
//        	 }	
//         }
//         System.out.println(q); 
//         
//        
//        
//         
//         
//  reverse String and return as String		
// 		
// 		
//      String ne1="Visnu";
//      char c;
//      String s = "";
//   	int coun=ne1.length();
//   	for(int i=coun-1;i>=0;i--) {
//   		c =ne1.charAt(i);
//   		s=s+c;	
//   	}
//   	System.out.println(s);
//   	
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
// 		
//	}
//}
