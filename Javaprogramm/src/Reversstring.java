
public class Reversstring {

	public static void main(String[] args) {
		String str1= " sarwesh upadhyay";
		String str2= "";
		//String[] words=str1.split("\\s");
		
		for(int i= str1.length()-1;i>=0;--i) {
			
			str2 += str1.charAt(i);
			
			
			
		}
System.out.println(str2);
	}

}
