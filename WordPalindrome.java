//Java program to check whether word is palindrome

import java.util.*;
class WordPalindrome{
  public static void main(String args[]){
    int length,i,j,flag=0;
    String word;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a word");
    word = scan.next();
    i = 0;
    length = word.length();
    j = length - 1;
    while(i < length/2){
      if(word.charAt(i) != word.charAt(j)){
        flag = 1;
        break;
      }
      i++;
      j--;
    }
if(flag == 1){
  System.out.println("Not a palindrome!");
}else{
  System.out.println("Palindrome!");
}

  }
}
