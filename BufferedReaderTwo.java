//Java Program to send message to user based on grade given as input
import java.io.*;
class BufferedReaderTwo
{
  public static void main(String args[]) throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char grade;
    System.out.println("Please enter grade:");
    grade = (char)br.read();

    if(grade == 'A' || grade == 'a')
    {
      System.out.println("Grade "+grade+" Excellent!");
    }else if (grade == 'B' || grade == 'b') {
      System.out.println("Grade "+grade+" Good!");
    }
    else{
      System.out.println("Grade "+grade+" Needs To Improve!");
    }
  }
}
