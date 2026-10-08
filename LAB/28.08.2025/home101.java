import java.util.Scanner;
public class home101{

  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    //A
    System.out.println("give a number to check prime");
    boolean checkPrime = isPrime(sc.nextInt());
    System.out.println(checkPrime);
    //B
    System.out.println("give a number to check perfect");
    boolean checkPrefect = isPerfect(sc.nextInt());
    System.out.println(checkPrefect);
    //C
    System.out.println("give a number");
    int result = special_sum(sc.nextInt());
    System.out.println(result);

  }
//A
  public static boolean isPrime(int a ){
  boolean flag = true;
  for(int i=2 ; i<a ; i++){
    if( a%i==0){
      flag = false;
    }
  }
  return flag;
  }
  //B
  public static boolean isPerfect(int a ){
    boolean flag = false;
    int sum=0;
    for(int i=1; i<a ;i++){
      if(a%i==0){
        sum +=i;
      }
    }
    if(sum== a ){
      flag = true;
    }
    return flag;
  }
//C
  public static int special_sum (int a ){
    int sum =0;
    for (int i =2 ; i<= a ; i++){
      if( isPrime(i) || isPerfect(i)){
         sum +=i;
      }
   }
    return sum;
  }
}