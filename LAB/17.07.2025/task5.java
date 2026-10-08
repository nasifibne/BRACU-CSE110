//ans to the ques no 5
import java.util.Scanner;
public class task5{
  public static void main (String [] args){

    Scanner sc=new Scanner (System.in);
    int sum =0;
    for (int i =1; i<=10 ; i++){
    System.out.printf("Enter Number: ");
    int num = sc.nextInt();
    sum +=num;
    System.out.printf("Sum= %d\n", sum);
    }
    sc.close();
  }
}