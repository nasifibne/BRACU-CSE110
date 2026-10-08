public class task4 {
    public static void main(String[] args) {
        boolean check = HappyNumber(3);
        System.out.println(check);

    }
    public static boolean HappyNumber(int n ){
        while (n!=1 && n!=4) {
              int sum=0;
              while(n>0) {
                  int x = n % 10;
                  sum += x*x;
                  n /= 10;
              }
              n=sum;
        }
        return n==1;
    }
}
