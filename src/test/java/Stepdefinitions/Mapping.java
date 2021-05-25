package Stepdefinitions;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String[] str= {"a","b","c","d"};
		 
         wordCount(str);
		
		
}


public static void  wordCount(String[] strings) {
	   
	  Map<String, Integer> map = new HashMap<String, Integer>();
	   
	  for (int i = 0; i < strings.length; i++) {
	     
	    String tmp = strings[i];
	     
	    if (map.containsKey(tmp)) {
	      int count = map.get(tmp);
	      map.put(tmp, count + 1);
	    } else {
	      map.put(tmp, 1);
	    }
	     
	  }
	 System.out.println(map);
	}

}



