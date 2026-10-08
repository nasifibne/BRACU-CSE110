public class mat5 {
    public static int factoria (int a ){
        if(a==0){
            return 1;
        }
        else {
            return a*factoria(a-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(factoria(5));
    }
}
