import java.util.Arrays;

public class arr21 {
    public static void main(String[] args) {
        int [] a = {3,2,5,85,5,2,2};
        int b [] = {88,85,55,99,633,44};
        int [] newar = new int [a.length+b.length];
        int k =0;
        for (int i =0 ; i<a.length ; i++){
            newar[k++] = a[i];
        }
        for (int i=0 ; i<b.length ; i++){
            newar[k++] = b[i];
        }
        System.out.println(Arrays.toString(newar));
    }
}
