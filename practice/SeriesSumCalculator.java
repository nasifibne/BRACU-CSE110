import java.util.Scanner;

public class SeriesSumCalculator {

    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Enter the value of N (number of terms): ");
        int n = scanner.nextInt(); 

        long sum = 0; 
        int currentAbsoluteTerm = 3;

    
        for (int i = 1; i <= n; i++) {
            int termValue = currentAbsoluteTerm; 

           
         
              
            if (i % 2 == 0) {
                    termValue = -termValue; 
                
            }

            
            sum += termValue;

            
            currentAbsoluteTerm += 2;
        }

       
        System.out.println("The value of Y is: " + sum);

        
        scanner.close();
    }
}