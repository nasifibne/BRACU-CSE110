import java.util.Scanner;
public class quiz1{
  public static void main(String [] args){

    Scanner sc= new Scanner (System.in);
    int bal = sc.nextInt();
    System.out.println("Enter the number of the game you want to buy(1-4)");
    int x= sc.nextInt();
    int rem;
    int rem1;
      if (x==1 && bal>70){
      rem = bal-70;
        if (rem%3==0){
      System.out.println("reminder in divisal by 3");
      System.out.printf("Final balance= %d ", rem);
      }
        else {
      System.out.println("another game you want to buy");
      int x2= sc.nextInt();
      if (x2==1 && rem >70){
      rem1= rem-70;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==2 && rem >90){
      rem1= rem-90;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==3 && rem >110){
      rem1= rem-110;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==4 && rem >130){
      rem1= rem-130;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
    }
        }
    }
    else if (x==2 && bal>90){
    rem = bal-90;
        if (rem%3==0){
      System.out.println("reminder in divisal by 3");
      System.out.printf("Final balance= %d ", rem);
      }
        else {
      System.out.println("another game you want to buy");
      int x2= sc.nextInt();
      if (x2==1 && rem >70){
      rem1= rem-70;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==2 && rem >90){
      rem1= rem-90;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==3 && rem >110){
      rem1= rem-110;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==4 && rem >130){
      rem1= rem-130;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
    }
        }
    }
    else if (x==3 && bal>110){
    rem = bal-110;
        if (rem%3==0){
      System.out.println("reminder in divisal by 3");
      System.out.printf("Final balance= %d ", rem);
      }
        else {
      System.out.println("another game you want to buy");
      int x2= sc.nextInt();
      if (x2==1 && rem >70){
      rem1= rem-70;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==2 && rem >90){
      rem1= rem-90;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==3 && rem >110){
      rem1= rem-110;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==4 && rem >130){
      rem1= rem-130;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
    }
        }
    }
    else if (x==4 && bal>130){
    rem = bal-130;
        if (rem%3==0){
      System.out.println("reminder in divisal by 3");
      System.out.printf("Final balance= %d ", rem);
      }
        else {
      System.out.println("another game you want to buy");
      int x2= sc.nextInt();
      if (x2==1 && rem >70){
      rem1= rem-70;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==2 && rem >90){
      rem1= rem-90;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==3 && rem >110){
      rem1= rem-110;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
      }
      else if (x2==4 && rem >130){
      rem1= rem-130;
      System.out.println("Successfully game purchesed.");
      System.out.printf("Final balance= %d ", rem1);
    }
        }
    }
    else {
    System.out.println("Insufficient balancefor buying game");
    }
  }
}