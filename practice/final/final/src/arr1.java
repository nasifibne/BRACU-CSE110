public class arr1 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 44, -3, 4, 5, -1, 2};
        int min = arr[0];
        int ind = 0;
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min = arr[i];
                ind =i;
            }
        }
        System.out.printf("minimun value is %d at index %d",min,ind);
    }
}
