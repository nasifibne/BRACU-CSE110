// ans to the ques no 6
import java.util.Scanner;
public class task6{
  public static void main (String [] args){
  
    Scanner sc=new Scanner (System.in);
    int num = sc.nextInt();
    System.out.printf("Divisors of %d:\n",num);
    for (int i =1 ; i<=num ; i++){
      if (num % i ==0){
      System.out.printf("%d\n",i);
      }
    }
  sc.close();
  }
}