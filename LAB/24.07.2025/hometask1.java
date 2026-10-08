// ans to the ques no 1
import java.util.Scanner;
public class hometask1{
  public static void main (String [] args){
    Scanner sc = new Scanner (System.in);
    System.out.print("How many test case you want?");
    int test = sc.nextInt();
     for (int i =1 ; i<= test ; i++){
       System.out.print("The initial digit");
       int start = sc.nextInt();
       System.out.print("How many odd numbers");
       int step = sc.nextInt();
       int sum=0;
       int first=0;
       if (start%2==1){
        first= start;
       }
       else {
         first = start + 1;
       }
       for (int j=1 ; j<=step ; j++ ){
           sum +=first;
           first +=2;
       }
       System.out.println(sum);
    }
     sc.close();
  }
}