import java.util.Scanner;
public class hometask104 {
    public static int fibonacci(int i){
        if(i<=1){
            return i;
        }
        return fibonacci(i-1)+fibonacci(i-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }
}
