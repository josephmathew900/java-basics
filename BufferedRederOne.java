//Basic Program to implement BufferedReader
import java.io.*;
 class BufferedRederOne
 {
   public static void main(String args[])
   {
     try
     {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       double first,second,sum,square_root,cube;
       System.out.println("Enter first number:");
       first = Double.parseDouble(br.readLine());
       System.out.println("enter second number:");
       second = Double.parseDouble(br.readLine());

       sum = first + second;

       square_root = Math.sqrt(sum);

       cube = Math.pow(sum,3);

       System.out.println("Sum of "+first+" and "+second+" is: "+sum);
       System.out.println("Square is "+square_root+" and Cube is "+cube);

     }
     catch(IOException e)
     {
       System.out.println("Exception:"+e);
     }
   }
 }
