public class arr31 {
    public static void main(String[] args) {
        int [] a ={2,55,22,44,3,9,88};
        int max = a[0];
        int min = a[0];
        for (int i =0 ; i<a.length ; i++){
            if (max<a[i]){
                max = a[i];
            }
            if (min>a[i]){
                min = a[i];
            }
        }
        int dif = max-min;
        System.out.println(max);
        System.out.println(min);
        System.out.println(dif);

    }
}
