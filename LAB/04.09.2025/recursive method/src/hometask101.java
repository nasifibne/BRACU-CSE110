import java.util.Scanner;
public class hometask101 {
    public static int factorial (int i){
        if(i==1){
            return 1;
        }
        return i*factorial(i-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = factorial(sc.nextInt());
        System.out.println(x);
    }
}
