import java.util.Scanner;

public class mat18 {
    public static int power (int a, int b){
        int pow=1;
        for (int i =1 ; i<=b ;i++){
            pow *=a;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print( "^");
        int y = sc.nextInt();
        int result = power(x,y);
        System.out.println(result);
    }
}
