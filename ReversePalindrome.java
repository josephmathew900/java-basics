import java.util.*;
class ReversePalindrome{
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String word,revword="";
    int length,i,j;
    System.out.println("Enter a word:");
    word = scan.next();
    length = word.length();

    for(i=length-1;i>=0;i--){
      revword = revword + word.charAt(i);
    }
    System.out.println("Reverse is : "+revword);
    if(revword.equals(word)){
      System.out.println("Palindrome!");
    }else{
      System.out.println("Not Palindrome!");
    }

  }
}
