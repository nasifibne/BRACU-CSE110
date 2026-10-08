import java.util.Scanner;
public class ques5
{
public static void main( String [] args)
{
System.out.println("Enter an integer value");
Scanner sc= new Scanner(System.in);
int num= sc.nextInt();
if (num==0){
  System.out.println("Number is zero");
}
else if(num<0){
System.out.println("Number is negative");
} 
else if (num>0 && num%2==0){
System.out.println("Number is positive and even");
}
else {
System.out.println("Number is positive and odd");
}
}
}