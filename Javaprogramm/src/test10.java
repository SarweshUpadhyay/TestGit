

	public class test10 
	{
		public static void main(String[] args)
		{
		int [] arr= {1,2,3,5};
		
		// 1 2 3  5 
		//1+2+3+4+5=15
		//1+2+3+5=11
		//15-11=4
		
		int totanumsum=0;
		for(int i=0;i<=5;i++)
		{
			totanumsum+=i;
		}
          int sumofelements=0;
          for(int i:arr)
          {
        	  
        	  sumofelements+=i;  
          }
          
			int missingnumber=totanumsum- sumofelements;
			System.out.println("Missing number:"+missingnumber);
		}}

		

	    

	
		
	
	



