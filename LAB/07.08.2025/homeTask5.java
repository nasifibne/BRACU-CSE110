// ans to the ques no 5
import java.util.Scanner;
public class homeTask5{
  public static void main (String [] args){
 
    Scanner scaner = new Scanner (System.in);
    int n=scaner.nextInt();
    
    for (int i =1 ; i<=n ; i++){
      for (int j=i ; j<n ;j++){
        System.out.print("  ");
      }
      int p=1;
      for (int j=1 ; j <=i ; j++){
        System.out.print(p++ + " ");
      }
      int q = p-2;
      for (int j=2 ; j<=i ; j++){
        System.out.print(q-- + " ");
      }
      
      System.out.println();
    }
  
  
  
  
  
  
  
  
  
  }
}