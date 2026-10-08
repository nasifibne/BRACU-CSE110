public class met6 {
    public static double avg (int a []){
        double sum =0;
        double avg=0;
        for (int i =0 ; i<a.length ; i++){
            sum +=a[i];
        }
        return  (sum/a.length);

    }

    public static void main(String[] args) {
        int [] arr = {5,2,8,9,3,4,6,5};
        System.out.println(avg(arr));
    }
}
