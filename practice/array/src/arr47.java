import java.util.Arrays;

public class arr47 {
    public static void main(String[] args) {
        int [] a = {22,55,55,22,44,66,33,99};
        int [] newa = new int [a.length];
        newa [0] = a[0];
        for (int i=1 ; i<a.length ;i++){
            int sum =a[i]+ a[i-1] ;
            newa[i] = sum;

        }
        System.out.println(Arrays.toString(newa));
    }
}
