import java.util.Arrays;

public class arr37 {
    public static void main(String[] args) {
        int arr [] = {9,3,4,11,6,6,4,9,9};
        int temp[] = new int [arr.length];
        int unique=0;
        for (int i =0 ; i<arr.length ; i++){
            boolean flag = false;
            for (int j =0 ; j<unique ;j++){
                if (arr[i] == temp[j]){
                    flag = true;
                    break;
                }
            }
            if(!flag ){
                temp[unique++] = arr[i];

            }
        }
        int [] finalarr = new int [unique];
        for (int i =0 ; i<unique ; i++){
            finalarr[i] = temp[i];
        }
        System.out.println(Arrays.toString(finalarr));
    }
}
