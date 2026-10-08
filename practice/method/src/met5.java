public class met5 {
    public static int sum (int [] a){
        int sum=0;
        for (int i=0 ; i<a.length ; i++){
            sum +=a[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int [] arr = {5,2,8,9,3,4,6,5};
        int result = sum(arr);
        System.out.println(result);
    }
}
