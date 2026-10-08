import java.util.Scanner;
public class ques10{
  public static void main(String [] args){
   //input
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the amount the customer need to pay(Taka) ");
    int num1= sc.nextInt();
    System.out.println(" Enter the amount, customer gave(Taka) ");
    int num2= sc.nextInt();
   //change 
    int rim;
    rim= num2-num1;
    
    if (rim>0){
      System.out.println("The returned amount is "+rim + " taka");
     //note and coin.
      int n100= rim/100;
      rim %= 100;
      System.out.println("100 taka note: "+n100);
      int n50= rim/50;
      rim%= 50;
      System.out.println("50 taka note: "+n50);
      int n20=rim/20;
      rim%=20;
      System.out.println("20 taka note: "+n20);
      int n10=rim/10;
      rim%= 10;
      System.out.println("10 taka note: "+n10);
      int n5=rim/5;
      rim%= 5;
      System.out.println("5 taka note: "+n5);
      int n2= rim/2;
      rim%=2;
      System.out.println("2 taka note: "+n2);
      int n1= rim/1;
      System.out.println("1 taka note: "+n1);
    }
    else if(rim<0){
     System.out.println("Please pay " +(num1-num2)+" taka more.");
    }
    else{
     System.out.println("The returned amount is 0 taka");
    }
  }
}
