public class mat19 {
    public static boolean prime(int a){
        boolean falg = true;
        for (int i=2 ; i<a ; i++){
            if(a%i==0){
                falg = false;
            }
        }
        return falg;
    }

    public static void main(String[] args) {
        System.out.println(prime(5));
    }
}
