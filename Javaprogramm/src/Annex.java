/*
 * Java Main Method
 * The main() is the starting point for JVM to start execution of a Java program.
 *  Without the main() method, JVM will not execute the program
 * 
 * public: It is an access specifier. We should use a public keyword before the main() method so that JVM can identify the execution point of the program. 
 * If we use private, protected,
 *  and default before the main() method, it will not be visible to JVM.
 * 
 * static: You can make a method static by using the keyword static. 
 * We should call the main() method without creating an object.
 *  Static methods are the method which invokes without creating the objects,
 *   so we do not need any object to call the main() method.
 *   
 *   
 *   class Annex
{
	 
		static                  //static block  
		{  
		System.out.println("Static block");  
		}  

//public static void main(String[] args)
static public void main(String args[]) 
	{
	System.out.println("Sarwesh");

	}

}
 * 
 * void: In Java, every method has the return type. 
 * Void keyword acknowledges the compiler that main() method does not return any value.
 * 
 * main(): It is a default signature which is predefined in the JVM. 
 * It is called by JVM to execute a program line by line and end the execution after completion of this method.
 *  We can also overload the main() method.
 *  String args[]: The main() method also accepts some data from the user.
 *   It accepts a group of strings, which is called a string array. 
 *  It is used to hold the command line arguments in the form of string values
 *  
 *  
 *  What happens if the main() method is written without String args[]?
 *  
 *  The program will compile, but not run, because JVM will not recognize the main() method. 
 *  Remember JVM always looks for the main() method with a string type array as a parameter.
 * 
 *  Execution Process:
 *  
 *  First, JVM executes the static block, then it executes static methods, and then it creates 
 *  the object needed by the program. Finally, it executes the instance methods.
 *   JVM executes a static block on the highest priority basis. It means 
 *  JVM first goes to static block even before it looks for the main() method in the program.
 *  
 *  
 *  
 *  class Annex
{
	 
		

//public static void main(String[] args)
//static public void main(String args[]) 
	//static public void main(String []x)
	static public void main(String...args)  
	
	{
	System.out.println("Sarwesh");

	}

}


class Annex
{
	
	public static void main(int a)  //overloaded main method  
	{  
	System.out.println(a);  
	}  

//public static void main(String[] args)
//static public void main(String args[]) 
	//static public void main(String []x)
	
	
	static public void main(String...args)  
	
	{
	System.out.println("Sarwesh");
	main(10);

	}

}


Date-17-01-24

Primitive Data Types:

i) Integer Types:
1) byte (8 bits); 
Example: byte a =10;
2) short (16 bits);
 Example: short a =1000;
3) Integer (32 bits);
 Example: int i = 10000;
4) long (64 bits);
 Example: long l =100000000000L;
 
 
 ii) Relational types 
(Numbers with decimal places)
5) float (32 bits); 
Example: float f = 1.23f or (float) 1.23;
6) double (64 bits); 
Example: double d =123.4567890; 

iii) Characters
7) Character (16 bits); 
Example: char c =’Z’

 iv) Conditional
8) Boolean (1 bit); Example: boolean b = true;


Non-Primitive Data Types:

Non-primitive or Reference data types in Java are Objects, Class, Interface,
 String and Arrays.
Example: String str = “Java World”;

Relational Operators:

1) ==
2) !=
3) <
4) >
5)= <
6) <=

Assignment Operators:


1) Assignment Operator: =
2) Add and Assign: +=
3) Subtract and assign: -=
4) Multiple and assign: *=

Logical Operators:

1) Logical Not Operator !
2) Logical And Operator &&
3) Logical Or Operators ||


Java String:


String is a sequence of characters written in double quotes.--->ex String str1="Testing class";
String may have Alphabets, Numbers and Special characters.
The java.lang.String class provides many useful methods to perform operations on sequence of char values.
An array of characters works same as Java string.
 String can be created using new keyword.

 *  
 *  How to Create a String Object?
String object can be created using two ways:

 Using String Literal.
 
 *  (data type)String s2(varibale name)="Sarwesh"{Array of Characters};
 *  
 *  
 *   String Literal and String Constant Pool
A literal, in computer science, is a notation used for representing a value. 
Java String literal can be created and represented using the double-quotes. 
All of the content/characters can be added in between the double quotes.

Now we will see the memory management of Strings in Java. 
The Strings in Java are stored in a special place in heap called "String Constant Pool" or "String Pool".

   
   String Constant Pool
The string constant pool in Java is a storage area in the heap memory that stores string literals.
 When a string is created, the JVM checks if the same value exists in the string pool.
  If it does, the reference to that existing object is returned.
 Otherwise, a new string object is created and added to the string pool, and its reference is returned.
    
    
    Using new keyword.
    String s3=new String(“Java String");
    
    
    
    
    
    Methods of Java Strings
    
    
    1. int length() Method
    
    stringName.length()
    
    String genre = "action";
int genreLength = genre.length();
System.out.println(genreLength); //output---> 6

2. char charAt(int index) Method:

The charAt() method of string in Java accepts an index number as an argument and returns the character at the given index number.

The indexing is from 0 to length-1, where length is the length of the string.
 In case the passed index number is not present in the 
 string(if it's equal to or greater than the length of the string or if it is a negative number),
  StringIndexOutOfBoundsException is thrown.
  
  stringName.charAt(index)


String str = "Annex academy";  
char ch = str.charAt(18);
System.out.println(ch); // a



3. String concat(String string1) Method

Details: What if we want to concat(or connect) two strings?

We have a method for that too! The concat() method of string in Java is used for concatenating two strings


Syntax:
string.concat(anotherString)


String str1 = "Arun";
str1 = str1.concat("xavier ");
System.out.println(str1); // 

Java Strings: Mutable or Immutable
In Java, strings are immutable, meaning their values cannot be changed once initialized.
 This is because a single string object in the String constant pool can have multiple references.
  Modifying the value of one reference could affect other strings or reference variables, leading to conflicts. 
  To prevent these conflicts, string objects are made immutable in Java.

The concept of the String Constant Pool is closely tied to string immutability in Java.

Although it may seem like string values can be changed in previous sections of this article,
 the actual string value remains unchanged.

Conclusion
Strings in Java are objects that represent a sequence of characters.
String literals are stored in the String pool, a special area in the heap.
Strings can be created using string literals or the new keyword.
The new keyword allocates memory outside the string pool.
Various string methods exist to work with strings in Java.
Concatenation can be done using the + operator or concat() method.
String formatting is possible with the format() method.
The escape character \ can be used to handle special characters in strings.
Strings in Java are immutable, meaning their values cannot be changed after initialization.


Java Array:

Array is a collection of similar type of elements that have a contiguous memory location.
An array is a very common type of data structure wherein all elements must be of the same data type.
 Once defined, the size of an array is fixed and cannot increase to accommodate more elements,
 index starts from zero to n-1.We can store only the fixed size of elements in the array.
 It doesn't grow its size at runtime. 
To solve this problem,collection framework is used in Java which grows automatically.

There are two types of array.
Single Dimensional Array –
 Example: int [] array1 = {1, 2, 3, 4};
                           [0],[1],[2],[3]
Multidimensional Array –
 Example: int [] [] array2 = {{1, 3, 5}, {2, 4, 6}};

18-Jan-2024-


Java Loop:

For Loop:


The Java for loop is a control flow statement that iterates a part of the program multiple times.

For loop repeats a block of statements for a specified number of times.
If the number of iteration is fixed, it is recommended to use for loop.

Syntax:
for (startValue; endValue; increment/decrement)

for(int i=0;i<10;i++) 
{
   
}    


{
 Statement(s)
 }
 
 
 Initialization condition: Here, we initialize the variable in use. It marks the start of a for loop.
  An already declared variable can be used or a variable can be declared, local to loop only.
Testing Condition: It is used for testing the exit condition for a loop. It must return a boolean value. It is also an Entry Control Loop as the condition is checked prior to the execution of the loop statements.
Statement execution: Once the condition is evaluated to true, the statements in the loop body are executed.
Increment/ Decrement: It is used for updating the variable for next iteration.
Loop termination:When the condition becomes false, the loop terminates marking the end of its life cycle.


Enhanced For Loop:
In Java, there is another form of for loop (in addition to standard for loop) to work with arrays and collection,
 the enhanced for loop.

Enhanced for loop is also known as for-each loop which reduces the code significantly and there is no use of the index or rather the counter in the loop.Syntax of enhanced for loop:


Syntax of enhanced for loop:
for(declaration : expression)
{// Statements}


char [] obj = {'j','a', 'v', 'a'};for (char c: obj){System.out.println(c);}

While Loop:
A while loop statement in Java programming language repeatedly executes a target statement as long as a given condition is true.


Syntax:Initialization;
 while (Condition)
{ 
Statement(s);
 increment/decrement; 
}


Do while Loop:

The Java do-while loop is used to iterate a part of the program several times. 
If the number of iteration is not fixed and you must have to execute the loop at least once,
 it is recommended to use do-while loop

It executes a block of statements at least once irrespective of the condition.
First, the statements inside loop execute and then the condition gets evaluated, 
if the condition returns true then the control gets transferred to the “do” else it jumps to the next statement after do-while.


Conditional Statement in Java:

If:
if statement is used only to specify a block of Java code to be executed if a condition is met (true).

if(condition)
{ 
Statement(s);
}


public class Annex {
	public static void main(String[] args)
	{
		int age=20;
		if(age>10)
		{
			System.out.println("Age is greater than 10");
		}
   
  }
}


If else:

An if statement can be followed by an optional else statement,
 else statement is used to specify a block of code to be executed if the condition is not met (false).

if(condition)
 {
 Statement(s);
}
else 
{ 
Statement(s);
}


public class Annex {
	public static void main(String[] args)
	{
		int age=5;
		if(age>10)
		{
			System.out.println("Age is greater than 10");
		}
		else
		{
			System.out.println("Age is less than 10");
		}
		
   
  }
}


if else if ladder

else if statement is used to specify a new condition when first condition is false.

if(condition_1) 
{ 
//execute this statement in case condition_1 is true 
Statement(s);
}
else if
(condition_2) 
{ //execute this statement in case condition_1 is not met but condition_2 is true Statement(s);
}
else if(condition_3) { //execute this statement in case condition_1 and condition_2 are not met but condition_3 is true Statement(s);}
…..else 
{ //execute this statement in case none of the above conditions are true Statement(s);
}



public class Annex {
	public static void main(String[] args)
	{
		
		int marks=95;  
	      
	    if(marks<50){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60)
	    {  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70)
	    {  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80)
	    {  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }
	    else if(marks>=90 && marks<100)
	    {  
	        System.out.println("A+ grade");  
	    }
	    else
	    {  
	        System.out.println("Invalid!");  
	    }  
		
		
   
  }
}
Switch:

switch(expression) 
{ 
case value : // Statements break;
 // optional case value : 
// Statements break; 
// optional.. default : 
// Optional // Statements}


NestedFor:
public class Annex {
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{  
			for(int j=1;j<=i;j++)
			{  
			        System.out.print("* ");  
			}  
			System.out.println();//new line
		
		}
  }
}



output>
* * * * * * 
* * * * * 
* * * * 
* * * 
* * 
*  



Date -19-Jan-2024



Access specifiers:

There are four types of access modifiers available in Java:

1-Default – No keyword required
2-Private
3-Protected
4-Public


1-Default – No keyword required:
When no access modifier is specified for a class, method, or data member – 
It is said to be having the default access modifier by default.

class Prasanna 
{ 
	void display() 
	{ 
		System.out.println("Hello World!"); 
	} 
} 




2-Private:-
The private access modifier is specified using the keyword private.
The methods or data members declared as private
 are accessible only within the class in which they are declared.


Any other class of the same package will not be able to access these members.
Top-level classes or interfaces can not be declared as private because
private means “only visible within the enclosing class”.




package p1; 
class A 
{ 
private void display() 
	{ 
		System.out.println("Hi Laxmi"); 
	} 
} 

class B 
{ 
public static void main(String args[]) 
	{ 
		A obj = new A(); 
		// Trying to access private method 
		// of another class 
		obj.display(); 
	} 
} 



Protected Access Modifier:-
The protected access modifier is specified using the keyword protected.

The methods or data members declared as protected are accessible within the same package or subclasses in different packages.

In this example, we will create two packages p1 and p2. Class A in p1 is made public, to access it in p2.
 The method display in class A is protected and class B is
 inherited from class A and this protected method is then accessed by creating an object of class B.
 
 * */
 


//package p1; 

public class Annex {
	public static void main(String[] args)
	{
		
		for(int i=1;i<=5;i++)
		{  
			for(int j=1;j<=i;j++)
			{  
			        System.out.print("* ");  
			}  
			System.out.println();//new line
		
		}
  }
}

 
 






