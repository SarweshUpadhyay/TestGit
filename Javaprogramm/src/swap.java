
public class swap {
	
	/*
	 * X= 5 (First number), Y= 3 (second number)
Swapping Logic:
X = X + Y = 5 +3 = 8
Y = X - Y = 8 - 3 = 5
X = X -Y = 8 - 5 = 3
and the numbers are swapped as X =3 and Y =5. 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		String  input1="Tanya";
		String  input2="Trupti";
		
		
		
		
		System.out.println("Before Swapping");
		System.out.println("input1    "    +input1);
		System.out.println("input2:    "    +input2);
		
		input1= input1+input2;
		
		input2=input1.substring(0, input1.length()-input2.length());
		 //input2=input1.substring(0, 0)
		
		input1=input1.substring(input2.length());
		
		
		System.out.println("Afetr Swapping");
		System.out.println("input1    "   +input1);
		System.out.println("input2:   "    +input2);
		

	}

}
