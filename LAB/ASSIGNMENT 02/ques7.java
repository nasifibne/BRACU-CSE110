import java.util.Scanner;
public class ques7
{
public static void main (String [] args)
{
Scanner sc= new Scanner (System.in);
System.out.println("Enter your amount");  
int num= sc.nextInt();
  System.out.println ("enter your age");
  int age= sc.nextInt();

  if (age>= 18){
    if (num<10000){
    System.out.println("no tax");
    }
    else if (num>=10000 && num<=20000){
      
      System.out.println ("Your tax amounts is " +(num*5)/100);
    }
    else if (num>20000){
    System.out.println("Your tax amounts is " +(num*10)/100);
    }
    
  
  }
  else {
  System.out.println("NO TAX IF YOU ARE LESS THAN 18 YEARS OLD");
  }





}}