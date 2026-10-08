//ans to the ques no 2
import java.util.Scanner;
public class hometask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the value");
        int leng = scanner.nextInt();
        System.out.println("Input the value");
        int wid = scanner.nextInt();
        for (int i =1; i<=wid ; i++){
            for (int j = 1 ; j <= leng ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
