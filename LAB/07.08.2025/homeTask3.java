// ans to the ques no 3
import java.util.Scanner;
public class homeTask3{
  public static void main (String [] args){

    Scanner scaner = new Scanner (System.in);
     int n =scaner.nextInt();
     for (int i =1; i<n ; i++){
       for (int j =i ; j<n ; j++){
         System.out.print("  ");
       }
       int p =1;
       for (int j=1 ; j<=i ; j++){
         if (j==1){
           System.out.print(p++ + " ");
         }
         else {
           System.out.print("  ");
           p++;
         }
         
       }
       for (int j=2 ; j<=i ; j++){
         if (j==i){
         System.out.print(p++ + " ");
         }
         else {
           System.out.print("  ");
           p++;
         }
       }
       System.out.println();
     }
     for (int i=1 ; i<= 2*n-1 ; i++){
       System.out.print(i+ " ");
     }
     
     
     
  }
}