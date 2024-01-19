import java.util.Scanner;

class test6
{
	 public static void main(String[] args) {
		 
		// Scanner sc= new Scanner(System.in);
		 
		 //System.out.println("Pls enter the Sentance");
		 String str1= "my name is sarwesh kumar";
		 str1= str1+" ";
		 String revsen="",word="";
		 
		 for(int i=0;i<str1.length();i++)
		 {
			 char ch=str1.charAt(i);
			 if(ch!=' ')
			 {
				 
				 word= word+ch;
			 }
			 
			 else
			 {
				 revsen= word+ " " +revsen;
				 word=" ";
			 }
		 }
		 
		 System.out.println(revsen);
	 }
	 
	 
	 
   
}