import java.util.Scanner; 
public class PrimeNumbers {
    public static void main(String[] args) {
      Scanner sc = new Scanner (System.in);
      int x = sc.nextInt();
      boolean prime = true;
      while (x>0){
        for (int j =2; j>0 ; j++){
         
            if (((j*j)-1)/24==0){
              System.out.println(j);
            }
            
          
        }

      x--;
      }
    }
}
