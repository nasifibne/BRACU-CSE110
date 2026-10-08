import java.util.Scanner;
public class q1102{
  public static void main(String [] args){

    Scanner sc=new Scanner (System.in);
    for (int h=1; h>0; h++){
    int x= sc.nextInt();
    int y = sc.nextInt();
    if (x==y){
    break;
    }
    else if (x>y){
    System.out.println("Decrescente");
    }
    
    else {
    System.out.println("Crescente");
    }
    }
  
  
  }
}