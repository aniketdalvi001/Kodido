package com.cjc;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
      public static void main(String[] args) {
		
	
	   Map<String,String> m=new HashMap<String, String>();
        m.put("IT","Rahul");
        m.put("Network","Ram");
        m.put("Hardware","Sujit");
        
        Set<String> i=m.keySet();
        System.out.println("Name of Departments");
        System.out.println(i);
        
        for (String string : i) {
		        String val= m.get(string);
		      System.out.println("Employees with their departments");
		        System.out.println(string+"-"+val);
		}
      }	    
}
