import java.util.Scanner;
public class ques2
{
  public static void main (String [] args){
  
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    if (num>89){
    System.out.println("your grade is A");
    }
    else if (num>84){
    System.out.println("your grade is A-");
    }
    else if(num>69){
    System.out.println("your grade is B");
    }
    else if (num>56){
    System.out.println("your grade is C");
    }
    else if (num>50){
    System.out.println("your grade is D");
    }
    else {
    System.out.println("your grade is F");
    }
    
  }
}