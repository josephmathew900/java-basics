//Java program to read data from user and write it into a file
import java.io.*;
class FileWriteOne{
  public static void main(String args[])throws IOException
  {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String name;
    System.out.println("Enter your name:");
    name = br.readLine();
    FileWriter fout = new FileWriter("FileWriteOne.txt");
    fout.write("Name:"+name);
    fout.close();
    System.out.println("File Write Complete!");

  }
}
