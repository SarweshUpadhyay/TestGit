import java.util.Arrays;

public class New1test {

	public static void main(String[] args)
	{
		
		int []str1= {100,200,34,5};
		int []str2= {10,21,4,15};
		
		if(str1.length!=str2.length)
		{
			System.out.println("Error");
			return;
		}
		
		int output[]=new int [str1.length];
		
		for(int i=0;i<str1.length;i++)
		{
			output[i]=str1[i]*str2[i];
		}
		
		
		     System.out.println(Arrays.toString(output ));
	}
		
			
			
		
		
		

}
