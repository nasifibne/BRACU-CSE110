import java.util.Scanner;
public class ques3
{
public static void main (String [] args)
{
  System.out.println("Enter an integer");
  Scanner sc= new Scanner(System.in);
  int num1= sc.nextInt();
  if(num1%5==0 && num1%7==0){
  System.out.print("Divisible by Both");
  }
  else if (num1%5==0){
  System.out.println("Invalid: Divisible by 5 Only");
  }
  else if (num1%7==0){
  System.out.println("Invalid: Divisible by 7 Only ");
  }
  else {
  System.out.println("NO");
  }

  
  
  
  
  
  
}
}