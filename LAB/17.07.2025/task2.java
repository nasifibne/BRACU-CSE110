// ans to the ques no 2
public class task2{
  public static void main (String [] args){

    int sum=0;
    for (int i =1 ; i<=600 ; i++){
      if (i %7==0 && i %9!=0 || i%9==0 && i %7!=0){
      sum +=i;
      }
    }
  System.out.println(sum);
  
  }
}