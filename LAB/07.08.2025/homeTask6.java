//ans to the ques no 6
import java.util.Scanner;
public class homeTask6{
  public static void main (String [] args){

    Scanner scaner = new Scanner (System.in);
    int n =scaner.nextInt();
    
    for (int i=n ; i>0 ;i--){
     for (int j=n ; j>i ; j--){
        System.out.print("  ");
      }
      int p=1;    
        for (int j=1 ; j<=i; j++){
          System.out.print(p++ + " ");
        }
        int q = p-2;
        for (int j=i-1 ; j>0 ; j-- ){
            System.out.print(q-- + " ");
          }
        
      System.out.println();
    }
    scaner.close();
  }
}