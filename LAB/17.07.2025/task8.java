//ans to the ques no 8
import java.util.Scanner;
public class task8{
  
  public static void main (String [] args){

    Scanner sc=new Scanner (System.in);
    int num =sc.nextInt();
    int initial= num;
    int digitCount=0;
    int div=10;
    int digit=0;
    while (num!=0){
      digitCount++;
      num = num/10;
    }
    for (int i=1; i<digitCount-1 ; i++){
      div *=10;    
    }
    while (initial!=0){
      digit = initial/div;
      if (initial<10){
        System.out.printf ("%d ",digit);
      }
      else {
        System.out.printf ("%d , ",digit);
      }
      initial = initial%div;
      div /= 10;
    }
    sc.close();
  }
}