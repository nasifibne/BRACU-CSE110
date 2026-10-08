// ans to the ques no 7
import java.util.Scanner ;
public class task7{
  public static void main (String [] args){

    Scanner sc= new Scanner (System.in);
    int num = sc.nextInt();
    int digit=0;
    while (num>0){
    digit = num%10;
    if (num<10){
    System.out.printf("%d ",digit);
    }
    else {
    System.out.printf("%d, ",digit);
     }
    num = num/10;
    }
    sc.close();
  }
}