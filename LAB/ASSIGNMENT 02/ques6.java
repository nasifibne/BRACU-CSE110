import java.util.Scanner;
public class ques6
{public static void main (String [] args){
Scanner sc= new Scanner(System.in);
  int num= sc.nextInt();
  if (num<0){
  System.out.println(num*2);
  }
  else if (num>=0 && num<2){
  System.out.println(num+1);
  }
  else if (num>=2 && num<5){
  System.out.println(num*num -1);
  }
  else if (num>=5){
  System.out.println(3*(num*num)+2);
  }
 








}}