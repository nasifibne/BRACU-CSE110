public class task7 {
    public static void main(String[] args) {
        int arr[] = {6, 13, 28, 17, 3, 9, 11, 23, 10, 29, 12, 7};
        System.out.println("prime");
        for (int i =0 ; i<arr.length ; i++){
            boolean isPrime= true;
            for (int j=2; j<arr[i] ; j++){
                if(arr[i]%j==0){
                    isPrime= false;
                    break;
                }
            }
            if(isPrime){
             //   System.out.println("prime number");
                System.out.println(i + " " + arr[i]);
            }
        }
        System.out.println("perfect");
        for(int i=0 ; i<arr.length ; i++){
            int sum =0;
            for (int j=1 ; j<arr[i] ; j++){
                if (arr[i] % j ==0){
                    sum +=j;
                }
            }
            if(sum==arr[i]){
                System.out.println(i+ " " + arr[i]);
            }
        }
    }
}
