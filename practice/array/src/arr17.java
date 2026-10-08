import java.util.Arrays;

public class arr17 {
    public static void main(String[] args) {
        int [] a = {4,324,3,23,523,345,12,24,56,32,5};
        for (int i=0 ; i<a.length-1 ; i++){
            for (int j =0 ; j<a.length-1 ; j++){
                if(a[j] < a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
