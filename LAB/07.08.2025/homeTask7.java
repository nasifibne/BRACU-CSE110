//ans to the ques no 7
import java.util.Scanner;
public class homeTask7{
  public static void main (String [] args){
  
    Scanner scaner = new Scanner (System.in);
    int n =scaner.nextInt();
    for (int i=n ; i>0 ; i-=2){
      for (int j=n ; j>i ; j--){
        System.out.print(" ");
      }
      for (int j=1 ; j<=i ; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
    for (int i=3 ; i<=n ; i+=2){
      for (int j=n ; j>i ; j--){
        System.out.print(" ");
      }
      for (int j=1 ; j<=i ; j++){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}