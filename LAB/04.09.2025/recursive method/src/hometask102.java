import java.util.Scanner;
public class hometask102 {
    public static int power (int i , int x){
        if(x==0){
            return 1;
        }
        return i*power(i,x-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = power(sc.nextInt(), sc.nextInt());
        System.out.println(x);

    }
}
