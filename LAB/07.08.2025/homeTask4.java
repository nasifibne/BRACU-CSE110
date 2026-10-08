// ans to the ques no 4
import java.util.Scanner;
public class homeTask4{
  public static void main (String [] args){

    Scanner scaner = new Scanner (System.in);
    int n=scaner.nextInt();
    
    for (int r=1; r<=n ; r++){
      for (int i=r ; i<n ; i++){
        System.out.print ("  ");
      }
      int p =1;
      for (int i =1; i<=r ; i++){
        if (i==1){
          System.out.print(p++ + " ");
        }
        else {
          System.out.print("  ");
          p++;
        }
      }
      
      for (int i=1; i<=r-1 ; i++){
        if (i==r-1){
          System.out.print(p++ + " ");
        }
        else {
          System.out.print("  ");
          p++;
        }
      }
      System.out.println();
    }
        for (int r=n; r>0 ; r--){
      for (int i=r ; i<=n ; i++){
        System.out.print ("  ");
      }
      int p =1;
      for (int i =1; i<r ; i++){
        if (i==1){
          System.out.print(p++ + " ");
        }
        else {
          System.out.print("  ");
          p++;
        }
      }
      for (int i=1; i<r-1 ; i++){
        if (i==r-2){
          System.out.print(p++ + " ");
        }
        else {
          System.out.print("  ");
          p++;
        }
      }
      System.out.println();
    }
  }
}