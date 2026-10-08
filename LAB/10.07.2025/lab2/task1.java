// ans to the ques no 1
import java.util.Scanner;
public class task1{
  public static void main(String [] args){
  
    Scanner sc= new Scanner(System.in);
    int number= sc.nextInt();
    if (number%5==0 && number%7==0){
      System.out.println("Invalid: Divisible by both");
    }
    else if (number%5==0){
      System.out.println("Divisible by 5 Only");
    }
    else if (number%7==0){
      System.out.println("Divisible by 7 Only");
    }
    else {
      System.out.println("No");
    }
  }
}