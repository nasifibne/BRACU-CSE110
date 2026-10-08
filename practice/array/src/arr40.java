public class arr40 {
    public static void main(String[] args) {
        int a [] = {10,20,30,45};
        int sum =0;
        for (int i =0 ; i<a.length ; i++){
            sum +=a[i];
        }
        double avg = (double) sum/a.length;
        System.out.println(avg);
        int count =0;
        for (int i =0 ; i<a.length ; i++){
            if (a[i]>avg){
                count++;
            }
        }
        System.out.println(count);
    }

}
