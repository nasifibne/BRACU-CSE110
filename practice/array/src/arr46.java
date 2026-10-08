import java.util.Arrays;

public class arr46 {
        public static void main(String[] args) {
            int arr [] = {2,3,4,11,6,6,4,9,9};
            int temp[] = new int [arr.length];

            for (int i =0 ; i<arr.length ; i++){
                for (int j =i+1 ; j<arr.length ;j++){
                    if (arr[i] == arr[j]){
                        System.out.println(arr[i]);
                    }
                }
            }

        }


}
