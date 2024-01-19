import java.util.HashMap;

public class newtest {
	
	public static void main(String[] args)
	{
	
		String str1="TruptiNankarTanya";//input-->TruptiNankarTanya
		                                 //output= find the char count how many times is repeat.
		
		HashMap<Character, Integer> str2=new HashMap<>();
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			if(str2.containsKey(str1.charAt(i)))
					
			{
				int count =str2.get(str1.charAt(i));
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





//



//int a=2----->a=2
//int b=a++;--->b=2/---> a=3
//int c =++a;--->c=4,a=4


