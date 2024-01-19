import java.util.HashMap;
import java.util.Scanner;     
public class test8  
{  
	
	public static void main(String[] args) 
	{
		String a1= "Trupti Nankar Tanya";
		
		HashMap<Character,Integer> a2= new HashMap<>();
		
		for(int i=a1.length()-1;i>=0;i--)
		{
			 //a1.charAt(i);
			if(a2.containsKey(a1.charAt(i)))
			{
				
				int count=a2.get(a1.charAt(i));
				a2.put(a1.charAt(i), ++count);
			}
			else {
			a2.put(a1.charAt(i),1);
		}}
	System.out.println(a2);

	}}
	
	
