package array.src;

public class arra5 {
    public static void main(String[] args) {
        int [] a = {6,4,34,3,5,2,6,43};
        //7
        for(int i =a.length-1 ; i>=0 ; i--){
            System.out.println(a[i]);
        }
        //8
        int sum=0;
        for (int i =0 ; i<a.length ; i++){
            sum +=a[i];
        }
        System.out.println(sum);
        //9
        double avg = (double) sum /a.length;
        System.out.println(avg);
        //10
        int even=0 , odd=0;
        for (int i =0 ; i<a.length ;i++){
            if(a[i]%2==0){
                even ++;
            }
            else {
                odd++;
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
}
