// ans to the ques no 3
import java.util.Scanner;
public class hometask3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Start: ");
        int start = sc.nextInt();
        System.out.print("End: ");
        int end = sc.nextInt();
        System.out.println("prime numbers between the range is ");
        for (int i= start; i<=end ; i++){
            boolean isPrime = true;
            for (int div = 2 ; div <i ; div++){
                if(i %div==0){
                    isPrime= false;
                    break;
                }
            }
            if (isPrime == true){
            System.out.println(i);
            }
        }
        sc.close();
    }
}
