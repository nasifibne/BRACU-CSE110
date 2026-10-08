import java.util.*;
public class series {
  public static void main (String [] args){
    Scanner sc =new Scanner (System.in);
    int n = sc.nextInt();
    int sum=0;
    int k =n/3;
    int rem = n%3;
    sum = k*7;;
    if (rem==1){
    sum +=7;
    }
    else if (rem==2){
    sum +=14;
    }
    System.out.println(sum);
  
  
  
  
  
  
  }
}