import java.util.HashMap;

public class palindrom {

	public static void main(String[] args) {
	 
	  String str1= "Sarwesh upadhyay";
	  HashMap<Character, Integer> str2= new HashMap<>();
	  for(int i=0;i<str1.length();i++)
	  {
		  if(str2.containsKey(str1.charAt(i)))
				  {
			          int count= str2.get(str1.charAt(i));
			          str2.put(str1.charAt(i), ++count);
			          
			  
				  }
		  else
		  {
			  str2.put(str1.charAt(i), 1);  
		  }
	  }
	  
	  
	System.out.println(str2);
	 
	}
}
	 
	
	
	
	 
	 
	 
	 
	 
	 
	 
