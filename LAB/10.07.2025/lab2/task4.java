//ans to the ques num 4
import java.util.Scanner;
public class task4{
  public static void main (String [] args){
  
    Scanner sc= new Scanner (System.in);
    int x= sc.nextInt();
    int y= sc.nextInt();
    int z= sc.nextInt();
    
    if (x==y && y==z && z==x){
    System.out.println("This is a Equilateral triangle");
    }
    else if (x!=y && y!=z && z!=x){
    System.out.println("This is a Scalene triangle");
    }
    else {
    System.out.println("This is a Isosceles triangle");
    }
  }
}