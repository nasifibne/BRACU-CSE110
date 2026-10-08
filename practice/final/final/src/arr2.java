public class arr2 {
    public static void main(String[] args) {
        int arr[] = {1,1,5,22,98,3,54,1,5};
        boolean flag = false;
        for (int i =0 ; i<arr.length ; i++){
            for (int j=0 ; j<arr.length ; j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("dup");
        }
    }
}
