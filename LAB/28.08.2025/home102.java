import java.util.Scanner;

public class home102{

  public static void main (String [] args){
      Scanner sc = new Scanner(System.in);
    //A
      System.out.println("give number to print dots");
    showDot(sc.nextInt());
    System.out.println();
    //B
      System.out.println("give number to print palindrome");
    showPalin(sc.nextInt());
    System.out.println();
    //C
      System.out.println("give number to print diamond");
    showDiamond(sc.nextInt());
  }
  //A
  public static void showDot(int a){
    for (int i =1 ; i<=a ;i++){
      System.out.print(".");
    }

  }
  //B
  public static void showPalin(int a ){
    for (int i =1 ; i<=a ; i++){
      System.out.print(i);
    }
    for (int i = a-1 ; i>0 ; i--){
      System.out.print(i);
    }
  }
//C
  public static void showDiamond (int a ){
      for(int i =1 ; i<=a ; i++){
        showDot(a-i);
        showPalin(i);
        showDot(a-i);
        System.out.println();
      }
      for(int i =a-1 ; i>0 ; i--){
      showDot(a-i);
      showPalin(i);
      showDot(a-i);
      System.out.println();
      }
  }
}