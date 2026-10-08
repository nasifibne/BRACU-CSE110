import java.util.Scanner ;
public class sheet4{
  public static void main (String [] args){
  
    Scanner sc = new Scanner (System.in);
    System.out.print("Enter a 4 digit number ");
    int num= sc.nextInt();
    int digit=0;
    for (int i =3 ; i>=1; i--){
      int lastDigit = num%10;
      num = num/10;
      int prime = 0;
      for (int j =1; j<=lastDigit; j++){
 
        if (lastDigit%j==0){
        prime ++;
        }
      }
        if (prime ==2){
        System.out.printf( "%d is prime! (1/3 found)\n",lastDigit);
        digit ++;
        }
        else {
        int lifelest = i-1;
        System.out.printf("%d is not a prime! life lest: %d\n",lastDigit, lifelest);
       
       if(lifelest==0){
       System.out.println("Game is over YOu lost");
        }
       else if (digit ==3){
          System.out.println("Congrats you won the game ");
        }
        } 
        
    }
  }
  }
