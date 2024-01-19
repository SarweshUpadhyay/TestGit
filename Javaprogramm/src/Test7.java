import java.util.Scanner;
public class Test7 {

 public static void main(String[] args) {
 Scanner cs=new Scanner(System.in);
        System.out.println("Enter the row size:");

        int row_size,out,in;
        row_size=cs.nextInt();
    
        for(out=1;out<=row_size;out++)
      {
      for(in=row_size;in>=out;in--)
      {
          System.out.print(out);
          
      }
      System.out.println("*");
    }
     cs.close();

 }
}