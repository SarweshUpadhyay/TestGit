
public class test1 
{
	    public static void main(String[] args)
	    {
	    	 String str="krishna 124 mohan 124 krishna mohan tanya";
	    		 
	    		 String words[]=str.split(" ");
	    		 
	    		 for(int i=0;i<words.length;i++) {
	    		  
	    		  for(int j=i+1;j<words.length;j++ ) {
	    		  
	    			  if (words[i].equals(words[j])) {
	    		     
	    		    System.out.println("duplicate words " + words[i] );
	    		   }
	    		   
	    		  }

	    		}
	    }
	}

