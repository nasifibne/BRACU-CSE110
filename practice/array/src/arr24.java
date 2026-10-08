public class arr24 {
    public static void main(String[] args) {
        int arr [] = {2,5,8,9,6,3};
        int arr1[] = {2,5,8,9,6,3,10};
        boolean flag = true;

        for (int i =0 ; i<arr.length ; i++){
            if(arr.length != arr1.length){
                flag = false;
                break;
            }
            else if(arr[i] != arr1[i]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("same");
        }
        else {
            System.out.println("not same");
        }
    }
}
