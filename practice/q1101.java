import java.util.Scanner;
 public class q1101{
  public static void main(String [] args){
  
    Scanner sc=new Scanner (System.in);
    for (int l=1; l>0; l++){
    
      int m= sc.nextInt();
      int n= sc.nextInt();
      
      int max = Math.max (m,n);
      int min = Math.min (m,n);
      int sum=0;
      if (m==0 || n==0 || m<0 || n<0){
        break;
      }
      else{
        for (int i= min; i<=max ; i++){
        System.out.print(i+ " ");
        sum +=i;
        }
      System.out.print("Sum= "+sum);
      }
      System.out.println();
    }
  
  
  }
}