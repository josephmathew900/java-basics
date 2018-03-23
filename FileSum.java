import java.util.*;
import java.io.*;
class FileSum {
public static void main(String args[]) throws IOException {
  int sum = 0, num;
FileReader fin = new FileReader("test.txt"); //opening file
Scanner fscan = new Scanner(fin);
while(fscan.hasNextInt()==true) {
num = fscan.nextInt();
sum += num; //sum=sum+num;
}
fscan.close();
fin.close();
System.out.println("Sum = " + sum); }
}
