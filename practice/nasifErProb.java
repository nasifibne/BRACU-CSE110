import java.util.Scanner;
public class nasifErProb {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of prime numbers: ");
        int n = sc.nextInt();
        int count = 0;
        int num = 2;
        while (count<n){
            int i=0;
                for (i=2; i<=num/2; i++){
                    if (num%i==0){
                        break;
                    }
                }
            if (i>n/2){
                System.out.println(num);
                count++;
            }
            num++;
        }
    }
}