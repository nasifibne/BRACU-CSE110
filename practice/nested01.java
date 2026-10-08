import java.util.Scanner;
public class nested01{
  public static void main (String [] args){

    Scanner sc= new Scanner (System.in);
    
    int x = sc.nextInt();
    int sum=0; int digit=0; int y=0; int num=0;
    for (int i =1; i<=x ; i++){
      num= sc.nextInt();
      y = num;
    
      if (num>0 && num %2==0){
      sum +=num;
      digit ++;
      }
    
    }
    System.out.println(sum/digit);
        System.out.println(y);    
        System.out.println(num);
    
    
    
    


    
    
    
    
    }
  }
